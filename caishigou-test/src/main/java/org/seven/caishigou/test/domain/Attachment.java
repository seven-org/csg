package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_attachment database table.
 * 
 */
@Entity
@Table(name="t_attachment")
@NamedQuery(name="Attachment.findAll", query="SELECT a FROM Attachment a")
public class Attachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer createtime;

	private String extparam;

	private Integer filesize;

	private Integer imageframes;

	private String imageheight;

	private String imagetype;

	private String imagewidth;

	private String mimetype;

	private String sha1;

	private String storage;

	private Integer updatetime;

	private Integer uploadtime;

	private String url;

	public Attachment() {
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

	public String getExtparam() {
		return this.extparam;
	}

	public void setExtparam(String extparam) {
		this.extparam = extparam;
	}

	public Integer getFilesize() {
		return this.filesize;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	public Integer getImageframes() {
		return this.imageframes;
	}

	public void setImageframes(int imageframes) {
		this.imageframes = imageframes;
	}

	public String getImageheight() {
		return this.imageheight;
	}

	public void setImageheight(String imageheight) {
		this.imageheight = imageheight;
	}

	public String getImagetype() {
		return this.imagetype;
	}

	public void setImagetype(String imagetype) {
		this.imagetype = imagetype;
	}

	public String getImagewidth() {
		return this.imagewidth;
	}

	public void setImagewidth(String imagewidth) {
		this.imagewidth = imagewidth;
	}

	public String getMimetype() {
		return this.mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public String getSha1() {
		return this.sha1;
	}

	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}

	public String getStorage() {
		return this.storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public Integer getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getUploadtime() {
		return this.uploadtime;
	}

	public void setUploadtime(int uploadtime) {
		this.uploadtime = uploadtime;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}