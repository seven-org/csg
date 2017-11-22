package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_shoppingcart database table.
 * 
 */
@Entity
@Table(name="t_shoppingcart")
@NamedQuery(name="Shoppingcart.findAll", query="SELECT s FROM Shoppingcart s")
public class Shoppingcart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private BigDecimal amount;

	@Column(name="amount_unit_id")
	private Integer amountUnitId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="food_market_id")
	private Integer foodMarketId;

	@Column(name="item_id")
	private Integer itemId;

	@Column(name="stall_id")
	private Integer stallId;

	@Column(name="user_id")
	private Integer userId;

	public Shoppingcart() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getAmountUnitId() {
		return this.amountUnitId;
	}

	public void setAmountUnitId(int amountUnitId) {
		this.amountUnitId = amountUnitId;
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

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Integer getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}