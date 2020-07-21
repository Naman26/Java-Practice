package com.codeforce.CRUDdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeforce.CRUDdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findByLastName(String fd);
}
