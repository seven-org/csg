package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the t_goods_special database table.
 * 
 */
@Entity
@Table(name="t_goods_special")
@NamedQuery(name="GoodsSpecial.findAll", query="SELECT g FROM GoodsSpecial g")
public class GoodsSpecial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private BigDecimal amount;

	@Column(name="goods_id")
	private Integer goodsId;

	@Column(name="original_price")
	private BigDecimal originalPrice;

	@Column(name="special_price")
	private BigDecimal specialPrice;

	public GoodsSpecial() {
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

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public BigDecimal getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getSpecialPrice() {
		return this.specialPrice;
	}

	public void setSpecialPrice(BigDecimal specialPrice) {
		this.specialPrice = specialPrice;
	}

}