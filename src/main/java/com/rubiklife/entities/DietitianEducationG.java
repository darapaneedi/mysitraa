package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_education_g database table.
 * 
 */
@Entity
@Table(name="dietitian_education_g")
@NamedQuery(name="DietitianEducationG.findAll", query="SELECT d FROM DietitianEducationG d")
public class DietitianEducationG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_education_id")
	private int dietitianEducationId;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Column(name="grad_degreee")
	private String gradDegreee;

	@Column(name="grad_gpa")
	private int gradGpa;

	@Column(name="grad_university")
	private String gradUniversity;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	public DietitianEducationG() {
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

	public String getGradDegreee() {
		return this.gradDegreee;
	}

	public void setGradDegreee(String gradDegreee) {
		this.gradDegreee = gradDegreee;
	}

	public int getGradGpa() {
		return this.gradGpa;
	}

	public void setGradGpa(int gradGpa) {
		this.gradGpa = gradGpa;
	}

	public String getGradUniversity() {
		return this.gradUniversity;
	}

	public void setGradUniversity(String gradUniversity) {
		this.gradUniversity = gradUniversity;
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

}