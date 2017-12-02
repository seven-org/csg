package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_user_coupon database table.
 * 
 */
@Entity
@Table(name="t_user_coupon")
@NamedQuery(name="UserCoupon.findAll", query="SELECT u FROM UserCoupon u")
public class UserCoupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="coupon_code")
	private String couponCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private Integer status;

//	@Column(name="user_id")
//	private Integer userId;
	
	/*
	 * 
	 */
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public UserCoupon() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public Integer getUserId() {
//		return this.userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

}