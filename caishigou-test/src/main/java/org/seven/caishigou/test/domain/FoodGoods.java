package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_goods database table.
 * 
 */
@Entity
@Table(name="t_food_goods")
@NamedQuery(name="FoodGoods.findAll", query="SELECT f FROM FoodGoods f")
public class FoodGoods implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String amount;

	@Column(name="food_id")
	private Integer foodId;

	@Column(name="goods_id")
	private Integer goodsId;

	public FoodGoods() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Integer getFoodId() {
		return this.foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

}