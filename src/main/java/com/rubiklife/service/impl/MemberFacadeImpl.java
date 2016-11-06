package com.rubiklife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubiklife.bo.MemberBO;
import com.rubiklife.entities.Anthropometric;
import com.rubiklife.entities.Member;
import com.rubiklife.entities.MemberHealtGoals;
import com.rubiklife.entities.MemberHealthStatistics;
import com.rubiklife.entities.MemberPointsStatistics;
import com.rubiklife.repositories.AddressRepository;
import com.rubiklife.repositories.AntrometricsRepository;
import com.rubiklife.repositories.CityRepository;
import com.rubiklife.repositories.CountryRepository;
import com.rubiklife.repositories.MemberAppointmentRepository;
import com.rubiklife.repositories.MemberDietPlanRepository;
import com.rubiklife.repositories.MemberDietitianRepository;
import com.rubiklife.repositories.MemberHealtGoalsRepository;
import com.rubiklife.repositories.MemberHealthStatsRepository;
import com.rubiklife.repositories.MemberPointsStatisticsRepository;
import com.rubiklife.repositories.MemberRepository;
import com.rubiklife.repositories.MemberRetailExpRepository;
import com.rubiklife.repositories.MemberToDosRepository;
import com.rubiklife.service.MemberFacade;

@Service
public class MemberFacadeImpl implements MemberFacade{

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private AntrometricsRepository antrometricsRepository;
	
	@Autowired
	private MemberToDosRepository memberToDosRepository;
	
	@Autowired
	private MemberAppointmentRepository appointmentRepository;
	
	@Autowired
	private MemberDietPlanRepository dietPlanRepository;
	
	@Autowired
	private MemberRetailExpRepository retailExpRepository;
	
	@Autowired
	private MemberHealtGoalsRepository memberHealtGoalsRepository;
	
	@Autowired
	private MemberHealthStatsRepository healthStatsRepository;
	
	@Autowired
	private MemberPointsStatisticsRepository memberPointsStatisticsRepository;
	
	@Autowired
	private MemberDietitianRepository memberDietitianRepository;
	
	@Override
	public MemberBO getMemberBO( Member member ) {
		
		member = memberRepository.findOne(member.getCustomerId());
		MemberBO memberBO = new MemberBO();
		memberBO.setMember(member);
		
		memberBO.setAddress(addressRepository.findOne(member.getAddressId()));
		memberBO.setAppointments(appointmentRepository.findByMemberId(member.getCustomerId()));
		memberBO.setTodos(memberToDosRepository.findByMemberId(member.getCustomerId()));
		memberBO.setCity(cityRepository.findOne(memberBO.getAddress().getCityId()));
		memberBO.setCountry(countryRepository.findOne(memberBO.getCity().getCountryId()));
		memberBO.setMemberDietPlan(dietPlanRepository.findByCustomerId(member.getCustomerId()));
		memberBO.setMemberRetailExp(retailExpRepository.findByCustomerId(member.getCustomerId()));
		memberBO.setDietitians(memberDietitianRepository.findByCustomerId(member.getCustomerId()));
		
		return memberBO;
	}
	
	@Override
	public List<MemberHealtGoals> getMemberGoals(Member member) {
		
		return memberHealtGoalsRepository.findByCustomerId(member.getCustomerId());
	}
	
	@Override
	public List<MemberHealthStatistics> getMemberHealthStats(Member member) {
		
		
		return healthStatsRepository.findByCustomerIdOrderByStatisticsDateDesc(member.getCustomerId());
	}
	
	@Override
	public List<MemberPointsStatistics> getMemberPointsStats(Member member) {
		
		return memberPointsStatisticsRepository.findByCustomerId(member.getCustomerId());
	}
}
