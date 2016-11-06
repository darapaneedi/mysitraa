package com.rubiklife.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="member_diet_breakdown")
@NamedQuery(name="MemberDietBreakdown.findAll", query="SELECT m FROM MemberDietBreakdown m")
public class MemberDietBreakdown implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_dietIntake_id")
	private int memberDietIntakeId;

	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="member_calorie_intake")
	private int memberCalorieIntake;
	
	@Column(name="member_fat_intake")
	private int memberFatIntake;
	
	@Column(name="member_sugar_intake")
	private int memberSugarIntake;
	
	@Column(name="member_carbohydrate_intake")
	private int memberCarbohydrateIntake;
	
	@Column(name="member_sodium_intake")
	private int memberSodiumIntake;


	public MemberDietBreakdown() {
	}


	public int getMemberDietIntakeId() {
		return memberDietIntakeId;
	}


	public void setMemberDietIntakeId(int memberDietIntakeId) {
		this.memberDietIntakeId = memberDietIntakeId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getMemberCalorieIntake() {
		return memberCalorieIntake;
	}


	public void setMemberCalorieIntake(int memberCalorieIntake) {
		this.memberCalorieIntake = memberCalorieIntake;
	}


	public int getMemberFatIntake() {
		return memberFatIntake;
	}


	public void setMemberFatIntake(int memberFatIntake) {
		this.memberFatIntake = memberFatIntake;
	}


	public int getMemberSugarIntake() {
		return memberSugarIntake;
	}


	public void setMemberSugarIntake(int memberSugarIntake) {
		this.memberSugarIntake = memberSugarIntake;
	}


	public int getMemberCarbohydrateIntake() {
		return memberCarbohydrateIntake;
	}


	public void setMemberCarbohydrateIntake(int memberCarbohydrateIntake) {
		this.memberCarbohydrateIntake = memberCarbohydrateIntake;
	}


	public int getMemberSodiumIntake() {
		return memberSodiumIntake;
	}


	public void setMemberSodiumIntake(int memberSodiumIntake) {
		this.memberSodiumIntake = memberSodiumIntake;
	}

}
