package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_shipping database table.
 * 
 */
@Entity
@Table(name="t_shipping")
@NamedQuery(name="Shipping.findAll", query="SELECT s FROM Shipping s")
public class Shipping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer accept;

	@Column(name="admin_id")
	private Integer adminId;

	@Column(name="agent_id")
	private Integer agentId;

	@Temporal(TemporalType.DATE)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="current_status")
	private Integer currentStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_get_inner_mail_time")
	private Date lastGetInnerMailTime;

	private Integer level;

	@Column(name="my_assets")
	private BigInteger myAssets;

	private String password;

	private String phone;

	private String photo;

	private String rate;

	@Column(name="score_count")
	private Integer scoreCount;

	@Column(name="score_sum")
	private BigDecimal scoreSum;

	@Column(name="shipping_center_id")
	private String shippingCenterId;

	@Column(name="shipping_name")
	private String shippingName;

	private Integer status;

	private String token;

	public Shipping() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getAccept() {
		return this.accept;
	}

	public void setAccept(int accept) {
		this.accept = accept;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCurrentStatus() {
		return this.currentStatus;
	}

	public void setCurrentStatus(int currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Date getLastGetInnerMailTime() {
		return this.lastGetInnerMailTime;
	}

	public void setLastGetInnerMailTime(Date lastGetInnerMailTime) {
		this.lastGetInnerMailTime = lastGetInnerMailTime;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public BigInteger getMyAssets() {
		return this.myAssets;
	}

	public void setMyAssets(BigInteger myAssets) {
		this.myAssets = myAssets;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public Integer getScoreCount() {
		return this.scoreCount;
	}

	public void setScoreCount(int scoreCount) {
		this.scoreCount = scoreCount;
	}

	public BigDecimal getScoreSum() {
		return this.scoreSum;
	}

	public void setScoreSum(BigDecimal scoreSum) {
		this.scoreSum = scoreSum;
	}

	public String getShippingCenterId() {
		return this.shippingCenterId;
	}

	public void setShippingCenterId(String shippingCenterId) {
		this.shippingCenterId = shippingCenterId;
	}

	public String getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}