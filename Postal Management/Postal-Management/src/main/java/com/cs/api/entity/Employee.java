package com.cs.api.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "EMPLOYEE_TYPE")
public class Employee {
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "employee_name", nullable = false, length = 255)
	private String name;

	@ElementCollection
	@CollectionTable(name = "employee_emails", joinColumns = @JoinColumn(name = "employee_id"))
	@Column(name = "emailID")
	private Set<String> emails = new HashSet<>();

	private String addreessLine;

	private String city;

	private String state;

	private String zipCode;

	private String country;

	@ElementCollection
	@CollectionTable(name = "employee_phone_numbers", joinColumns = @JoinColumn(name = "employee_id"))
	@Column(name = "phone_number")
	private Set<String> phoneNumbers = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getEmails() {
		return emails;
	}

	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}

	public String getAddreessLine() {
		return addreessLine;
	}

	public void setAddreessLine(String addreessLine) {
		this.addreessLine = addreessLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
