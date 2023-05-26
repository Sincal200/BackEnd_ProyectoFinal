package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.ConsultantDao;
import com.example.entities.Consultant;



@Service
public class ConsultantServiceImpl implements ConsultantService {
	@Autowired
	private ConsultantDao consultantDao;
	@Override
	public List<Consultant> findAll() {
		return (List<Consultant>)consultantDao.findAll();
	}

	@Override
	public Consultant findById(Long id) {
		return consultantDao.findById(id).orElse(null);
	}

	@Override
	public Consultant create(Consultant consultant) {
		return consultantDao.save(consultant);
	}

	@Override
	public Consultant modify(Long id, Consultant consultant) {
		if(consultantDao.existsById(id)){
			consultant.setId(id);
			consultantDao.save(consultant);
		} 
		return null;
	}

	@Override
	public void delete(Long id) {
		if(consultantDao.existsById(id)) {
			consultantDao.deleteById(id);
		}	
	}
}
