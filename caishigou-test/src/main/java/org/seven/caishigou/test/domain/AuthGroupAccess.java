package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_auth_group_access database table.
 * 
 */
@Embeddable
@Table(name="t_auth_group_access")
@NamedQuery(name="AuthGroupAccess.findAll", query="SELECT a FROM AuthGroupAccess a")
public class AuthGroupAccess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="group_id")
	private Integer groupId;

	private Integer uid;

	public AuthGroupAccess() {
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

}