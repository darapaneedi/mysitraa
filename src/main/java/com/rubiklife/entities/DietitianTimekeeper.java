package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_timekeeper database table.
 * 
 */
@Entity
@Table(name="dietitian_timekeeper")
@NamedQuery(name="DietitianTimekeeper.findAll", query="SELECT d FROM DietitianTimekeeper d")
public class DietitianTimekeeper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_timekeeper_id")
	private int dietitianTimekeeperId;

	@Column(name="approved_by")
	private String approvedBy;

	private int day;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Column(name="hours_logged")
	private int hoursLogged;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	private int month;

	private int year;

	public DietitianTimekeeper() {
	}

	public int getDietitianTimekeeperId() {
		return this.dietitianTimekeeperId;
	}

	public void setDietitianTimekeeperId(int dietitianTimekeeperId) {
		this.dietitianTimekeeperId = dietitianTimekeeperId;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDietitianId() {
		return this.dietitianId;
	}

	public void setDietitianId(int dietitianId) {
		this.dietitianId = dietitianId;
	}

	public int getHoursLogged() {
		return this.hoursLogged;
	}

	public void setHoursLogged(int hoursLogged) {
		this.hoursLogged = hoursLogged;
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

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}