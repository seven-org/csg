package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_integral_config database table.
 * 
 */
@Entity
@Table(name="t_integral_config")
@NamedQuery(name="IntegralConfig.findAll", query="SELECT i FROM IntegralConfig i")
public class IntegralConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private BigInteger integral;

	@Column(name="integral_type")
	private Integer integralType;

	private Integer percentage;

	private Integer type;

	public IntegralConfig() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getIntegral() {
		return this.integral;
	}

	public void setIntegral(BigInteger integral) {
		this.integral = integral;
	}

	public Integer getIntegralType() {
		return this.integralType;
	}

	public void setIntegralType(int integralType) {
		this.integralType = integralType;
	}

	public Integer getPercentage() {
		return this.percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}