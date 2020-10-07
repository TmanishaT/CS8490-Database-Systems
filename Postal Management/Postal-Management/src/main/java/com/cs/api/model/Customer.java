package com.cs.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Column(name = "ID")
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CUSTOMER_SEQ_GEN")
	@SequenceGenerator(name="CUSTOMER_SEQ_GEN", sequenceName="CUSTOMER_SEQ", allocationSize=1) 
	private Integer id;

	@Column(name = "customer_name", nullable = false, length = 255)
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
