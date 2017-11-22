package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_after_sale_seller database table.
 * 
 */
@Entity
@Table(name="t_after_sale_seller")
@NamedQuery(name="AfterSaleSeller.findAll", query="SELECT a FROM AfterSaleSeller a")
public class AfterSaleSeller implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="after_number")
	private String afterNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String description;

	private String photo;

	@Column(name="stall_id")
	private Integer stallId;

	private Integer status;

	public AfterSaleSeller() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAfterNumber() {
		return this.afterNumber;
	}

	public void setAfterNumber(String afterNumber) {
		this.afterNumber = afterNumber;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}