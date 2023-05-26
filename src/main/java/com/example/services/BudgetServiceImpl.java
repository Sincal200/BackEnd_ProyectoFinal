package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.BudgetDao;
import com.example.entities.Budget;


@Service
public class BudgetServiceImpl implements BudgetService{
	
	@Autowired
	private BudgetDao budgetDao;

	@Override
	public List<Budget> findAll() {
		return (List<Budget>)budgetDao.findAll();
	}

	@Override
	public Budget findById(Long id) {
		return budgetDao.findById(id).orElse(null);
	}

	@Override
	public Budget create(Budget budget) {
		return budgetDao.save(budget);
	}

	@Override
	public Budget modify(Long id, Budget budget) {
		if(budgetDao.existsById(id)){
			budget.setId(id);
			budgetDao.save(budget);
		} 
		return null;
	}

	@Override
	public void delete(Long id) {
		if(budgetDao.existsById(id)) {
			budgetDao.deleteById(id);
		}
	}
}
