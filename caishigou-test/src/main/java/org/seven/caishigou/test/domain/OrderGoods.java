package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_order_goods database table.
 * 
 */
@Entity
@Table(name="t_order_goods")
@NamedQuery(name="OrderGoods.findAll", query="SELECT o FROM OrderGoods o")
public class OrderGoods implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer amount;

	@Column(name="amount_unit_id")
	private Integer amountUnitId;

	@Column(name="amount_unit_name")
	private String amountUnitName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private Integer flag;

	@Column(name="goods_id")
	private Integer goodsId;

	@Column(name="goods_image")
	private String goodsImage;

	@Column(name="goods_name")
	private String goodsName;

	@Column(name="item_id")
	private Integer itemId;

//	@Column(name="order_number")
//	private String orderNumber;
	
	/*
	 * 
	 */
//	@ManyToOne
//	@JoinColumn(name = "order_number")
//	private Order order;

	private BigInteger price;

	@Column(name="real_amount")
	private BigDecimal realAmount;

	@Column(name="stall_id")
	private Integer stallId;

	@Column(name="stall_name")
	private String stallName;

	@Column(name="stall_no")
	private String stallNo;

	@Column(name="stall_phone")
	private String stallPhone;

	private Integer status;

	@Column(name="total_amount")
	private Integer totalAmount;

	public OrderGoods() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Integer getAmountUnitId() {
		return this.amountUnitId;
	}

	public void setAmountUnitId(int amountUnitId) {
		this.amountUnitId = amountUnitId;
	}

	public String getAmountUnitName() {
		return this.amountUnitName;
	}

	public void setAmountUnitName(String amountUnitName) {
		this.amountUnitName = amountUnitName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsImage() {
		return this.goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

//	public String getOrderNumber() {
//		return this.orderNumber;
//	}
//
//	public void setOrderNumber(String orderNumber) {
//		this.orderNumber = orderNumber;
//	}

//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}

	public BigInteger getPrice() {
		return this.price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

	public BigDecimal getRealAmount() {
		return this.realAmount;
	}

	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}

	public Integer getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public String getStallName() {
		return this.stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getStallNo() {
		return this.stallNo;
	}

	public void setStallNo(String stallNo) {
		this.stallNo = stallNo;
	}

	public String getStallPhone() {
		return this.stallPhone;
	}

	public void setStallPhone(String stallPhone) {
		this.stallPhone = stallPhone;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

}