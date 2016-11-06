package com.rubiklife.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberHealtGoals {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="memgoals_id")
	private Integer memGoalsId;
	
	private Integer customerId;
	
	private String diagnosis;
	private String goal;
	private String target;
	
	private Date addedDate;

	public Integer getMemGoalsId() {
		return memGoalsId;
	}

	public void setMemGoalsId(Integer memGoalsId) {
		this.memGoalsId = memGoalsId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	
}
