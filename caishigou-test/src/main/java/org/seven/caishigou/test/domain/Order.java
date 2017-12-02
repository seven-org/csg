package org.seven.caishigou.test.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the t_order database table.
 * 
 */
@Entity
@Table(name="t_order")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@JsonIgnore
	private Integer id;

	private String address;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="confirm_time")
	private Date confirmTime;

	@Column(name="coupon_code")
	private String couponCode;

	@Column(name="coupon_price")
	private BigInteger couponPrice;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="estimate_amount")
	private BigInteger estimateAmount;

	@Column(name="estimate_amount_price")
	private BigInteger estimateAmountPrice;

	@Column(name="estimate_count")
	private BigDecimal estimateCount;

	@Column(name="evaluate_message")
	private String evaluateMessage;

	private Integer flag;

	@Column(name="food_market_id")
	private Integer foodMarketId;

	@Column(name="food_market_name")
	private String foodMarketName;

	@Column(name="food_market_photo")
	private String foodMarketPhoto;

	@Column(name="incubator_price")
	private BigInteger incubatorPrice;

	@Column(name="is_incubator")
	private Integer isIncubator;

	@Column(name="is_reminder")
	private Integer isReminder;

	@Column(name="is_urgent")
	private Integer isUrgent;

	@Column(name="manager_id")
	private Integer managerId;

	@Column(name="manager_phone")
	private String managerPhone;

	private Integer oos;

	@Column(name="oos_price")
	private BigInteger oosPrice;

//	@Id
	@Column(name="order_number")
	private String orderNumber;

	@Column(name="order_status")
	private Integer orderStatus;

	@Column(name="order_status_details")
	private Integer orderStatusDetails;

	@Column(name="pay_code")
	private String payCode;

	@Column(name="pay_money_status")
	private Integer payMoneyStatus;

	@Column(name="pay_name")
	private String payName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pay_time")
	private Date payTime;

	private String phone;

	@Column(name="receiver_location")
	private String receiverLocation;

	private String remark;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reminder_manager_time")
	private Date reminderManagerTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reminder_time")
	private Date reminderTime;

	@Column(name="remindstall")
	private Integer remindStall;

	@Column(name="sent_time")
	private Integer sentTime;

	@Column(name="shipping_id")
	private Integer shippingId;

	@Column(name="shipping_name")
	private String shippingName;

	@Column(name="shipping_price")
	private BigInteger shippingPrice;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="shipping_time")
	private Date shippingTime;

	@Column(name="shortage_status")
	private Integer shortageStatus;

	@Column(name="total_amount")
	private BigInteger totalAmount;

	@Column(name="total_count")
	private BigDecimal totalCount;

	@Column(name="trade_no")
	private String tradeNo;

	@Column(name="urgent_price")
	private BigInteger urgentPrice;

	@Column(name="user_id")
	private Integer userId;

	@Column(name="user_name")
	private String userName;

	@Column(name="weigh_price")
	private BigInteger weighPrice;

	@Column(name="weighing_confirm")
	private Integer weighingConfirm;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_number", referencedColumnName = "order_number")
	private Set<OrderGoods> orderGoodses;

	public Order() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public BigInteger getCouponPrice() {
		return this.couponPrice;
	}

	public void setCouponPrice(BigInteger couponPrice) {
		this.couponPrice = couponPrice;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getEstimateAmount() {
		return this.estimateAmount;
	}

	public void setEstimateAmount(BigInteger estimateAmount) {
		this.estimateAmount = estimateAmount;
	}

	public BigInteger getEstimateAmountPrice() {
		return this.estimateAmountPrice;
	}

	public void setEstimateAmountPrice(BigInteger estimateAmountPrice) {
		this.estimateAmountPrice = estimateAmountPrice;
	}

	public BigDecimal getEstimateCount() {
		return this.estimateCount;
	}

	public void setEstimateCount(BigDecimal estimateCount) {
		this.estimateCount = estimateCount;
	}

	public String getEvaluateMessage() {
		return this.evaluateMessage;
	}

	public void setEvaluateMessage(String evaluateMessage) {
		this.evaluateMessage = evaluateMessage;
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

	public String getFoodMarketName() {
		return this.foodMarketName;
	}

	public void setFoodMarketName(String foodMarketName) {
		this.foodMarketName = foodMarketName;
	}

	public String getFoodMarketPhoto() {
		return this.foodMarketPhoto;
	}

	public void setFoodMarketPhoto(String foodMarketPhoto) {
		this.foodMarketPhoto = foodMarketPhoto;
	}

	public BigInteger getIncubatorPrice() {
		return this.incubatorPrice;
	}

	public void setIncubatorPrice(BigInteger incubatorPrice) {
		this.incubatorPrice = incubatorPrice;
	}

	public Integer getIsIncubator() {
		return this.isIncubator;
	}

	public void setIsIncubator(int isIncubator) {
		this.isIncubator = isIncubator;
	}

	public Integer getIsReminder() {
		return this.isReminder;
	}

	public void setIsReminder(int isReminder) {
		this.isReminder = isReminder;
	}

	public Integer getIsUrgent() {
		return this.isUrgent;
	}

	public void setIsUrgent(int isUrgent) {
		this.isUrgent = isUrgent;
	}

	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerPhone() {
		return this.managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}

	public Integer getOos() {
		return this.oos;
	}

	public void setOos(int oos) {
		this.oos = oos;
	}

	public BigInteger getOosPrice() {
		return this.oosPrice;
	}

	public void setOosPrice(BigInteger oosPrice) {
		this.oosPrice = oosPrice;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getOrderStatusDetails() {
		return this.orderStatusDetails;
	}

	public void setOrderStatusDetails(int orderStatusDetails) {
		this.orderStatusDetails = orderStatusDetails;
	}

	public String getPayCode() {
		return this.payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public Integer getPayMoneyStatus() {
		return this.payMoneyStatus;
	}

	public void setPayMoneyStatus(int payMoneyStatus) {
		this.payMoneyStatus = payMoneyStatus;
	}

	public String getPayName() {
		return this.payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReceiverLocation() {
		return this.receiverLocation;
	}

	public void setReceiverLocation(String receiverLocation) {
		this.receiverLocation = receiverLocation;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getReminderManagerTime() {
		return this.reminderManagerTime;
	}

	public void setReminderManagerTime(Date reminderManagerTime) {
		this.reminderManagerTime = reminderManagerTime;
	}

	public Date getReminderTime() {
		return this.reminderTime;
	}

	public void setReminderTime(Date reminderTime) {
		this.reminderTime = reminderTime;
	}

	public Integer getRemindStall() {
		return this.remindStall;
	}

	public void setRemindStall(int remindStall) {
		this.remindStall = remindStall;
	}

	public Integer getSentTime() {
		return this.sentTime;
	}

	public void setSentTime(int sentTime) {
		this.sentTime = sentTime;
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

	public String getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public BigInteger getShippingPrice() {
		return this.shippingPrice;
	}

	public void setShippingPrice(BigInteger shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public Date getShippingTime() {
		return this.shippingTime;
	}

	public void setShippingTime(Date shippingTime) {
		this.shippingTime = shippingTime;
	}

	public Integer getShortageStatus() {
		return this.shortageStatus;
	}

	public void setShortageStatus(int shortageStatus) {
		this.shortageStatus = shortageStatus;
	}

	public BigInteger getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigInteger totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(BigDecimal totalCount) {
		this.totalCount = totalCount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public BigInteger getUrgentPrice() {
		return this.urgentPrice;
	}

	public void setUrgentPrice(BigInteger urgentPrice) {
		this.urgentPrice = urgentPrice;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigInteger getWeighPrice() {
		return this.weighPrice;
	}

	public void setWeighPrice(BigInteger weighPrice) {
		this.weighPrice = weighPrice;
	}

	public Integer getWeighingConfirm() {
		return this.weighingConfirm;
	}

	public void setWeighingConfirm(int weighingConfirm) {
		this.weighingConfirm = weighingConfirm;
	}

	public Set<OrderGoods> getOrderGoodses() {
		return orderGoodses;
	}

	public void setOrderGoodses(Set<OrderGoods> orderGoodses) {
		this.orderGoodses = orderGoodses;
	}

}