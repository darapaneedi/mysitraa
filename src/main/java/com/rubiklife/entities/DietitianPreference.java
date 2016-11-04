package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_preferences database table.
 * 
 */
@Entity
@Table(name="dietitian_preferences")
@NamedQuery(name="DietitianPreference.findAll", query="SELECT d FROM DietitianPreference d")
public class DietitianPreference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_preferences_id")
	private int dietitianPreferencesId;

	@Column(name="cultural_competencied_id")
	private int culturalCompetenciedId;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Column(name="dietitian_language_id")
	private int dietitianLanguageId;

	@Column(name="diseases_mgmt_id")
	private int diseasesMgmtId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="patient_sex_perf")
	private String patientSexPerf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="perf_start_date")
	private Date perfStartDate;

	public DietitianPreference() {
	}

	public int getDietitianPreferencesId() {
		return this.dietitianPreferencesId;
	}

	public void setDietitianPreferencesId(int dietitianPreferencesId) {
		this.dietitianPreferencesId = dietitianPreferencesId;
	}

	public int getCulturalCompetenciedId() {
		return this.culturalCompetenciedId;
	}

	public void setCulturalCompetenciedId(int culturalCompetenciedId) {
		this.culturalCompetenciedId = culturalCompetenciedId;
	}

	public int getDietitianId() {
		return this.dietitianId;
	}

	public void setDietitianId(int dietitianId) {
		this.dietitianId = dietitianId;
	}

	public int getDietitianLanguageId() {
		return this.dietitianLanguageId;
	}

	public void setDietitianLanguageId(int dietitianLanguageId) {
		this.dietitianLanguageId = dietitianLanguageId;
	}

	public int getDiseasesMgmtId() {
		return this.diseasesMgmtId;
	}

	public void setDiseasesMgmtId(int diseasesMgmtId) {
		this.diseasesMgmtId = diseasesMgmtId;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public String getPatientSexPerf() {
		return this.patientSexPerf;
	}

	public void setPatientSexPerf(String patientSexPerf) {
		this.patientSexPerf = patientSexPerf;
	}

	public Date getPerfStartDate() {
		return this.perfStartDate;
	}

	public void setPerfStartDate(Date perfStartDate) {
		this.perfStartDate = perfStartDate;
	}

}