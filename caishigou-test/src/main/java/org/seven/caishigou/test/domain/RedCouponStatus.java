package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_red_coupon_status database table.
 * 
 */
@Entity
@Table(name="t_red_coupon_status")
@NamedQuery(name="RedCouponStatus.findAll", query="SELECT r FROM RedCouponStatus r")
public class RedCouponStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="coupon_code")
	private String couponCode;

	private Integer flag;

	@Column(name="order_number")
	private String orderNumber;

	private String phone;

	public RedCouponStatus() {
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

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}