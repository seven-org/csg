package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_page database table.
 * 
 */
@Entity
@Table(name="t_page")
@NamedQuery(name="Page.findAll", query="SELECT p FROM Page p")
public class Page implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="category_id")
	private Integer categoryId;

	private Integer comments;

	@Lob
	private String content;

	private Integer createtime;

	private String flag;

	private String icon;

	private String image;

	private String keywords;

	private String status;

	private String title;

	private Integer updatetime;

	private Integer views;

	private Integer weigh;

	public Page() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public Integer getWeigh() {
		return this.weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

}