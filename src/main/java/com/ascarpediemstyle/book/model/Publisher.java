package com.ascarpediemstyle.book.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the publisher database table.
 * 
 */
@Entity
@NamedQuery(name="Publisher.findAll", query="SELECT p FROM Publisher p")
public class Publisher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="publisher_id")
	private Integer publisherId;

	@Column(name="order_by")
	private Integer orderBy;

	@Column(name="publisher_name")
	private String publisherName;

	public Publisher() {
	}

	public Integer getPublisherId() {
		return this.publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public Integer getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	public String getPublisherName() {
		return this.publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

}