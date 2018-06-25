package com.parqueape.models;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_COCHERA")
public class Garage implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String title;

	@Column(length = 50)
	private String coordinates;

	@Column(length = 500)
	private String address;

	@Column(length = 500)
	private String photo;

	@Column(name="company_id")
	private Long companyId;

	@Column
	private Integer numberSites;
	
	@Column
	private Float pricePerHour;
	
	@Column(length = 500)
	private String description;

	public Garage() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Integer getNumberSites() {
		return numberSites;
	}

	public void setNumberSites(Integer numberSites) {
		this.numberSites = numberSites;
	}

	public Float getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Float pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}