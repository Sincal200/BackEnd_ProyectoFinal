package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.EmployeeDao;
import com.example.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> findAll() {
		return (List<Employee>)employeeDao.findAll();
	}

	@Override
	public Employee findById(Long id) {
		return employeeDao.findById(id).orElse(null);
	}

	@Override
	public Employee create(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee modify(Long id, Employee employee) {
		if(employeeDao.existsById(id)){
			employee.setId(id);
			employeeDao.save(employee);
		} 
		return null;
	}

	@Override
	public void delete(Long id) {
		if(employeeDao.existsById(id)) {
			employeeDao.deleteById(id);
		}	
	}
}
