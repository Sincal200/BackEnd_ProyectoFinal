package com.example.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Budget;

public interface BudgetDao extends CrudRepository<Budget,Long>{

}
