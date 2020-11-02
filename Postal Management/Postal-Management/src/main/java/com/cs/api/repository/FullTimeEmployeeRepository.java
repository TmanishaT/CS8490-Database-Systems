package com.cs.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.api.entity.FullTimeEmployee;

@Repository
public interface FullTimeEmployeeRepository extends JpaRepository<FullTimeEmployee, Integer>{
	List<FullTimeEmployee> findByName(String name);
}
