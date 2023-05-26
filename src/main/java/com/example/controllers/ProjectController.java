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


import com.example.entities.Project;

import com.example.services.ProjectService;

@RestController
@RequestMapping("/projects")
@CrossOrigin("http://localhost:8081/")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping( value = "/all")
    public List<Project> findAll(){
		return projectService.findAll();
    }
	
	@GetMapping( value = "/{id}")
    public Project findById( @PathVariable Long id){
		return projectService.findById(id);
    }

	@PostMapping()
    public Project createTask( @RequestBody Project project){
		return projectService.create(project);
    }

	@PutMapping(value = "/{id}")
    public Project modifyTask( @PathVariable Long id, @RequestBody Project project){
		return projectService.modify(id,project);
    }

	@GetMapping(value = "/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
    	projectService.delete(id);
    }
}
