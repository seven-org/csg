package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_shipping_location_log database table.
 * 
 */
@Entity
@Table(name="t_shipping_location_log")
@NamedQuery(name="ShippingLocationLog.findAll", query="SELECT s FROM ShippingLocationLog s")
public class ShippingLocationLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="current_task_id_lsit")
	private String currentTaskIdLsit;

	private String latitude;

	private String longitude;

	@Column(name="shipping_id")
	private Integer shippingId;

	public ShippingLocationLog() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCurrentTaskIdLsit() {
		return this.currentTaskIdLsit;
	}

	public void setCurrentTaskIdLsit(String currentTaskIdLsit) {
		this.currentTaskIdLsit = currentTaskIdLsit;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

}