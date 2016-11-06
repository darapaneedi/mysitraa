package com.rubiklife.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.Dietitian;

public interface DietitianRepository extends CrudRepository<Dietitian, Integer>{
	
	Dietitian findByEmail(String email);
	

}