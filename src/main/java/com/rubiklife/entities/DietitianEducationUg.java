package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_education_ug database table.
 * 
 */
@Entity
@Table(name="dietitian_education_ug")
@NamedQuery(name="DietitianEducationUg.findAll", query="SELECT d FROM DietitianEducationUg d")
public class DietitianEducationUg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_education_id")
	private int dietitianEducationId;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	@Column(name="undergrad_degreee")
	private String undergradDegreee;

	@Column(name="undergrad_gpa")
	private int undergradGpa;

	@Column(name="undergrad_university")
	private String undergradUniversity;

	public DietitianEducationUg() {
	}

	public int getDietitianEducationId() {
		return this.dietitianEducationId;
	}

	public void setDietitianEducationId(int dietitianEducationId) {
		this.dietitianEducationId = dietitianEducationId;
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

	public String getUndergradDegreee() {
		return this.undergradDegreee;
	}

	public void setUndergradDegreee(String undergradDegreee) {
		this.undergradDegreee = undergradDegreee;
	}

	public int getUndergradGpa() {
		return this.undergradGpa;
	}

	public void setUndergradGpa(int undergradGpa) {
		this.undergradGpa = undergradGpa;
	}

	public String getUndergradUniversity() {
		return this.undergradUniversity;
	}

	public void setUndergradUniversity(String undergradUniversity) {
		this.undergradUniversity = undergradUniversity;
	}

}