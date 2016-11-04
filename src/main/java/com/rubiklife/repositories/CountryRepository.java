package com.rubiklife.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{
	
	Country findByCountry( String country );

}
