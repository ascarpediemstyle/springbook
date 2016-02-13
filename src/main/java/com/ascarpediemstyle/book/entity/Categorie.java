package com.ascarpediemstyle.book.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categorie database table.
 * 
 */
@Entity
@NamedQuery(name="Categorie.findAll", query="SELECT c FROM Categorie c")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="categorie_id")
	private Integer categorieId;

	@Column(name="categorie_name")
	private String categorieName;

	public Categorie() {
	}

	public Integer getCategorieId() {
		return this.categorieId;
	}

	public void setCategorieId(Integer categorieId) {
		this.categorieId = categorieId;
	}

	public String getCategorieName() {
		return this.categorieName;
	}

	public void setCategorieName(String categorieName) {
		this.categorieName = categorieName;
	}

}