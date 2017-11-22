package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_business_cryout database table.
 * 
 */
@Entity
@Table(name="t_business_cryout")
@NamedQuery(name="BusinessCryout.findAll", query="SELECT b FROM BusinessCryout b")
public class BusinessCryout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String photo;

	@Column(name="stall_id")
	private Integer stallId;

	private byte status;

	public BusinessCryout() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}