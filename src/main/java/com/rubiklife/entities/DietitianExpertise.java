package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_expertise database table.
 * 
 */
@Entity
@Table(name="dietitian_expertise")
@NamedQuery(name="DietitianExpertise.findAll", query="SELECT d FROM DietitianExpertise d")
public class DietitianExpertise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_expertise_id")
	private int dietitianExpertiseId;

	@Column(name="behavioral_health")
	private String behavioralHealth;

	@Column(name="childhood_obseity")
	private String childhoodObseity;

	@Column(name="culinary_arts")
	private String culinaryArts;

	@Column(name="dietitian_id")
	private String dietitianId;

	@Column(name="digestive_disorder")
	private String digestiveDisorder;

	@Column(name="eating_disorder")
	private String eatingDisorder;

	@Column(name="food_allergies")
	private String foodAllergies;

	@Column(name="functional_nutrition")
	private String functionalNutrition;

	@Column(name="general_nutrition")
	private String generalNutrition;

	@Column(name="gernotology_nutrition")
	private String gernotologyNutrition;

	@Column(name="gluten_intolerence")
	private String glutenIntolerence;

	@Column(name="heart_health")
	private String heartHealth;

	@Column(name="home_health_care")
	private String homeHealthCare;

	@Column(name="immune_nutrition")
	private String immuneNutrition;

	private String kidney_Renal_nutrition;

	private String lactation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	@Column(name="maternal_nutrition")
	private String maternalNutrition;

	@Column(name="oncology_nutrition")
	private String oncologyNutrition;

	@Column(name="pediatric_nutrition")
	private String pediatricNutrition;

	@Column(name="sports_nutrition")
	private String sportsNutrition;

	@Column(name="vegetarian_nutrition")
	private String vegetarianNutrition;

	public DietitianExpertise() {
	}

	public int getDietitianExpertiseId() {
		return this.dietitianExpertiseId;
	}

	public void setDietitianExpertiseId(int dietitianExpertiseId) {
		this.dietitianExpertiseId = dietitianExpertiseId;
	}

	public String getBehavioralHealth() {
		return this.behavioralHealth;
	}

	public void setBehavioralHealth(String behavioralHealth) {
		this.behavioralHealth = behavioralHealth;
	}

	public String getChildhoodObseity() {
		return this.childhoodObseity;
	}

	public void setChildhoodObseity(String childhoodObseity) {
		this.childhoodObseity = childhoodObseity;
	}

	public String getCulinaryArts() {
		return this.culinaryArts;
	}

	public void setCulinaryArts(String culinaryArts) {
		this.culinaryArts = culinaryArts;
	}

	public String getDietitianId() {
		return this.dietitianId;
	}

	public void setDietitianId(String dietitianId) {
		this.dietitianId = dietitianId;
	}

	public String getDigestiveDisorder() {
		return this.digestiveDisorder;
	}

	public void setDigestiveDisorder(String digestiveDisorder) {
		this.digestiveDisorder = digestiveDisorder;
	}

	public String getEatingDisorder() {
		return this.eatingDisorder;
	}

	public void setEatingDisorder(String eatingDisorder) {
		this.eatingDisorder = eatingDisorder;
	}

	public String getFoodAllergies() {
		return this.foodAllergies;
	}

	public void setFoodAllergies(String foodAllergies) {
		this.foodAllergies = foodAllergies;
	}

	public String getFunctionalNutrition() {
		return this.functionalNutrition;
	}

	public void setFunctionalNutrition(String functionalNutrition) {
		this.functionalNutrition = functionalNutrition;
	}

	public String getGeneralNutrition() {
		return this.generalNutrition;
	}

	public void setGeneralNutrition(String generalNutrition) {
		this.generalNutrition = generalNutrition;
	}

	public String getGernotologyNutrition() {
		return this.gernotologyNutrition;
	}

	public void setGernotologyNutrition(String gernotologyNutrition) {
		this.gernotologyNutrition = gernotologyNutrition;
	}

	public String getGlutenIntolerence() {
		return this.glutenIntolerence;
	}

	public void setGlutenIntolerence(String glutenIntolerence) {
		this.glutenIntolerence = glutenIntolerence;
	}

	public String getHeartHealth() {
		return this.heartHealth;
	}

	public void setHeartHealth(String heartHealth) {
		this.heartHealth = heartHealth;
	}

	public String getHomeHealthCare() {
		return this.homeHealthCare;
	}

	public void setHomeHealthCare(String homeHealthCare) {
		this.homeHealthCare = homeHealthCare;
	}

	public String getImmuneNutrition() {
		return this.immuneNutrition;
	}

	public void setImmuneNutrition(String immuneNutrition) {
		this.immuneNutrition = immuneNutrition;
	}

	public String getKidney_Renal_nutrition() {
		return this.kidney_Renal_nutrition;
	}

	public void setKidney_Renal_nutrition(String kidney_Renal_nutrition) {
		this.kidney_Renal_nutrition = kidney_Renal_nutrition;
	}

	public String getLactation() {
		return this.lactation;
	}

	public void setLactation(String lactation) {
		this.lactation = lactation;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public String getLastUpdtUser() {
		return this.lastUpdtUser;
	}

	public void setLastUpdtUser(String lastUpdtUser) {
		this.lastUpdtUser = lastUpdtUser;
	}

	public String getMaternalNutrition() {
		return this.maternalNutrition;
	}

	public void setMaternalNutrition(String maternalNutrition) {
		this.maternalNutrition = maternalNutrition;
	}

	public String getOncologyNutrition() {
		return this.oncologyNutrition;
	}

	public void setOncologyNutrition(String oncologyNutrition) {
		this.oncologyNutrition = oncologyNutrition;
	}

	public String getPediatricNutrition() {
		return this.pediatricNutrition;
	}

	public void setPediatricNutrition(String pediatricNutrition) {
		this.pediatricNutrition = pediatricNutrition;
	}

	public String getSportsNutrition() {
		return this.sportsNutrition;
	}

	public void setSportsNutrition(String sportsNutrition) {
		this.sportsNutrition = sportsNutrition;
	}

	public String getVegetarianNutrition() {
		return this.vegetarianNutrition;
	}

	public void setVegetarianNutrition(String vegetarianNutrition) {
		this.vegetarianNutrition = vegetarianNutrition;
	}

}