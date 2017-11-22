package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_round database table.
 * 
 */
@Entity
@Table(name="t_food_round")
@NamedQuery(name="FoodRound.findAll", query="SELECT f FROM FoodRound f")
public class FoodRound implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="food_id")
	private Integer foodId;

	private String photo;

	public FoodRound() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getFoodId() {
		return this.foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}