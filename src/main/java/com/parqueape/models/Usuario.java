package com.parqueape.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.parqueape.util.EnumRole;

@Entity
@Table(name="TB_USUARIO")
public class Usuario implements Serializable {
	
	public Usuario() {
	}	

	public static Usuario create(
		EnumRole role,
		String email,
		String password,
		Date createAt
	) {
		Usuario obj = new Usuario();
		obj.role = role;
		obj.email = email;
		obj.password = password;
		obj.isActive = "1";
		obj.createAt = createAt;
		return obj;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private EnumRole role;
	
	@Column(length=50)
	private String email;
	
	private String password;
	
	@Column(length=1, columnDefinition="CHAR")
	private String isActive;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EnumRole getRole() {
		return role;
	}

	public void setRole(EnumRole role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	

}
