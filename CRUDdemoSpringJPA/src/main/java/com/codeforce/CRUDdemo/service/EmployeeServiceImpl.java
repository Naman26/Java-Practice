package com.codeforce.CRUDdemo.service;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.codeforce.CRUDdemo.dao.EmployeeDAO;
import com.codeforce.CRUDdemo.dao.EmployeeRepository;
import com.codeforce.CRUDdemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository; 
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeDAO) {
		employeeRepository = theEmployeeDAO;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Employee> oe= employeeRepository.findById(theId); 
		Employee employee = null;
		if(oe.isPresent()) {
			employee = oe.get();
		}
		else {
			throw new RuntimeException("Did not find employee by ID "+ theId);
		}
		
		return employee;  
	}
	
	

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(theId);

	}
	@Override
	public Employee findByLastName(String fd) {
		Optional<Employee> oe = Optional.ofNullable(employeeRepository.findByLastName(fd)); 
		Employee e = null;
		if(oe.isPresent()) {
			e = oe.get();
		}
		else {
			throw new RuntimeException("Did not find employee by ID "+ fd);
		}
		
		return e; 
	}

}
