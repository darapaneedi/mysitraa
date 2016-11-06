package com.rubiklife.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberDietitian {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mem_diet_id")
	
	private Integer memDietId;
	private Integer primaryDietitian;
	private Integer customerId;
	private Integer dietitianId;
	public Integer getMemDietId() {
		return memDietId;
	}
	public void setMemDietId(Integer memDietId) {
		this.memDietId = memDietId;
	}
	
	public Integer getPrimaryDietitian() {
		return primaryDietitian;
	}
	public void setPrimaryDietitian(Integer primaryDietitian) {
		this.primaryDietitian = primaryDietitian;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getDietitianId() {
		return dietitianId;
	}
	public void setDietitianId(Integer dietitianId) {
		this.dietitianId = dietitianId;
	}
	
	
}
