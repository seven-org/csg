package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_food_market_comment database table.
 * 
 */
@Entity
@Table(name="t_food_market_comment")
@NamedQuery(name="FoodMarketComment.findAll", query="SELECT f FROM FoodMarketComment f")
public class FoodMarketComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer anonymous;

	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="food_market_id")
	private Integer foodMarketId;

	@Column(name="goods_score")
	private BigDecimal goodsScore;

	@Column(name="label_id")
	private Integer labelId;

	@Column(name="packing_score")
	private BigDecimal packingScore;

	@Column(name="sent_score")
	private BigDecimal sentScore;

	@Column(name="user_id")
	private Integer userId;

	public FoodMarketComment() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(int anonymous) {
		this.anonymous = anonymous;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public BigDecimal getGoodsScore() {
		return this.goodsScore;
	}

	public void setGoodsScore(BigDecimal goodsScore) {
		this.goodsScore = goodsScore;
	}

	public Integer getLabelId() {
		return this.labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public BigDecimal getPackingScore() {
		return this.packingScore;
	}

	public void setPackingScore(BigDecimal packingScore) {
		this.packingScore = packingScore;
	}

	public BigDecimal getSentScore() {
		return this.sentScore;
	}

	public void setSentScore(BigDecimal sentScore) {
		this.sentScore = sentScore;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}