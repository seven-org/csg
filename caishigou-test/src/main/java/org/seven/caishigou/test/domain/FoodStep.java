package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_step database table.
 * 
 */
@Entity
@Table(name="t_food_step")
@NamedQuery(name="FoodStep.findAll", query="SELECT f FROM FoodStep f")
public class FoodStep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="food_id")
	private Integer foodId;

	@Column(name="order_num")
	private Integer orderNum;

	private String photo;

	private String remark;

	public FoodStep() {
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

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}