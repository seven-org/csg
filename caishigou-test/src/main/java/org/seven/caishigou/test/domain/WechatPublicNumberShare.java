package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_wechat_public_number_share database table.
 * 
 */
@Entity
@Table(name="t_wechat_public_number_share")
@NamedQuery(name="WechatPublicNumberShare.findAll", query="SELECT w FROM WechatPublicNumberShare w")
public class WechatPublicNumberShare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="activity_id")
	private Integer activityId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String dataUrl;

	private String desc;

	private String imgUrl;

	private String link;

	private String title;

	private String type;

	public WechatPublicNumberShare() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDataUrl() {
		return this.dataUrl;
	}

	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}