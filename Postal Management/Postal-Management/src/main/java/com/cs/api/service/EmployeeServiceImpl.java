package com.cs.api.service;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.api.entity.Employee;
import com.cs.api.entity.FullTimeEmployee;
import com.cs.api.entity.PartTimeEmployee;
import com.cs.api.repository.FullTimeEmployeeRepository;
import com.cs.api.repository.PartTimeEmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	FullTimeEmployeeRepository fullTimeEmployeeRepository;

	@Autowired
	PartTimeEmployeeRepository partTimeEmployeeRepository;

	@Override
	public Employee insertFullTime(FullTimeEmployee employee) {
		FullTimeEmployee _employee = new FullTimeEmployee();
		_employee.setSSN(employee.getSSN());
		_employee.setName(employee.getName());
		_employee.setAddreessLine(employee.getAddreessLine());
		_employee.setCity(employee.getCity());
		_employee.setState(employee.getState());
		_employee.setCountry(employee.getCountry());
		_employee.setZipCode(employee.getZipCode());
		_employee.setSalary(employee.getSalary());
		_employee.setEmails(new HashSet<String>(employee.getEmails()));
		_employee.setPhoneNumbers(new HashSet<Integer>(employee.getPhoneNumbers()));

		return fullTimeEmployeeRepository.save(_employee);
	}

	@Override
	public Employee insertPartTime(PartTimeEmployee employee) {
		PartTimeEmployee _employee = new PartTimeEmployee();
		_employee.setSSN(employee.getSSN());
		_employee.setName(employee.getName());
		_employee.setAddreessLine(employee.getAddreessLine());
		_employee.setCity(employee.getCity());
		_employee.setState(employee.getState());
		_employee.setCountry(employee.getCountry());
		_employee.setZipCode(employee.getZipCode());
		_employee.setHourlyRate(employee.getHourlyRate());
		_employee.setEmails(new HashSet<String>(employee.getEmails()));
		_employee.setPhoneNumbers(new HashSet<Integer>(employee.getPhoneNumbers()));

		return partTimeEmployeeRepository.save(_employee);
	}

	@Override
	public Employee findById(Integer id) {
		return null;
	}

	@Override
	public Employee findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void assignManager(Integer empployeeId, Integer managerId) {
		

	}

}
