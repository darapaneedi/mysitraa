package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cultural_competencies database table.
 * 
 */
@Entity
@Table(name="cultural_competencies")
@NamedQuery(name="CulturalCompetency.findAll", query="SELECT c FROM CulturalCompetency c")
public class CulturalCompetency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cultural_competencies_id")
	private int culturalCompetenciesId;

	@Column(name="cultural_name")
	private String culturalName;

	@Column(name="culture_des")
	private String cultureDes;

	@Column(name="culture_exp_lev1to5")
	private int cultureExpLev1to5;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public CulturalCompetency() {
	}

	public int getCulturalCompetenciesId() {
		return this.culturalCompetenciesId;
	}

	public void setCulturalCompetenciesId(int culturalCompetenciesId) {
		this.culturalCompetenciesId = culturalCompetenciesId;
	}

	public String getCulturalName() {
		return this.culturalName;
	}

	public void setCulturalName(String culturalName) {
		this.culturalName = culturalName;
	}

	public String getCultureDes() {
		return this.cultureDes;
	}

	public void setCultureDes(String cultureDes) {
		this.cultureDes = cultureDes;
	}

	public int getCultureExpLev1to5() {
		return this.cultureExpLev1to5;
	}

	public void setCultureExpLev1to5(int cultureExpLev1to5) {
		this.cultureExpLev1to5 = cultureExpLev1to5;
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

}