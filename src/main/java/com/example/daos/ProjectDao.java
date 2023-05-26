package com.example.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Project;

public interface ProjectDao extends CrudRepository<Project,Long>{

}
