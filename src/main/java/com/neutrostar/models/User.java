package com.neutrostar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Email(message = "Please provide a valid email")
	@NotEmpty(message = "Can not be empty")
	private String email;
	
	@NotEmpty(message = "Can not be empty")
	private String name;
	
	@NotEmpty(message = "Can not be empty")
	private String lastName;
	
	@NotEmpty(message = "Can not be empty")
	@Length(min = 5, message = "You nedd to provide a password that contains at least 5 characters")
	private String paasword;
	
	private Boolean active;

	public User() {
	}

	public User(String email, String name, String lastName, String paasword, Boolean active) {
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.paasword = paasword;
		this.active = active;
	}
	
	public User(Long id, String email, String name, String lastName, String paasword, Boolean active) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.paasword = paasword;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPaasword() {
		return paasword;
	}

	public void setPaasword(String paasword) {
		this.paasword = paasword;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
