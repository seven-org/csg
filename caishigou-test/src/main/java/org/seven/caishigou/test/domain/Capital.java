package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_capital database table.
 * 
 */
@Entity
@Table(name="t_capital")
@NamedQuery(name="Capital.findAll", query="SELECT c FROM Capital c")
public class Capital implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private BigDecimal amount;

	@Column(name="capital_integral")
	private BigInteger capitalIntegral;

	@Column(name="capital_money")
	private BigInteger capitalMoney;

	@Column(name="capital_type")
	private Integer capitalType;

	@Column(name="consume_type")
	private Integer consumeType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="family_id")
	private Integer familyId;

	@Column(name="market_id")
	private Integer marketId;

	@Column(name="payment_type")
	private Integer paymentType;

	@Column(name="trade_no")
	private String tradeNo;

	private Integer type;

	@Column(name="type_operation_id")
	private String typeOperationId;

	@Column(name="user_id")
	private Integer userId;

	public Capital() {
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

	public BigInteger getCapitalIntegral() {
		return this.capitalIntegral;
	}

	public void setCapitalIntegral(BigInteger capitalIntegral) {
		this.capitalIntegral = capitalIntegral;
	}

	public BigInteger getCapitalMoney() {
		return this.capitalMoney;
	}

	public void setCapitalMoney(BigInteger capitalMoney) {
		this.capitalMoney = capitalMoney;
	}

	public Integer getCapitalType() {
		return this.capitalType;
	}

	public void setCapitalType(int capitalType) {
		this.capitalType = capitalType;
	}

	public Integer getConsumeType() {
		return this.consumeType;
	}

	public void setConsumeType(int consumeType) {
		this.consumeType = consumeType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public Integer getMarketId() {
		return this.marketId;
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	public Integer getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTypeOperationId() {
		return this.typeOperationId;
	}

	public void setTypeOperationId(String typeOperationId) {
		this.typeOperationId = typeOperationId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}