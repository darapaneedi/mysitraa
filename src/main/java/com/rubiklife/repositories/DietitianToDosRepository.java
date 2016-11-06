package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.DietitianToDos;

public interface DietitianToDosRepository extends CrudRepository<DietitianToDos, Integer>{
	
	List<DietitianToDos> findByDietitianId(Integer dietitianId);
	

}
