package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_eating_habits database table.
 * 
 */
@Entity
@Table(name="member_eating_habits")
@NamedQuery(name="MemberEatingHabit.findAll", query="SELECT m FROM MemberEatingHabit m")
public class MemberEatingHabit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_eating_habits_id")
	private int memberEatingHabitsId;

	@Column(name="breakfast_healthy_scale")
	private int breakfastHealthyScale;

	@Column(name="breakfast_ndays")
	private int breakfastNdays;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="dinner_healthy_scale")
	private int dinnerHealthyScale;

	@Column(name="dinner_ndays")
	private int dinnerNdays;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="lunch_healthy_scale")
	private int lunchHealthyScale;

	@Column(name="lunch_ndays")
	private int lunchNdays;

	@Column(name="water_oz")
	private int waterOz;

	public MemberEatingHabit() {
	}

	public int getMemberEatingHabitsId() {
		return this.memberEatingHabitsId;
	}

	public void setMemberEatingHabitsId(int memberEatingHabitsId) {
		this.memberEatingHabitsId = memberEatingHabitsId;
	}

	public int getBreakfastHealthyScale() {
		return this.breakfastHealthyScale;
	}

	public void setBreakfastHealthyScale(int breakfastHealthyScale) {
		this.breakfastHealthyScale = breakfastHealthyScale;
	}

	public int getBreakfastNdays() {
		return this.breakfastNdays;
	}

	public void setBreakfastNdays(int breakfastNdays) {
		this.breakfastNdays = breakfastNdays;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDinnerHealthyScale() {
		return this.dinnerHealthyScale;
	}

	public void setDinnerHealthyScale(int dinnerHealthyScale) {
		this.dinnerHealthyScale = dinnerHealthyScale;
	}

	public int getDinnerNdays() {
		return this.dinnerNdays;
	}

	public void setDinnerNdays(int dinnerNdays) {
		this.dinnerNdays = dinnerNdays;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public int getLunchHealthyScale() {
		return this.lunchHealthyScale;
	}

	public void setLunchHealthyScale(int lunchHealthyScale) {
		this.lunchHealthyScale = lunchHealthyScale;
	}

	public int getLunchNdays() {
		return this.lunchNdays;
	}

	public void setLunchNdays(int lunchNdays) {
		this.lunchNdays = lunchNdays;
	}

	public int getWaterOz() {
		return this.waterOz;
	}

	public void setWaterOz(int waterOz) {
		this.waterOz = waterOz;
	}

}