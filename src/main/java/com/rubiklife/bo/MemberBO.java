package com.rubiklife.bo;

import java.util.List;

import com.rubiklife.entities.Address;
import com.rubiklife.entities.Anthropometric;
import com.rubiklife.entities.City;
import com.rubiklife.entities.Country;
import com.rubiklife.entities.Dietitian;
import com.rubiklife.entities.Member;
import com.rubiklife.entities.MemberAppointments;
import com.rubiklife.entities.MemberDietPlan;
import com.rubiklife.entities.MemberRetailExp;
import com.rubiklife.entities.MemberToDos;

public class MemberBO {
	
	private Member member;
	private Address address;
	private City city;
	private Country country;
	private Anthropometric anthropometric;
	private MemberDietPlan memberDietPlan;
	private List<MemberRetailExp> memberRetailExp;
	private List<DietitianBO> dietitians;
	
	private List<MemberAppointments> appointments;
	
	private List<MemberToDos> todos;
	
	private boolean isNew;
	
	public MemberBO() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberBO( boolean isNew ) {
		if(isNew){
			this.member = new Member();
			this.address = new Address();
			this.isNew = isNew;
			this.city = new City();
			this.country = new Country();
			this.anthropometric = new Anthropometric();
		}
		
	}
	
	public List<DietitianBO> getDietitians() {
		return dietitians;
	}

	public void setDietitians(List<DietitianBO> dietitians) {
		this.dietitians = dietitians;
	}

	public MemberDietPlan getMemberDietPlan() {
		return memberDietPlan;
	}

	public void setMemberDietPlan(MemberDietPlan memberDietPlan) {
		this.memberDietPlan = memberDietPlan;
	}

	public List<MemberRetailExp> getMemberRetailExp() {
		return memberRetailExp;
	}

	public void setMemberRetailExp(List<MemberRetailExp> memberRetailExp) {
		this.memberRetailExp = memberRetailExp;
	}

	public List<MemberToDos> getTodos() {
		return todos;
	}

	public void setTodos(List<MemberToDos> todos) {
		this.todos = todos;
	}

	public List<MemberAppointments> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<MemberAppointments> appointments) {
		this.appointments = appointments;
	}

	public Anthropometric getAnthropometric() {
		return anthropometric;
	}

	public void setAnthropometric(Anthropometric anthropometric) {
		this.anthropometric = anthropometric;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	
	

}
