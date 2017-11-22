package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_activity database table.
 * 
 */
@Entity
@Table(name="t_activity")
@NamedQuery(name="Activity.findAll", query="SELECT a FROM Activity a")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActivityPK id;

	private String photo;

	private String value;

	public Activity() {
	}

	public ActivityPK getId() {
		return this.id;
	}

	public void setId(ActivityPK id) {
		this.id = id;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}