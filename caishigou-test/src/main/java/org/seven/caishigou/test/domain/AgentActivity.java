package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_agent_activity database table.
 * 
 */
@Entity
@Table(name="t_agent_activity")
@NamedQuery(name="AgentActivity.findAll", query="SELECT a FROM AgentActivity a")
public class AgentActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="activity_flag")
	private Integer activityFlag;

	@Column(name="agent_id")
	private Integer agentId;

	private Integer type;

	public AgentActivity() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getActivityFlag() {
		return this.activityFlag;
	}

	public void setActivityFlag(int activityFlag) {
		this.activityFlag = activityFlag;
	}

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}