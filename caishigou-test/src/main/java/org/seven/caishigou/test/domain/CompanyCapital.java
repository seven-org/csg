package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_company_capital database table.
 * 
 */
@Entity
@Table(name="t_company_capital")
@NamedQuery(name="CompanyCapital.findAll", query="SELECT c FROM CompanyCapital c")
public class CompanyCapital implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="capital_money")
	private BigInteger capitalMoney;

	@Column(name="company_id")
	private String companyId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="payment_type")
	private Integer paymentType;

	@Column(name="trade_no")
	private String tradeNo;

	private Integer type;

	public CompanyCapital() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getCapitalMoney() {
		return this.capitalMoney;
	}

	public void setCapitalMoney(BigInteger capitalMoney) {
		this.capitalMoney = capitalMoney;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

}