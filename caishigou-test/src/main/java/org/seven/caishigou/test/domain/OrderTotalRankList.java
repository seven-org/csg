package org.seven.caishigou.test.domain;

import java.io.Serializable;
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
 * The persistent class for the v_order_total_rank_list database table.
 * 
 */
@Entity
@Table(name="v_order_total_rank_list")
@NamedQuery(name="OrderTotalRankList.findAll", query="SELECT o FROM OrderTotalRankList o")
public class OrderTotalRankList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ordernumber")
	private String orderNumber;
	
	@Column(name="agentid")
	private Integer agentId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createtime")
	private Date createTime;

	@Column(name="goodspicture")
	private String goodsPicture;

	@Column(name="goodsprice")
	private BigInteger goodsPrice;

	@Column(name="goodstitle")
	private String goodsTitle;

	public OrderTotalRankList() {
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

	public String getGoodsPicture() {
		return this.goodsPicture;
	}

	public void setGoodsPicture(String goodsPicture) {
		this.goodsPicture = goodsPicture;
	}

	public BigInteger getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(BigInteger goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

}