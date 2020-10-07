package com.cs.api.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
public class PartTimeEmployee extends Employee{
	private int hourlyRate;

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
