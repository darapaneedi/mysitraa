package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_diet_pref database table.
 * 
 */
@Entity
@Table(name="member_diet_pref")
@NamedQuery(name="MemberDietPref.findAll", query="SELECT m FROM MemberDietPref m")
public class MemberDietPref implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_diet_pref_id")
	private int memberDietPrefId;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="low_carb_diet")
	private String lowCarbDiet;

	private String meat;

	private String poultry;

	@Column(name="sodium_res_diet")
	private String sodiumResDiet;

	private String vegan;

	private String vegeterian;

	public MemberDietPref() {
	}

	public int getMemberDietPrefId() {
		return this.memberDietPrefId;
	}

	public void setMemberDietPrefId(int memberDietPrefId) {
		this.memberDietPrefId = memberDietPrefId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public String getLowCarbDiet() {
		return this.lowCarbDiet;
	}

	public void setLowCarbDiet(String lowCarbDiet) {
		this.lowCarbDiet = lowCarbDiet;
	}

	public String getMeat() {
		return this.meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getPoultry() {
		return this.poultry;
	}

	public void setPoultry(String poultry) {
		this.poultry = poultry;
	}

	public String getSodiumResDiet() {
		return this.sodiumResDiet;
	}

	public void setSodiumResDiet(String sodiumResDiet) {
		this.sodiumResDiet = sodiumResDiet;
	}

	public String getVegan() {
		return this.vegan;
	}

	public void setVegan(String vegan) {
		this.vegan = vegan;
	}

	public String getVegeterian() {
		return this.vegeterian;
	}

	public void setVegeterian(String vegeterian) {
		this.vegeterian = vegeterian;
	}

}