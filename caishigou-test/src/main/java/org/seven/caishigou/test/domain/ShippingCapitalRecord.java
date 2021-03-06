package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_shipping_capital_record database table.
 * 
 */
@Entity
@Table(name="t_shipping_capital_record")
@NamedQuery(name="ShippingCapitalRecord.findAll", query="SELECT s FROM ShippingCapitalRecord s")
public class ShippingCapitalRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private BigInteger count;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private Integer operation;

	private String remark;

	@Column(name="shipping_id")
	private Integer shippingId;

	@Column(name="task_id")
	private Integer taskId;

	public ShippingCapitalRecord() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getCount() {
		return this.count;
	}

	public void setCount(BigInteger count) {
		this.count = count;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getOperation() {
		return this.operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

	public Integer getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

}