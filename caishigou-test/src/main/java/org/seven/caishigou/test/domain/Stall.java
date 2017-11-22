package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_stall database table.
 * 
 */
@Entity
@Table(name="t_stall")
@NamedQuery(name="Stall.findAll", query="SELECT s FROM Stall s")
public class Stall implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="admin_id")
	private Integer adminId;

	@Column(name="business_name")
	private String businessName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="food_market_id")
	private Integer foodMarketId;

	@Column(name="goods_type_id")
	private String goodsTypeId;

	private String introduction;

	@Column(name="is_vip")
	private Integer isVip;

	private String phone;

	private String photo;

	@Column(name="score_count")
	private Integer scoreCount;

	@Column(name="score_sum")
	private BigDecimal scoreSum;

	@Column(name="stall_name")
	private String stallName;

	@Column(name="stall_no")
	private Integer stallNo;

	@Column(name="stall_type")
	private String stallType;

	public Stall() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getIsVip() {
		return this.isVip;
	}

	public void setIsVip(int isVip) {
		this.isVip = isVip;
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

	public String getStallName() {
		return this.stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public Integer getStallNo() {
		return this.stallNo;
	}

	public void setStallNo(int stallNo) {
		this.stallNo = stallNo;
	}

	public String getStallType() {
		return this.stallType;
	}

	public void setStallType(String stallType) {
		this.stallType = stallType;
	}

}