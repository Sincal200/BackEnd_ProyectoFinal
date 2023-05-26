package com.example.services;

import java.util.List;

import com.example.entities.Employee;


public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(Long id);
	public Employee create(Employee employee);
	public Employee modify(Long id, Employee employee);
    public void delete(Long id);
}
