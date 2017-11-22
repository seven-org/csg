package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_coupon database table.
 * 
 */
@Entity
@Table(name="t_coupon")
@NamedQuery(name="Coupon.findAll", query="SELECT c FROM Coupon c")
public class Coupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="coupon_amount")
	private BigInteger couponAmount;

	@Column(name="coupon_code")
	private String couponCode;

	@Column(name="coupon_name")
	private String couponName;

	@Column(name="coupon_type")
	private Integer couponType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private BigInteger discount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	private byte flag;

	@Column(name="foodmarket_id")
	private Integer foodmarketId;

	@Column(name="out_date")
	private Integer outDate;

	@Column(name="rechargecard_id")
	private Integer rechargecardId;

	@Column(name="stall_type")
	private Integer stallType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	private Integer status;

	@Column(name="total_circulation")
	private Integer totalCirculation;

	@Column(name="users_amount")
	private Integer usersAmount;

	public Coupon() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getCouponAmount() {
		return this.couponAmount;
	}

	public void setCouponAmount(BigInteger couponAmount) {
		this.couponAmount = couponAmount;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponName() {
		return this.couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Integer getCouponType() {
		return this.couponType;
	}

	public void setCouponType(int couponType) {
		this.couponType = couponType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigInteger discount) {
		this.discount = discount;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public Integer getFoodmarketId() {
		return this.foodmarketId;
	}

	public void setFoodmarketId(int foodmarketId) {
		this.foodmarketId = foodmarketId;
	}

	public Integer getOutDate() {
		return this.outDate;
	}

	public void setOutDate(int outDate) {
		this.outDate = outDate;
	}

	public Integer getRechargecardId() {
		return this.rechargecardId;
	}

	public void setRechargecardId(int rechargecardId) {
		this.rechargecardId = rechargecardId;
	}

	public Integer getStallType() {
		return this.stallType;
	}

	public void setStallType(int stallType) {
		this.stallType = stallType;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getTotalCirculation() {
		return this.totalCirculation;
	}

	public void setTotalCirculation(int totalCirculation) {
		this.totalCirculation = totalCirculation;
	}

	public Integer getUsersAmount() {
		return this.usersAmount;
	}

	public void setUsersAmount(int usersAmount) {
		this.usersAmount = usersAmount;
	}

}