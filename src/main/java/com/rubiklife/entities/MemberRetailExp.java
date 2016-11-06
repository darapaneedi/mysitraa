package com.rubiklife.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberRetailExp {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="memRetail_id")
	private Integer memRetailId;
	
	private String vehicle;
	private Date renewalDate;
	private Integer customerId;
	private String description;
	
	private Integer premium;
	
	
	
	public Integer getPremium() {
		return premium;
	}

	public void setPremium(Integer premium) {
		this.premium = premium;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getMemRetailId() {
		return memRetailId;
	}

	public void setMemRetailId(Integer memRetailId) {
		this.memRetailId = memRetailId;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
