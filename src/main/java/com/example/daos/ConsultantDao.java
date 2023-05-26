package com.example.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Consultant;

public interface ConsultantDao extends CrudRepository<Consultant,Long>{

}
