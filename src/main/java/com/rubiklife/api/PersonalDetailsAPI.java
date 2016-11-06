package com.rubiklife.api;

import java.util.Date;
import java.util.List;

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
import com.rubiklife.entities.MemberHealtGoals;
import com.rubiklife.entities.MemberHealthStatistics;
import com.rubiklife.entities.MemberPointsStatistics;
import com.rubiklife.repositories.AddressRepository;
import com.rubiklife.repositories.CityRepository;
import com.rubiklife.repositories.CountryRepository;
import com.rubiklife.repositories.MemberRepository;
import com.rubiklife.service.MemberFacade;

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
	
	@Autowired
	private MemberFacade memberFacade;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public MemberBO getLoggedInMember( HttpServletRequest request ){
		//request.getSession().getAttribute("memberInfo");
		if(request.getSession().getAttribute("memberInfo")==null){
			return new MemberBO(true);
		}
		
		return memberFacade.getMemberBO(((MemberBO)request.getSession().getAttribute("memberInfo")).getMember()); 
	
	}
	
	@RequestMapping(value="/goals",method = RequestMethod.GET)
	public List<MemberHealtGoals> getMemberGoals( HttpServletRequest request ){
		
		return memberFacade.getMemberGoals(((MemberBO)request.getSession().getAttribute("memberInfo")).getMember()); 
	
	}
	
	

	@RequestMapping(value="/healthstats",method = RequestMethod.GET)
	public List<MemberHealthStatistics> getMemberHealthStats( HttpServletRequest request ){
		
		return memberFacade.getMemberHealthStats(((MemberBO)request.getSession().getAttribute("memberInfo")).getMember()); 
	
	}
	
	@RequestMapping(value="/pointsstats",method = RequestMethod.GET)
	public List<MemberPointsStatistics> getMemberPointsStats( HttpServletRequest request ){
		
		return memberFacade.getMemberPointsStats(((MemberBO)request.getSession().getAttribute("memberInfo")).getMember()); 
	
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
				Country countryEN = countryRepository.findByCountry(country.getCountry());
				if(countryEN==null){
					countryEN = new Country();
					countryEN.setCountry(country.getCountry());
					countryEN = countryRepository.save(countryEN);
				}
				
				country = countryEN ;
				memberBO.setCountry(countryEN);
			}
			
			City city = memberBO.getCity();
			if(city.getCity() !=null ){
				City cityEN = cityRepository.findByCity(city.getCity());
				if(cityEN==null){
					cityEN = new City();
					cityEN.setCity(city.getCity());
					city.setCountryId(country.getCountryId());
					cityEN = cityRepository.save(cityEN);
				}
				
				city = cityEN ;
				memberBO.setCity(cityEN);
			}
			
			Address address = memberBO.getAddress();
			address.setCityId(city.getCityId());
			address = addressRepository.save(address);
			
			member.setAddressId(address.getAddressId());
			
			memberBO.setMember(memberRepository.save(member));
		}
		
		request.getSession().setAttribute("memberInfo",memberBO);
		
		return memberBO; // return from Security context //TODO after login
	}
}
