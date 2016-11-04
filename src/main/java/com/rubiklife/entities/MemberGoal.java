package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_goals database table.
 * 
 */
@Entity
@Table(name="member_goals")
@NamedQuery(name="MemberGoal.findAll", query="SELECT m FROM MemberGoal m")
public class MemberGoal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_goals_id")
	private int memberGoalsId;

	@Column(name="alchol_usage")
	private int alcholUsage;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="diet_nutrition")
	private int dietNutrition;

	private int fitness;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="goal_date")
	private Date goalDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="tobacco_usage")
	private int tobaccoUsage;

	@Column(name="weight_mgmt")
	private int weightMgmt;

	public MemberGoal() {
	}

	public int getMemberGoalsId() {
		return this.memberGoalsId;
	}

	public void setMemberGoalsId(int memberGoalsId) {
		this.memberGoalsId = memberGoalsId;
	}

	public int getAlcholUsage() {
		return this.alcholUsage;
	}

	public void setAlcholUsage(int alcholUsage) {
		this.alcholUsage = alcholUsage;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDietNutrition() {
		return this.dietNutrition;
	}

	public void setDietNutrition(int dietNutrition) {
		this.dietNutrition = dietNutrition;
	}

	public int getFitness() {
		return this.fitness;
	}

	public void setFitness(int fitness) {
		this.fitness = fitness;
	}

	public Date getGoalDate() {
		return this.goalDate;
	}

	public void setGoalDate(Date goalDate) {
		this.goalDate = goalDate;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public int getTobaccoUsage() {
		return this.tobaccoUsage;
	}

	public void setTobaccoUsage(int tobaccoUsage) {
		this.tobaccoUsage = tobaccoUsage;
	}

	public int getWeightMgmt() {
		return this.weightMgmt;
	}

	public void setWeightMgmt(int weightMgmt) {
		this.weightMgmt = weightMgmt;
	}

}