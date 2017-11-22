package org.seven.caishigou.test.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the v_shipping_rank database table.
 * 
 */
@Entity
@Table(name="v_shipping_rank")
@NamedQuery(name="ShippingRank.findAll", query="SELECT s FROM ShippingRank s")
public class ShippingRank implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger g0;

	private BigInteger g1;

	private BigInteger g2;

	private BigInteger g3;

	private BigInteger g4;

	private BigInteger g5;

	private BigInteger g6;

	@Column(name="month_count")
	private BigInteger monthCount;

	@Column(name="month_income")
	private BigDecimal monthIncome;

	private BigDecimal p0;

	private BigDecimal p1;

	private BigDecimal p2;

	private BigDecimal p3;

	private BigDecimal p4;

	private BigDecimal p5;

	private BigDecimal p6;

	@Id
	@Column(name="shipping_id")
	private Integer shippingId;

	@Column(name="total_count")
	private BigInteger totalCount;

	@Column(name="total_income")
	private BigDecimal totalIncome;

	@Column(name="week_count")
	private BigInteger weekCount;

	@Column(name="week_income")
	private BigDecimal weekIncome;

	public ShippingRank() {
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

	public BigInteger getMonthCount() {
		return this.monthCount;
	}

	public void setMonthCount(BigInteger monthCount) {
		this.monthCount = monthCount;
	}

	public BigDecimal getMonthIncome() {
		return this.monthIncome;
	}

	public void setMonthIncome(BigDecimal monthIncome) {
		this.monthIncome = monthIncome;
	}

	public BigDecimal getP0() {
		return this.p0;
	}

	public void setP0(BigDecimal p0) {
		this.p0 = p0;
	}

	public BigDecimal getP1() {
		return this.p1;
	}

	public void setP1(BigDecimal p1) {
		this.p1 = p1;
	}

	public BigDecimal getP2() {
		return this.p2;
	}

	public void setP2(BigDecimal p2) {
		this.p2 = p2;
	}

	public BigDecimal getP3() {
		return this.p3;
	}

	public void setP3(BigDecimal p3) {
		this.p3 = p3;
	}

	public BigDecimal getP4() {
		return this.p4;
	}

	public void setP4(BigDecimal p4) {
		this.p4 = p4;
	}

	public BigDecimal getP5() {
		return this.p5;
	}

	public void setP5(BigDecimal p5) {
		this.p5 = p5;
	}

	public BigDecimal getP6() {
		return this.p6;
	}

	public void setP6(BigDecimal p6) {
		this.p6 = p6;
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

	public BigInteger getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(BigInteger totalCount) {
		this.totalCount = totalCount;
	}

	public BigDecimal getTotalIncome() {
		return this.totalIncome;
	}

	public void setTotalIncome(BigDecimal totalIncome) {
		this.totalIncome = totalIncome;
	}

	public BigInteger getWeekCount() {
		return this.weekCount;
	}

	public void setWeekCount(BigInteger weekCount) {
		this.weekCount = weekCount;
	}

	public BigDecimal getWeekIncome() {
		return this.weekIncome;
	}

	public void setWeekIncome(BigDecimal weekIncome) {
		this.weekIncome = weekIncome;
	}

}