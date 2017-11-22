package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hot_search database table.
 * 
 */
@Entity
@Table(name="t_hot_search")
@NamedQuery(name="HotSearch.findAll", query="SELECT h FROM HotSearch h")
public class HotSearch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private byte flag;

	@Column(name="food_market_id")
	private Integer foodMarketId;

	@Column(name="search_name")
	private String searchName;

	public HotSearch() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public Integer getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

}