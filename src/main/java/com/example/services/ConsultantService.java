package com.example.services;

import java.util.List;

import com.example.entities.Consultant;


public interface ConsultantService {
	List<Consultant> findAll();
	Consultant findById(Long id);
	Consultant create(Consultant consultant);
	Consultant modify(Long id, Consultant consultant);
    void delete(Long id);
}
