package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_market_stall database table.
 * 
 */
@Entity
@Table(name="t_food_market_stall")
@NamedQuery(name="FoodMarketStall.findAll", query="SELECT f FROM FoodMarketStall f")
public class FoodMarketStall implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="food_market_id")
	private Integer foodMarketId;

	@Column(name="stall_id")
	private Integer stallId;

	public FoodMarketStall() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public Integer getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

}