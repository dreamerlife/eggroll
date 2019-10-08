/*
 * Copyright 2019 The Eggroll Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.ai.fate.eggroll.meta.service.dao.generated.model;

import java.io.Serializable;
import java.util.Date;

public class Node implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table node
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.node_id
     *
     * @mbg.generated
     */
    private Long nodeId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.host
     *
     * @mbg.generated
     */
    private String host;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.ip
     *
     * @mbg.generated
     */
    private String ip;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.port
     *
     * @mbg.generated
     */
    private Integer port;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.type
     *
     * @mbg.generated
     */
    private String type;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.status
     *
     * @mbg.generated
     */
    private String status;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.last_heartbeat_at
     *
     * @mbg.generated
     */
    private Date lastHeartbeatAt;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.node_id
     *
     * @return the value of node.node_id
     * @mbg.generated
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.node_id
     *
     * @param nodeId the value for node.node_id
     * @mbg.generated
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.host
     *
     * @return the value of node.host
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.host
     *
     * @param host the value for node.host
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.ip
     *
     * @return the value of node.ip
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.ip
     *
     * @param ip the value for node.ip
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.port
     *
     * @return the value of node.port
     * @mbg.generated
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.port
     *
     * @param port the value for node.port
     * @mbg.generated
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.type
     *
     * @return the value of node.type
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.type
     *
     * @param type the value for node.type
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.status
     *
     * @return the value of node.status
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.status
     *
     * @param status the value for node.status
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.last_heartbeat_at
     *
     * @return the value of node.last_heartbeat_at
     * @mbg.generated
     */
    public Date getLastHeartbeatAt() {
        return lastHeartbeatAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.last_heartbeat_at
     *
     * @param lastHeartbeatAt the value for node.last_heartbeat_at
     * @mbg.generated
     */
    public void setLastHeartbeatAt(Date lastHeartbeatAt) {
        this.lastHeartbeatAt = lastHeartbeatAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.created_at
     *
     * @return the value of node.created_at
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.created_at
     *
     * @param createdAt the value for node.created_at
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.updated_at
     *
     * @return the value of node.updated_at
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.updated_at
     *
     * @param updatedAt the value for node.updated_at
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table node
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nodeId=").append(nodeId);
        sb.append(", host=").append(host);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", lastHeartbeatAt=").append(lastHeartbeatAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table node
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Node other = (Node) that;
        return (this.getNodeId() == null ? other.getNodeId() == null : this.getNodeId().equals(other.getNodeId()))
                && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
                && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
                && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getLastHeartbeatAt() == null ? other.getLastHeartbeatAt() == null : this.getLastHeartbeatAt().equals(other.getLastHeartbeatAt()))
                && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
                && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table node
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastHeartbeatAt() == null) ? 0 : getLastHeartbeatAt().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}