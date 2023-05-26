package com.example.services;

import java.util.List;

import com.example.entities.Project;


public interface ProjectService {
	public List<Project> findAll();
	public Project findById(Long id);
	public Project create(Project project);
	public Project modify(Long id, Project project);
    public void delete(Long id);
}
