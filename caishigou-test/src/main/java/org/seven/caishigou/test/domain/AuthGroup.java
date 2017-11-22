package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_auth_group database table.
 * 
 */
@Entity
@Table(name="t_auth_group")
@NamedQuery(name="AuthGroup.findAll", query="SELECT a FROM AuthGroup a")
public class AuthGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer createtime;

	private String name;

	private Integer pid;

	@Lob
	private String rules;

	private String status;

	private Integer updatetime;

	public AuthGroup() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(int createtime) {
		this.createtime = createtime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getRules() {
		return this.rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

}