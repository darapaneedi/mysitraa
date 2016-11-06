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
@Table(name="member_nutrition_breakdown")
@NamedQuery(name="MemberNutritionBreakdown.findAll", query="SELECT m FROM MemberNutritionBreakdown m")
public class MemberNutritionBreakdown implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_nutritionIntake_id")
	private int memberNutritionIntakeId;

	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="member_fruit_intake")
	private int memberFruitIntake;
	
	@Column(name="member_vegitable_intake")
	private int memberVegitableIntake;
	
	@Column(name="member_grains_intake")
	private int memberGrainsIntake;
	
	@Column(name="member_protein_intake")
	private int memberProteinIntake;


	public MemberNutritionBreakdown() {
	}


	public int getMemberNutritionIntakeId() {
		return memberNutritionIntakeId;
	}


	public void setMemberNutritionIntakeId(int memberNutritionIntakeId) {
		this.memberNutritionIntakeId = memberNutritionIntakeId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getMemberFruitIntake() {
		return memberFruitIntake;
	}


	public void setMemberFruitIntake(int memberFruitIntake) {
		this.memberFruitIntake = memberFruitIntake;
	}


	public int getMemberGrainsIntake() {
		return memberGrainsIntake;
	}


	public void setMemberGrainsIntake(int memberGrainsIntake) {
		this.memberGrainsIntake = memberGrainsIntake;
	}


	public int getMemberProteinIntake() {
		return memberProteinIntake;
	}


	public void setMemberProteinIntake(int memberProteinIntake) {
		this.memberProteinIntake = memberProteinIntake;
	}

	public int getMemberVegitableIntake() {
		return memberVegitableIntake;
	}


	public void setMemberVegitableIntake(int memberVegitableIntake) {
		this.memberVegitableIntake = memberVegitableIntake;
	}
	
}
