# -*- coding: utf-8 -*-
#  Copyright (c) 2019 - now, Eggroll Authors. All Rights Reserved.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.
import argparse
import time
import unittest
from eggroll.core.session import ErSession
from eggroll.roll_pair.roll_pair import RollPairContext
from eggroll.roll_pair.test.roll_pair_test_assets import get_test_context


class TestStandalone(unittest.TestCase):

  def setUp(self):
    self.ctx = get_test_context()

  def test_parallelize(self):
    print(self.ctx.parallelize(range(15)).get_all())

  def test_get(self):
    for i in range(10):
      self.ctx.load("ns1", "n25").put(f"k{i}", f"v{i}")
      print(self.ctx.load("ns1", "n25").get(f"k{i}"))

  def test_put_all(self):
    data = [("k1", "v1"), ("k2", "v2"), ("k3", "v3"), ("k4", "v4"), ("k5", "v5"), ("k6", "v6")]
    self.ctx.load("ns1", "n36").put_all(data, options={"include_key": True})
    table =self.ctx.load("ns1", "n36").get_all()
    print("get res:{}".format(table))

  def test_get_all(self):
    table =self.ctx.load("ns1", "n23")
    print(str(table))
    res = table.__get_all_standalone()
    print(res)

  def test_count(self):
    options = {}
    options['total_partitions'] = 3
    options['include_key'] = True
    data = [("k1", "v1"), ("k2", "v2"), ("k3", "v3"), ("k4", "v4")]
    self.ctx.load('ns1', 'test_count', options=options).put_all(data, options=options)
    print("count:{}".format(self.ctx.load('ns1', 'test_count', options=options).count()))

  def test_map_values(self):
    rp = self.ctx.load("ns1", "n36")
    print(rp.map_values(lambda v: str(v) + 'mapValues').get_all())

  def test_map_partitions(self):
    data = [(str(i), i) for i in range(10)]
    rp = self.ctx.load("ns1", "test_map_partitions").put_all(data, options={"include_key": True})
    def func(iter):
      ret = []
      for k, v in iter:
        ret.append((f"{k}_{v}_0", v ** 2))
        ret.append((f"{k}_{v}_1", v ** 3))
      return ret
    print(rp.map_partitions(func).get_all())

  def test_map(self):
    rp = self.ctx.load("ns1", "n30")
    print(rp.map(lambda k, v: (k+ 'map', v + 'map')).get_all())

  def test_collapse_partitions(self):
    rp = self.ctx.load("ns1", "test_collapse_partitions").put_all(range(5))
    def f(iterator):
      sum = []
      for k, v in iterator:
        sum.append((k, v))
      return sum
    print(rp.collapse_partitions(f).get_all())

  def test_filter(self):
    rp = self.ctx.load("ns1", "test_filter").put_all(range(5))
    print(rp.filter(lambda k, v: v % 2 != 0).get_all())

  def test_flatMap(self):
    rp = self.ctx.load("ns1", "test_flat_map").put_all(range(5))
    import random
    def foo(k, v):
      result = []
      r = random.randint(10000, 99999)
      for i in range(0, k):
        result.append((k + r + i, v + r + i))
      return result
    print(rp.flat_map(foo).get_all())

  def test_glom(self):
    rp = self.ctx.load("ns1", "test_glom").put_all(range(5))
    print(rp.glom().get_all())

  def test_join(self):
    left_rp = self.ctx.load("ns1", "testJoinLeft").put_all([('a', 1), ('b', 4)], options={"include_key": True})
    right_rp = self.ctx.load("ns1", "testJoinRight").put_all([('a', 2), ('c', 4)], options={"include_key": True})
    print(left_rp.join(right_rp, lambda v1, v2: v1 + v2).get_all())

  def test_reduce(self):
    from operator import add
    rp = self.ctx.load("ns1", "testReduce").put_all(range(5))
    print(rp.reduce(add))

  def test_sample(self):
    rp = self.ctx.load("ns1", "testSample").put_all(range(100))
    print(6 <= rp.sample(0.1, 81).count() <= 14)

  def test_subtract_by_key(self):
    left_rp = self.ctx.load("namespace1206", "testSubtractByKeyLeft1206").put_all(range(10))
    right_rp = self.ctx.load("namespace1206", "testSubtractByKeyRight1206").put_all(range(5))
    print(left_rp.subtract_by_key(right_rp).get_all())

  def test_union(self):
    left_rp = self.ctx.load("namespace1206", "testUnionLeft1206").put_all([1, 2, 3])
    right_rp = self.ctx.load("namespace1206", "testUnionRight1206").put_all([(1, 1), (2, 2), (3, 3)], options={"include_key": True})
    print("left:{}".format(left_rp.get_all()))
    print("right:{}".format(right_rp.get_all()))
    print(left_rp.union(right_rp, lambda v1, v2: v1 + v2).get_all())