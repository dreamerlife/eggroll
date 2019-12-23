package com.webank.eggroll.core

import java.util.concurrent.atomic.AtomicBoolean

import com.webank.eggroll.core.util.Logging

import scala.collection.mutable.ArrayBuffer

trait Bootstrap {
  def init(args: Array[String]): Unit
  def start():Unit
}

object Bootstrap extends Logging {
  val stopped = new AtomicBoolean(false)
  def main(args: Array[String]): Unit =  this.synchronized {
    var bs = Array[String]()
    val newArgs = ArrayBuffer[String]()
    var i = 0
    var ignoreRebind = false

    while (i < args.length) {
      if(args(i) == "--bootstraps" && i < args.length - 1) {
        bs = args(i + 1).split(",")
        i += 1
      } else if (args(i) == "--ignore-rebind") {
        ignoreRebind = true
      } else {
        newArgs.append(args(i))
      }
      i += 1
    }
    if (bs.isEmpty || bs.head.isEmpty) {
      throw new IllegalArgumentException("error args, example: -b com.webank.eggroll.Clz1,com.webank.eggroll.Clz2")
    }

    for(b <- bs) {
      val obj = Class.forName(b).newInstance().asInstanceOf[Bootstrap]
      obj.init(newArgs.toArray)
      try {
        obj.start()
      } catch {
        case be: java.io.IOException =>
          if(be.getCause.isInstanceOf[java.net.BindException] && args.length > 1) {
            val msg = s"${b} rebind failed: ${be.getMessage}"
            if (ignoreRebind) logInfo(s"${msg} but '--ignore-rebind' is on") else logWarning(msg)
          } else {
            throw be
          }
      }
    }

    while (!stopped.get()) {
      this.wait()
    }
  }
}
