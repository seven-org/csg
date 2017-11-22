package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_after_sale_financial database table.
 * 
 */
@Entity
@Table(name="t_after_sale_financial")
@NamedQuery(name="AfterSaleFinancial.findAll", query="SELECT a FROM AfterSaleFinancial a")
public class AfterSaleFinancial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="after_sale_number")
	private String afterSaleNumber;

	@Column(name="agent_name")
	private String agentName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="food_market_name")
	private String foodMarketName;

	@Column(name="order_goods_id")
	private Integer orderGoodsId;

	@Column(name="order_goods_price")
	private Integer orderGoodsPrice;

	@Column(name="stall_name")
	private String stallName;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_phone")
	private String userPhone;

	public AfterSaleFinancial() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAfterSaleNumber() {
		return this.afterSaleNumber;
	}

	public void setAfterSaleNumber(String afterSaleNumber) {
		this.afterSaleNumber = afterSaleNumber;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getFoodMarketName() {
		return this.foodMarketName;
	}

	public void setFoodMarketName(String foodMarketName) {
		this.foodMarketName = foodMarketName;
	}

	public Integer getOrderGoodsId() {
		return this.orderGoodsId;
	}

	public void setOrderGoodsId(int orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	public Integer getOrderGoodsPrice() {
		return this.orderGoodsPrice;
	}

	public void setOrderGoodsPrice(int orderGoodsPrice) {
		this.orderGoodsPrice = orderGoodsPrice;
	}

	public String getStallName() {
		return this.stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}