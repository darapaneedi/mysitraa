package com.rubiklife.bo;

import com.rubiklife.entities.Address;
import com.rubiklife.entities.Anthropometric;
import com.rubiklife.entities.City;
import com.rubiklife.entities.Country;
import com.rubiklife.entities.Member;

public class MemberBO {
	
	private Member member;
	private Address address;
	private City city;
	private Country country;
	private Anthropometric anthropometric;
	
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
