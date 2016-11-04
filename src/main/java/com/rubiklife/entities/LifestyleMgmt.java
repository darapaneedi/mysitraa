package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the lifestyle_mgmt database table.
 * 
 */
@Entity
@Table(name="lifestyle_mgmt")
@NamedQuery(name="LifestyleMgmt.findAll", query="SELECT l FROM LifestyleMgmt l")
public class LifestyleMgmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="lifestyle_mgmt_id")
	private int lifestyleMgmtId;

	@Column(name="alchol_freq")
	private int alcholFreq;

	@Column(name="customer_id")
	private int customerId;

	private int driving_miles;

	@Column(name="exercise_avgweek")
	private int exerciseAvgweek;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="main_health_complains")
	private String mainHealthComplains;

	@Column(name="medication_drugs_freq")
	private int medicationDrugsFreq;

	@Column(name="motorcycle_yn")
	private String motorcycleYn;

	@Column(name="sleep_awake_yn")
	private String sleepAwakeYn;

	@Column(name="sleep_happy_yn")
	private String sleepHappyYn;

	@Column(name="sleep_mgmt_hrs")
	private int sleepMgmtHrs;

	@Column(name="smoke_ever_yn")
	private String smokeEverYn;

	@Column(name="smoke_yn")
	private String smokeYn;

	@Column(name="social_ties")
	private int socialTies;

	private int speedlimit;

	@Column(name="stress_cause")
	private String stressCause;

	@Column(name="stress_level")
	private int stressLevel;

	@Column(name="stress_relieve_msc")
	private String stressRelieveMsc;

	@Column(name="tense_depressed_anx")
	private int tenseDepressedAnx;

	@Column(name="weight_mgmt_gain")
	private String weightMgmtGain;

	@Column(name="weight_mgmt_reduce")
	private String weightMgmtReduce;

	public LifestyleMgmt() {
	}

	public int getLifestyleMgmtId() {
		return this.lifestyleMgmtId;
	}

	public void setLifestyleMgmtId(int lifestyleMgmtId) {
		this.lifestyleMgmtId = lifestyleMgmtId;
	}

	public int getAlcholFreq() {
		return this.alcholFreq;
	}

	public void setAlcholFreq(int alcholFreq) {
		this.alcholFreq = alcholFreq;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDriving_miles() {
		return this.driving_miles;
	}

	public void setDriving_miles(int driving_miles) {
		this.driving_miles = driving_miles;
	}

	public int getExerciseAvgweek() {
		return this.exerciseAvgweek;
	}

	public void setExerciseAvgweek(int exerciseAvgweek) {
		this.exerciseAvgweek = exerciseAvgweek;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public String getMainHealthComplains() {
		return this.mainHealthComplains;
	}

	public void setMainHealthComplains(String mainHealthComplains) {
		this.mainHealthComplains = mainHealthComplains;
	}

	public int getMedicationDrugsFreq() {
		return this.medicationDrugsFreq;
	}

	public void setMedicationDrugsFreq(int medicationDrugsFreq) {
		this.medicationDrugsFreq = medicationDrugsFreq;
	}

	public String getMotorcycleYn() {
		return this.motorcycleYn;
	}

	public void setMotorcycleYn(String motorcycleYn) {
		this.motorcycleYn = motorcycleYn;
	}

	public String getSleepAwakeYn() {
		return this.sleepAwakeYn;
	}

	public void setSleepAwakeYn(String sleepAwakeYn) {
		this.sleepAwakeYn = sleepAwakeYn;
	}

	public String getSleepHappyYn() {
		return this.sleepHappyYn;
	}

	public void setSleepHappyYn(String sleepHappyYn) {
		this.sleepHappyYn = sleepHappyYn;
	}

	public int getSleepMgmtHrs() {
		return this.sleepMgmtHrs;
	}

	public void setSleepMgmtHrs(int sleepMgmtHrs) {
		this.sleepMgmtHrs = sleepMgmtHrs;
	}

	public String getSmokeEverYn() {
		return this.smokeEverYn;
	}

	public void setSmokeEverYn(String smokeEverYn) {
		this.smokeEverYn = smokeEverYn;
	}

	public String getSmokeYn() {
		return this.smokeYn;
	}

	public void setSmokeYn(String smokeYn) {
		this.smokeYn = smokeYn;
	}

	public int getSocialTies() {
		return this.socialTies;
	}

	public void setSocialTies(int socialTies) {
		this.socialTies = socialTies;
	}

	public int getSpeedlimit() {
		return this.speedlimit;
	}

	public void setSpeedlimit(int speedlimit) {
		this.speedlimit = speedlimit;
	}

	public String getStressCause() {
		return this.stressCause;
	}

	public void setStressCause(String stressCause) {
		this.stressCause = stressCause;
	}

	public int getStressLevel() {
		return this.stressLevel;
	}

	public void setStressLevel(int stressLevel) {
		this.stressLevel = stressLevel;
	}

	public String getStressRelieveMsc() {
		return this.stressRelieveMsc;
	}

	public void setStressRelieveMsc(String stressRelieveMsc) {
		this.stressRelieveMsc = stressRelieveMsc;
	}

	public int getTenseDepressedAnx() {
		return this.tenseDepressedAnx;
	}

	public void setTenseDepressedAnx(int tenseDepressedAnx) {
		this.tenseDepressedAnx = tenseDepressedAnx;
	}

	public String getWeightMgmtGain() {
		return this.weightMgmtGain;
	}

	public void setWeightMgmtGain(String weightMgmtGain) {
		this.weightMgmtGain = weightMgmtGain;
	}

	public String getWeightMgmtReduce() {
		return this.weightMgmtReduce;
	}

	public void setWeightMgmtReduce(String weightMgmtReduce) {
		this.weightMgmtReduce = weightMgmtReduce;
	}

}