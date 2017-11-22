package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_activity database table.
 * 
 */
@Embeddable
public class ActivityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer type;

	@Column(name="activity_type")
	private byte activityType;

	@Column(name="agent_id")
	private Integer agentId;

	public ActivityPK() {
	}
	public Integer getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getType() {
		return this.type;
	}
	public void setType(int type) {
		this.type = type;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ActivityPK)) {
			return false;
		}
		ActivityPK castOther = (ActivityPK)other;
		return 
			(this.id == castOther.id)
			&& (this.type == castOther.type)
			&& (this.activityType == castOther.activityType)
			&& (this.agentId == castOther.agentId);
	}

	public int hashCode() {
		final Integer prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.type;
		hash = hash * prime + ((int) this.activityType);
		hash = hash * prime + this.agentId;
		
		return hash;
	}
}