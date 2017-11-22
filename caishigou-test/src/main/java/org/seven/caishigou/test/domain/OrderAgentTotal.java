package org.seven.caishigou.test.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the v_order_agent_total database table.
 * 
 */
@Entity
@Table(name="v_order_agent_total")
@NamedQuery(name="OrderAgentTotal.findAll", query="SELECT o FROM OrderAgentTotal o")
public class OrderAgentTotal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="agentid")
	private Integer agentId;

	@Column(name="couponpriceamount")
	private BigDecimal couponPriceAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createtime")
	private Date createTime;

	@Column(name="managerid")
	private Integer managerId;

	@Column(name="managername")
	private String managerName;

	@Column(name="managerpicture")
	private String managerPicture;

	@Column(name="marketid")
	private Integer marketId;

	@Column(name="marketname")
	private String marketName;

	@Column(name="marketpicture")
	private String marketPicture;

	@Id
	@Column(name="ordernumber")
	private String orderNumber;

	@Column(name="sellertotalamount")
	private double sellerTotalAmount;

	@Column(name="shippingid")
	private Integer shippingId;

	@Column(name="shippingname")
	private String shippingName;

	@Column(name="shippingpicture")
	private String shippingPicture;

	@Column(name="shippingtotalamount")
	private double shippingTotalAmount;

	@Column(name="totalamount")
	private BigInteger totalAmount;

	public OrderAgentTotal() {
	}

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public BigDecimal getCouponPriceAmount() {
		return this.couponPriceAmount;
	}

	public void setCouponPriceAmount(BigDecimal couponPriceAmount) {
		this.couponPriceAmount = couponPriceAmount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPicture() {
		return this.managerPicture;
	}

	public void setManagerPicture(String managerPicture) {
		this.managerPicture = managerPicture;
	}

	public Integer getMarketId() {
		return this.marketId;
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	public String getMarketName() {
		return this.marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getMarketPicture() {
		return this.marketPicture;
	}

	public void setMarketPicture(String marketPicture) {
		this.marketPicture = marketPicture;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getSellerTotalAmount() {
		return this.sellerTotalAmount;
	}

	public void setSellerTotalAmount(double sellerTotalAmount) {
		this.sellerTotalAmount = sellerTotalAmount;
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

	public String getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public String getShippingPicture() {
		return this.shippingPicture;
	}

	public void setShippingPicture(String shippingPicture) {
		this.shippingPicture = shippingPicture;
	}

	public double getShippingTotalAmount() {
		return this.shippingTotalAmount;
	}

	public void setShippingTotalAmount(double shippingTotalAmount) {
		this.shippingTotalAmount = shippingTotalAmount;
	}

	public BigInteger getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigInteger totalAmount) {
		this.totalAmount = totalAmount;
	}

}