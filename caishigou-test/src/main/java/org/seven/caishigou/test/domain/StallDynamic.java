package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_stall_dynamic database table.
 * 
 */
@Entity
@Table(name="t_stall_dynamic")
@NamedQuery(name="StallDynamic.findAll", query="SELECT s FROM StallDynamic s")
public class StallDynamic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="admin_id")
	private Integer adminId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String news;

	@Column(name="photo_url")
	private String photoUrl;

	@Column(name="stall_id")
	private Integer stallId;

	public StallDynamic() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getNews() {
		return this.news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Integer getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

}