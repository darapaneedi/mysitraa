package com.rubiklife.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient implements Serializable{

	private static final long serialVersionUID = 1L;

	public Patient() {
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="patient_id")
	private Integer patientId;
	private String patientName;
	private Integer dietitianId;
	private String disease;
	private String category;
	private Date nextVisit;

	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Integer getDietitianId() {
		return dietitianId;
	}
	public void setDietitianId(Integer dietitianId) {
		this.dietitianId = dietitianId;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getNextVisit() {
		return nextVisit;
	}
	public void setNextVisit(Date nextVisit) {
		this.nextVisit = nextVisit;
	}

}
