package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_goods database table.
 * 
 */
@Entity
@Table(name="t_goods")
@NamedQuery(name="Goods.findAll", query="SELECT g FROM Goods g")
public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="admin_id")
	private Integer adminId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private Integer flag;

	@Column(name="goods_name")
	private String goodsName;

	@Column(name="goods_photo")
	private String goodsPhoto;

	@Column(name="goods_type_id")
	private Integer goodsTypeId;

	private String introduction;

	public Goods() {
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

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPhoto() {
		return this.goodsPhoto;
	}

	public void setGoodsPhoto(String goodsPhoto) {
		this.goodsPhoto = goodsPhoto;
	}

	public Integer getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(int goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

}