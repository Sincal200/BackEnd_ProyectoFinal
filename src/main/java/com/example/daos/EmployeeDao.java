package com.example.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Employee;

public interface EmployeeDao extends CrudRepository<Employee,Long>{

}
