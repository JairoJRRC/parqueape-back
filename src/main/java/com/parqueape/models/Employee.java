package com.parqueape.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "TB_CLIENTE")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	@Temporal(TemporalType.DATE)
	private Date dateEntry;

	@Column(precision = 2)
	private Float salary;

	@Column
	@Temporal(TemporalType.DATE)
	private Date dateRetirement;

	@Column
	private String state;

	@Column
	private String turn;

	@Column
	private String bankAccountNumber;

	@Column(length = 50)
	private String names;

	@Column(length = 50)
	private String lastNames;

	@Column
	private String typeDoc;

	@Column(length = 20)
	private String numDoc;

	@Column
	@Type(type = "text")
	private String photo;

	@Column
	private Long companyId;

	@Column
	private Long userId;

	public Employee() {
	}
}