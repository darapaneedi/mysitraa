package com.rubiklife.bo;

import java.util.List;

import com.rubiklife.entities.Address;
import com.rubiklife.entities.City;
import com.rubiklife.entities.Country;
import com.rubiklife.entities.Dietitian;
import com.rubiklife.entities.DietitianToDos;
import com.rubiklife.entities.MemberAppointments;

public class DietitianBO {

	private Integer primary;
	
	private Dietitian dietitian;
	private Address address;
	private City city;
	private Country country;
	
	private List<MemberAppointments> appointments;
	
	private List<DietitianToDos> todos;
	
	public DietitianBO(){
	}
	
	public DietitianBO(Dietitian dietitian, Address address, City city,
			Country country) {
		super();
		this.dietitian = dietitian;
		this.address = address;
		this.city = city;
		this.country = country;
	}

	public Dietitian getDietitian() {
		return dietitian;
	}

	public void setDietitian(Dietitian dietitian) {
		this.dietitian = dietitian;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public List<MemberAppointments> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<MemberAppointments> appointments) {
		this.appointments = appointments;
	}

	public List<DietitianToDos> getTodos() {
		return todos;
	}

	public void setTodos(List<DietitianToDos> todos) {
		this.todos = todos;
	}
		
	public DietitianBO(Integer primary,Dietitian dietitian) {
		this.primary = primary;
		this.dietitian = dietitian;
	}
	
	
	public Integer getPrimary() {
		return primary;
	}
	public void setPrimary(Integer primary) {
		this.primary = primary;
	}
	
}
