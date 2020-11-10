package com.cs.api.service;

import java.util.List;

import com.cs.api.entity.Employee;

public interface EmployeeService {

	public Employee insert(Employee employee);

	public Employee findBySSN(Long ssn);

	public Employee findByName(String name);

	public List<Employee> findAll();

	public void deleteBySSN(Long id);
}
