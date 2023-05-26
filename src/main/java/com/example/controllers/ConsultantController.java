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

import com.example.entities.Consultant;
import com.example.services.ConsultantService;

@RestController
@RequestMapping("/consultants/")
@CrossOrigin("http://localhost:8081/")
public class ConsultantController {
	
	@Autowired
	ConsultantService consultantService;
	
	@GetMapping( value = "/all")
    public List<Consultant> findAll(){
		return consultantService.findAll();
    }
	
	@GetMapping( value = "/{id}")
    public Consultant findById( @PathVariable Long id){
		return consultantService.findById(id);
    }

	@PostMapping()
    public Consultant createTask( @RequestBody Consultant consultant){
		return consultantService.create(consultant);
    }

	@PutMapping(value = "/{id}")
    public Consultant modifyTask( @PathVariable Long id, @RequestBody Consultant consultant){
		return consultantService.modify(id,consultant);
    }

	@GetMapping(value = "/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
    	consultantService.delete(id);
    }

}
