package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_two_classify database table.
 * 
 */
@Entity
@Table(name="t_food_two_classify")
@NamedQuery(name="FoodTwoClassify.findAll", query="SELECT f FROM FoodTwoClassify f")
public class FoodTwoClassify implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="classify_name")
	private String classifyName;

	private byte flag;

	@Column(name="one_classify_id")
	private Integer oneClassifyId;

	private String photo;

	private Integer status;

	public FoodTwoClassify() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassifyName() {
		return this.classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public Integer getOneClassifyId() {
		return this.oneClassifyId;
	}

	public void setOneClassifyId(int oneClassifyId) {
		this.oneClassifyId = oneClassifyId;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}