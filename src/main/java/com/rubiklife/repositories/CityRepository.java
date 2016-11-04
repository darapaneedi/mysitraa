package com.rubiklife.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.City;

public interface CityRepository extends CrudRepository<City, Integer>{

	City findByCity(String city);
	
}
