package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_notice database table.
 * 
 */
@Entity
@Table(name="t_notice")
@NamedQuery(name="Notice.findAll", query="SELECT n FROM Notice n")
public class Notice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="agent_id")
	private Integer agentId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String notice;

	private String title;

	private Integer type;

	public Notice() {
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

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}