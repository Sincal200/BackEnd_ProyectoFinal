package com.example.services;

import java.util.List;

import com.example.entities.Budget;


public interface BudgetService {
	public List<Budget> findAll();
	public Budget findById(Long id);
	public Budget create(Budget budget);
	public Budget modify(Long id, Budget budget);
    public void delete(Long id);
}
