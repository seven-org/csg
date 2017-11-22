package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_family_user database table.
 * 
 */
@Entity
@Table(name="t_family_user")
@NamedQuery(name="FamilyUser.findAll", query="SELECT f FROM FamilyUser f")
public class FamilyUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="family_id")
	private Integer familyId;

	private byte flag;

	private String nickname;

	private byte status;

	@Column(name="user_id")
	private Integer userId;

	public FamilyUser() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}