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

import com.example.entities.Budget;
import com.example.services.BudgetService;

@RestController
@RequestMapping("/budgets")
@CrossOrigin("http://localhost:8081/")
public class BudgetController {
	
	@Autowired
	private BudgetService budgetService;
	
	@GetMapping( value = "/all")
    public List<Budget> findAll(){
		return budgetService.findAll();
    }
	
	@GetMapping( value = "/{id}")
    public Budget findById( @PathVariable Long id){
		return budgetService.findById(id);
    }

	@PostMapping()
    public Budget createTask( @RequestBody Budget budget){
		return budgetService.create(budget);
    }

	@PutMapping(value = "/{id}")
    public Budget modifyTask( @PathVariable Long id, @RequestBody Budget budget){
		return budgetService.modify(id,budget);
    }

	@GetMapping(value = "/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
    	budgetService.delete(id);
    }
}
