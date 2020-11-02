package com.cs.api.service;

import java.util.List;

import com.cs.api.entity.Employee;
import com.cs.api.entity.FullTimeEmployee;
import com.cs.api.entity.PartTimeEmployee;

public interface EmployeeService {

	public Employee findById(Integer id);
	public Employee findByName(String name);
	public List<Employee> findAll();
	public void deleteById(Integer id); 
	public void assignManager(Integer empployeeId, Integer managerId);
	Employee insertFullTime(FullTimeEmployee employee);
	Employee insertPartTime(PartTimeEmployee employee);
}
