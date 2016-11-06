package com.rubiklife.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberDietPlan {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="memDietPlan_id")
	private Integer memDietPlanId;
	private Integer customerId;
	private Integer premium;
	private Integer liabilityLimit;
	private Date renewalDate;
	private Integer selfInsuredReientionLimit;
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getMemDietPlanId() {
		return memDietPlanId;
	}
	public void setMemDietPlanId(Integer memDietPlanId) {
		this.memDietPlanId = memDietPlanId;
	}
	public Integer getPremium() {
		return premium;
	}
	public void setPremium(Integer premium) {
		this.premium = premium;
	}
	public Integer getLiabilityLimit() {
		return liabilityLimit;
	}
	public void setLiabilityLimit(Integer liabilityLimit) {
		this.liabilityLimit = liabilityLimit;
	}
	public Date getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	public Integer getSelfInsuredReientionLimit() {
		return selfInsuredReientionLimit;
	}
	public void setSelfInsuredReientionLimit(Integer selfInsuredReientionLimit) {
		this.selfInsuredReientionLimit = selfInsuredReientionLimit;
	}
	
	
	
}
