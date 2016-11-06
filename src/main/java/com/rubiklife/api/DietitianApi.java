package com.rubiklife.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rubiklife.bo.DietitianBO;
import com.rubiklife.entities.Patient;
import com.rubiklife.repositories.AddressRepository;
import com.rubiklife.repositories.CityRepository;
import com.rubiklife.repositories.CountryRepository;
import com.rubiklife.repositories.DietitianRepository;
import com.rubiklife.repositories.PatientRepository;
import com.rubiklife.service.DietitianService;

@RestController
@RequestMapping(value = "/dietitian")
public class DietitianApi {

	@Autowired
	private DietitianRepository dietitianRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private DietitianService dietitianService;
	
	@Autowired
	private PatientRepository patientRepository;

	@RequestMapping(method = RequestMethod.GET)
	public DietitianBO getLoggedInDietitian( HttpServletRequest request ){
		if(request.getSession().getAttribute("dietitianInfo")==null){
			return new DietitianBO();
		}
		
		return dietitianService.getDietitianBO(((DietitianBO)request.getSession().getAttribute("dietitianInfo")).getDietitian()); 
	
	}
	
	@RequestMapping(value="/patients",method = RequestMethod.GET)
	public List<Patient> getPatientList( HttpServletRequest request ){
		
		List<Patient> patientList = patientRepository.findByDietitianId(((DietitianBO)request.getSession().getAttribute("dietitianInfo")).getDietitian().getDietitianId());
		
		return patientList;
	}
}
