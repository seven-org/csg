package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_system_mail database table.
 * 
 */
@Entity
@Table(name="t_system_mail")
@NamedQuery(name="SystemMail.findAll", query="SELECT s FROM SystemMail s")
public class SystemMail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expired_time")
	private Date expiredTime;

	@Column(name="to_type")
	private Integer toType;

	private Integer type;

	private String value;

	public SystemMail() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public Integer getToType() {
		return this.toType;
	}

	public void setToType(int toType) {
		this.toType = toType;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}