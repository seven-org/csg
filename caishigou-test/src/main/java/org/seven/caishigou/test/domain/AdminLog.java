package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_admin_log database table.
 * 
 */
@Entity
@Table(name="t_admin_log")
@NamedQuery(name="AdminLog.findAll", query="SELECT a FROM AdminLog a")
public class AdminLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="admin_id")
	private Integer adminId;

	@Lob
	private String content;

	private Integer createtime;

	private String ip;

	private String title;

	private String url;

	private String useragent;

	private String username;

	public AdminLog() {
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(int createtime) {
		this.createtime = createtime;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUseragent() {
		return this.useragent;
	}

	public void setUseragent(String useragent) {
		this.useragent = useragent;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}