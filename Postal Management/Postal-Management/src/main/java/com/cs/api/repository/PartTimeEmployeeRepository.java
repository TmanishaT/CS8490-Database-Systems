package com.cs.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.api.entity.PartTimeEmployee;

@Repository
public interface PartTimeEmployeeRepository extends JpaRepository<PartTimeEmployee, Integer>{

}
