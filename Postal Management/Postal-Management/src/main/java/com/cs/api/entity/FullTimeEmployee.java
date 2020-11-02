package com.cs.api.entity;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("F")
public class FullTimeEmployee extends Employee{
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public FullTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
