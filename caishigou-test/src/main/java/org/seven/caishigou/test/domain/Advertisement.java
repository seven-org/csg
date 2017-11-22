package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_advertisement database table.
 * 
 */
@Entity
@Table(name="t_advertisement")
@NamedQuery(name="Advertisement.findAll", query="SELECT a FROM Advertisement a")
public class Advertisement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="agent_id")
	private Integer agentId;

	private byte flag;

	private String location;

	private byte status;

	public Advertisement() {
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

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}