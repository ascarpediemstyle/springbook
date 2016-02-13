package com.ascarpediemstyle.book.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pserion database table.
 * 
 */
@Entity
@NamedQuery(name="Pserion.findAll", query="SELECT p FROM Pserion p")
public class Pserion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="person_id")
	private Integer personId;

	@Column(name="person_name")
	private String personName;

	public Pserion() {
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}