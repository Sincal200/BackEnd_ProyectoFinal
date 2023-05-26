package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Employee;
import com.example.services.EmployeeService;

@RestController
@RequestMapping("/employees/")
@CrossOrigin("http://localhost:8081/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping( value = "/all")
    public List<Employee> findAll(){
		return employeeService.findAll();
    }
	
	@GetMapping( value = "/{id}")
    public Employee findById( @PathVariable Long id){
		return employeeService.findById(id);
    }
	
	@PostMapping()
    public Employee createTask( @RequestBody Employee employee){
		return employeeService.create(employee);
    }

	@PutMapping(value = "/{id}")
    public Employee modifyTask( @PathVariable Long id, @RequestBody Employee employee){
		return employeeService.modify(id,employee);
    }

    @GetMapping(value = "/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
    	employeeService.delete(id);
    }
}
