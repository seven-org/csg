package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_market_label database table.
 * 
 */
@Entity
@Table(name="t_food_market_label")
@NamedQuery(name="FoodMarketLabel.findAll", query="SELECT f FROM FoodMarketLabel f")
public class FoodMarketLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="food_market_id")
	private Integer foodMarketId;

	@Column(name="label_name")
	private String labelName;

	public FoodMarketLabel() {
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

	public String getLabelName() {
		return this.labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}