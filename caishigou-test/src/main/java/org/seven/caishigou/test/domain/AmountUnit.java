package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_amount_unit database table.
 * 
 */
@Entity
@Table(name="t_amount_unit")
@NamedQuery(name="AmountUnit.findAll", query="SELECT a FROM AmountUnit a")
public class AmountUnit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="admin_id")
	private Integer adminId;

	@Column(name="amount_unit_name")
	private String amountUnitName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="discount_price")
	private BigInteger discountPrice;

	private Integer flag;

	@Column(name="item_id")
	private Integer itemId;

	private BigInteger price;

	@Column(name="update_id")
	private Integer updateId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	public AmountUnit() {
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

	public String getAmountUnitName() {
		return this.amountUnitName;
	}

	public void setAmountUnitName(String amountUnitName) {
		this.amountUnitName = amountUnitName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getDiscountPrice() {
		return this.discountPrice;
	}

	public void setDiscountPrice(BigInteger discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public BigInteger getPrice() {
		return this.price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

	public Integer getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(int updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}