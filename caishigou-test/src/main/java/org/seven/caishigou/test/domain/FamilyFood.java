package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_family_food database table.
 * 
 */
@Entity
@Table(name="t_family_food")
@NamedQuery(name="FamilyFood.findAll", query="SELECT f FROM FamilyFood f")
public class FamilyFood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="family_id")
	private Integer familyId;

	private byte flag;

	@Column(name="food_id")
	private Integer foodId;

	private byte ifread;

	@Column(name="user_id")
	private Integer userId;

	public FamilyFood() {
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

	public Integer getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public Integer getFoodId() {
		return this.foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public byte getIfread() {
		return this.ifread;
	}

	public void setIfread(byte ifread) {
		this.ifread = ifread;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}