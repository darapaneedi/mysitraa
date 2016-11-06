package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.Patient;

public interface PatientRepository  extends CrudRepository<Patient, Integer>{

	List<Patient> findByDietitianId(Integer dietitianId);
	
}
