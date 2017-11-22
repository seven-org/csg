package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_activity_seller database table.
 * 
 */
@Entity
@Table(name="t_activity_seller")
@NamedQuery(name="ActivitySeller.findAll", query="SELECT a FROM ActivitySeller a")
public class ActivitySeller implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="activity_type")
	private byte activityType;

	@Column(name="agent_id")
	private Integer agentId;

	private String photo;

	private Integer type;

	private String value;

	public ActivitySeller() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActivityType() {
		return this.activityType;
	}

	public void setActivityType(byte activityType) {
		this.activityType = activityType;
	}

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}