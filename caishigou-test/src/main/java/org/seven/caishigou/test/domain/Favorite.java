package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_favorite database table.
 * 
 */
@Entity
@Table(name="t_favorite")
@NamedQuery(name="Favorite.findAll", query="SELECT f FROM Favorite f")
public class Favorite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="favorite_type")
	private Integer favoriteType;

	private byte flag;

	@Column(name="item_id")
	private Integer itemId;

	@Column(name="user_id")
	private Integer userId;

	public Favorite() {
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

	public Integer getFavoriteType() {
		return this.favoriteType;
	}

	public void setFavoriteType(int favoriteType) {
		this.favoriteType = favoriteType;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}