package com.rubiklife.api;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rubiklife.bo.MemberBO;
import com.rubiklife.entities.Address;
import com.rubiklife.entities.City;
import com.rubiklife.entities.Country;
import com.rubiklife.entities.Member;
import com.rubiklife.repositories.AddressRepository;
import com.rubiklife.repositories.CityRepository;
import com.rubiklife.repositories.CountryRepository;
import com.rubiklife.repositories.MemberRepository;

@RestController
@RequestMapping(value = "/user")
public class PersonalDetailsAPI {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public MemberBO getLoggedInMember( HttpServletRequest request ){
		//request.getSession().getAttribute("memberInfo");
		if(true){
			return new MemberBO(true);
		}
		
		return (MemberBO)request.getSession().getAttribute("memberInfo"); // return from Security context //TODO after login
	
	
	}
	
	

	@RequestMapping(value = "/user/cancel", method = RequestMethod.GET)
	public String cancelLoggedInMember( HttpServletRequest request ){
		request.getSession().removeAttribute("memberInfo");
		
		
		return "{\"status\":200}"; // return from Security context //TODO after login
	
	
	}

	@RequestMapping(method = RequestMethod.PUT)
	@Transactional
	public MemberBO saveInMember( @RequestBody MemberBO memberBO , HttpServletRequest request ){
		
		if(memberBO.isNew()){
			
			Member member = memberBO.getMember();
			if(member.getCreateDate()==null){
				member.setCreateDate(new Date());
			}
			
			Country country = memberBO.getCountry();
			if(country.getCountry() !=null ){
				country = countryRepository.findByCountry(country.getCountry());
			}
			
			City city = memberBO.getCity();
			if(city.getCity() !=null ){
				city = cityRepository.findByCity(city.getCity());
			}
			
			Address address = memberBO.getAddress();
			address = addressRepository.save(address);
			member.setAddressId(address.getAddressId());
			
			memberBO.setMember(memberRepository.save(member));
		}
		
		request.getSession().setAttribute("memberInfo",memberBO);
		
		return memberBO; // return from Security context //TODO after login
	}
}
