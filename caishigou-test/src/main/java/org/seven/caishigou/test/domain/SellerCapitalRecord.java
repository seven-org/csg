package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the t_seller_capital_record database table.
 * 
 */
@Entity
@Table(name="t_seller_capital_record")
@NamedQuery(name="SellerCapitalRecord.findAll", query="SELECT s FROM SellerCapitalRecord s")
public class SellerCapitalRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="capital_integral")
	private BigInteger capitalIntegral;

	@Column(name="capital_type")
	private Integer capitalType;

	private BigInteger count;

	@Column(name="create_time")
	private Timestamp createTime;

	private Integer operation;

	@Column(name="operation_number")
	private String operationNumber;

	private String remark;

	@Column(name="seller_id")
	private Integer sellerId;

	public SellerCapitalRecord() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getCapitalIntegral() {
		return this.capitalIntegral;
	}

	public void setCapitalIntegral(BigInteger capitalIntegral) {
		this.capitalIntegral = capitalIntegral;
	}

	public Integer getCapitalType() {
		return this.capitalType;
	}

	public void setCapitalType(int capitalType) {
		this.capitalType = capitalType;
	}

	public BigInteger getCount() {
		return this.count;
	}

	public void setCount(BigInteger count) {
		this.count = count;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getOperation() {
		return this.operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	public String getOperationNumber() {
		return this.operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

}