package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_schedule database table.
 * 
 */
@Entity
@Table(name="dietitian_schedule")
@NamedQuery(name="DietitianSchedule.findAll", query="SELECT d FROM DietitianSchedule d")
public class DietitianSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_schedule_id")
	private int dietitianScheduleId;

	@Column(name="add_schedule_end")
	private int addScheduleEnd;

	@Column(name="add_schedule_start")
	private int addScheduleStart;

	private String dayofweek;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	@Column(name="schedule_end")
	private int scheduleEnd;

	@Column(name="schedule_start")
	private int scheduleStart;

	public DietitianSchedule() {
	}

	public int getDietitianScheduleId() {
		return this.dietitianScheduleId;
	}

	public void setDietitianScheduleId(int dietitianScheduleId) {
		this.dietitianScheduleId = dietitianScheduleId;
	}

	public int getAddScheduleEnd() {
		return this.addScheduleEnd;
	}

	public void setAddScheduleEnd(int addScheduleEnd) {
		this.addScheduleEnd = addScheduleEnd;
	}

	public int getAddScheduleStart() {
		return this.addScheduleStart;
	}

	public void setAddScheduleStart(int addScheduleStart) {
		this.addScheduleStart = addScheduleStart;
	}

	public String getDayofweek() {
		return this.dayofweek;
	}

	public void setDayofweek(String dayofweek) {
		this.dayofweek = dayofweek;
	}

	public int getDietitianId() {
		return this.dietitianId;
	}

	public void setDietitianId(int dietitianId) {
		this.dietitianId = dietitianId;
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

	public int getScheduleEnd() {
		return this.scheduleEnd;
	}

	public void setScheduleEnd(int scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
	}

	public int getScheduleStart() {
		return this.scheduleStart;
	}

	public void setScheduleStart(int scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

}