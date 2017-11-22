package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_join_family_validation database table.
 * 
 */
@Entity
@Table(name="t_join_family_validation")
@NamedQuery(name="JoinFamilyValidation.findAll", query="SELECT j FROM JoinFamilyValidation j")
public class JoinFamilyValidation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String key;

	private String sign;

	private String timestamp;

	@Column(name="user_id1")
	private Integer userId1;

	@Column(name="user_id2")
	private Integer userId2;

	public JoinFamilyValidation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getUserId1() {
		return this.userId1;
	}

	public void setUserId1(int userId1) {
		this.userId1 = userId1;
	}

	public Integer getUserId2() {
		return this.userId2;
	}

	public void setUserId2(int userId2) {
		this.userId2 = userId2;
	}

}