package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_material database table.
 * 
 */
@Entity
@Table(name="t_material")
@NamedQuery(name="Material.findAll", query="SELECT m FROM Material m")
public class Material implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String introduction;

	@Column(name="material_name")
	private String materialName;

	public Material() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

}