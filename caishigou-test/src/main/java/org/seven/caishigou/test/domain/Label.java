package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_label database table.
 * 
 */
@Entity
@Table(name="t_label")
@NamedQuery(name="Label.findAll", query="SELECT l FROM Label l")
public class Label implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="label_name")
	private String labelName;

	private Integer type;

	public Label() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabelName() {
		return this.labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}