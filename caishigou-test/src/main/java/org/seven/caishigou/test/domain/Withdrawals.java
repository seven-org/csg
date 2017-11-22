package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_withdrawals database table.
 * 
 */
@Entity
@Table(name="t_withdrawals")
@NamedQuery(name="Withdrawals.findAll", query="SELECT w FROM Withdrawals w")
public class Withdrawals implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="bank_id")
	private Integer bankId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="item_id")
	private Integer itemId;

	private BigInteger money;

	private Integer status;

	private Integer type;

	public Withdrawals() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getBankId() {
		return this.bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public BigInteger getMoney() {
		return this.money;
	}

	public void setMoney(BigInteger money) {
		this.money = money;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}