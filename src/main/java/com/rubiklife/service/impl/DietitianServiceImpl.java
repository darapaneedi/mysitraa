package com.rubiklife.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubiklife.bo.DietitianBO;
import com.rubiklife.entities.Dietitian;
import com.rubiklife.repositories.AddressRepository;
import com.rubiklife.repositories.CityRepository;
import com.rubiklife.repositories.CountryRepository;
import com.rubiklife.repositories.DietitianRepository;
import com.rubiklife.repositories.DietitianToDosRepository;
import com.rubiklife.repositories.MemberAppointmentRepository;
import com.rubiklife.service.DietitianService;

@Service
public class DietitianServiceImpl implements DietitianService {

	@Autowired
	private DietitianRepository dietitianRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private MemberAppointmentRepository appointmentRepository;
	
	@Autowired
	private DietitianToDosRepository dietitianToDosRepository;
	
	@Override
	public DietitianBO getDietitianBO(Dietitian dietitian) {
		
		DietitianBO dietitianBO = new DietitianBO();
		
		dietitian = dietitianRepository.findOne(dietitian.getDietitianId());
		dietitianBO.setDietitian(dietitian);
		dietitianBO.setAppointments(appointmentRepository.findByDietitianId(dietitian.getDietitianId()));
		dietitianBO.setAddress(addressRepository.findOne(dietitian.getDietitianId()));
		dietitianBO.setCity(cityRepository.findOne(dietitianBO.getAddress().getCityId()));
		dietitianBO.setCountry(countryRepository.findOne(dietitianBO.getCity().getCountryId()));
		dietitianBO.setTodos(dietitianToDosRepository.findByDietitianId(dietitian.getDietitianId()));
		
		return dietitianBO;
	}

}
