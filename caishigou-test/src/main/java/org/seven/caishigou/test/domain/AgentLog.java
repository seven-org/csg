package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_agent_log database table.
 * 
 */
@Entity
@Table(name="t_agent_log")
@NamedQuery(name="AgentLog.findAll", query="SELECT a FROM AgentLog a")
public class AgentLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="agent_id")
	private Integer agentId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String ip;

	private String operation;

	private byte type;

	public AgentLog() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}