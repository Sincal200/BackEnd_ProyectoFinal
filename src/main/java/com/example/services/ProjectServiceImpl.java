package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.ProjectDao;
import com.example.entities.Project;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDao projectDao;
	
	@Override
	public List<Project> findAll() {
		return (List<Project>)projectDao.findAll();
	}

	@Override
	public Project findById(Long id) {
		return projectDao.findById(id).orElse(null);
	}

	@Override
	public Project create(Project project) {
		return projectDao.save(project);
	}

	@Override
	public Project modify(Long id, Project project) {
		if(projectDao.existsById(id)){
			project.setId(id);
			projectDao.save(project);
		} 
		return null;
	}

	@Override
	public void delete(Long id) {
		if(projectDao.existsById(id)) {
			projectDao.deleteById(id);
		}	
		
	}

}
