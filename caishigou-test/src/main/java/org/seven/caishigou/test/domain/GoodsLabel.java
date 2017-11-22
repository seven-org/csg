package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_goods_label database table.
 * 
 */
@Entity
@Table(name="t_goods_label")
@NamedQuery(name="GoodsLabel.findAll", query="SELECT g FROM GoodsLabel g")
public class GoodsLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer flag;

	@Column(name="food_market_id")
	private Integer foodMarketId;

	@Column(name="label_name")
	private String labelName;

	private String photo;

	public GoodsLabel() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
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

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}