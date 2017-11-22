package org.seven.caishigou.test.domain;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the v_manager_rank database table.
 * 
 */
@Entity
@Table(name="v_manager_rank")
@NamedQuery(name="ManagerRank.findAll", query="SELECT m FROM ManagerRank m")
public class ManagerRank implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger g0;

	private BigInteger g1;

	private BigInteger g2;

	private BigInteger g3;

	private BigInteger g4;

	private BigInteger g5;

	private BigInteger g6;

	@Id
	@Column(name="manager_id")
	private Integer managerId;

	@Column(name="month_count")
	private BigInteger monthCount;

	@Column(name="total_count")
	private BigInteger totalCount;

	@Column(name="week_count")
	private BigInteger weekCount;

	public ManagerRank() {
	}

	public BigInteger getG0() {
		return this.g0;
	}

	public void setG0(BigInteger g0) {
		this.g0 = g0;
	}

	public BigInteger getG1() {
		return this.g1;
	}

	public void setG1(BigInteger g1) {
		this.g1 = g1;
	}

	public BigInteger getG2() {
		return this.g2;
	}

	public void setG2(BigInteger g2) {
		this.g2 = g2;
	}

	public BigInteger getG3() {
		return this.g3;
	}

	public void setG3(BigInteger g3) {
		this.g3 = g3;
	}

	public BigInteger getG4() {
		return this.g4;
	}

	public void setG4(BigInteger g4) {
		this.g4 = g4;
	}

	public BigInteger getG5() {
		return this.g5;
	}

	public void setG5(BigInteger g5) {
		this.g5 = g5;
	}

	public BigInteger getG6() {
		return this.g6;
	}

	public void setG6(BigInteger g6) {
		this.g6 = g6;
	}

	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public BigInteger getMonthCount() {
		return this.monthCount;
	}

	public void setMonthCount(BigInteger monthCount) {
		this.monthCount = monthCount;
	}

	public BigInteger getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(BigInteger totalCount) {
		this.totalCount = totalCount;
	}

	public BigInteger getWeekCount() {
		return this.weekCount;
	}

	public void setWeekCount(BigInteger weekCount) {
		this.weekCount = weekCount;
	}

}