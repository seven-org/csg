package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_order_status database table.
 * 
 */
@Entity
@Table(name="t_order_status")
@NamedQuery(name="OrderStatus.findAll", query="SELECT o FROM OrderStatus o")
public class OrderStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="order_string")
	private String orderString;

	public OrderStatus() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderString() {
		return this.orderString;
	}

	public void setOrderString(String orderString) {
		this.orderString = orderString;
	}

}