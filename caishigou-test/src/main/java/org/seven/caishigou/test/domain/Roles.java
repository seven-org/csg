package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_roles database table.
 * 
 */
@Entity
@Table(name="t_roles")
@NamedQuery(name="Roles.findAll", query="SELECT r FROM Roles r")
public class Roles implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String permissions;

	@Column(name="roles_name")
	private String rolesName;

	public Roles() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPermissions() {
		return this.permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public String getRolesName() {
		return this.rolesName;
	}

	public void setRolesName(String rolesName) {
		this.rolesName = rolesName;
	}

}