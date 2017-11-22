package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_stall_label database table.
 * 
 */
@Entity
@Table(name="t_stall_label")
@NamedQuery(name="StallLabel.findAll", query="SELECT s FROM StallLabel s")
public class StallLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="label_name")
	private String labelName;

	@Column(name="stall_id")
	private Integer stallId;

	public StallLabel() {
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

	public Integer getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

}