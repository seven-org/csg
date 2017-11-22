package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_family_user_name database table.
 * 
 */
@Entity
@Table(name="t_family_user_name")
@NamedQuery(name="FamilyUserName.findAll", query="SELECT f FROM FamilyUserName f")
public class FamilyUserName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="family_id")
	private Integer familyId;

	private String nickname;

	@Column(name="user_id")
	private Integer userId;

	@Column(name="users_id")
	private Integer usersId;

	public FamilyUserName() {
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

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Integer getUsersId() {
		return this.usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

}