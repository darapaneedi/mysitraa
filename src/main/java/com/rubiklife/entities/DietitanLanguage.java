package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitan_languages database table.
 * 
 */
@Entity
@Table(name="dietitan_languages")
@NamedQuery(name="DietitanLanguage.findAll", query="SELECT d FROM DietitanLanguage d")
public class DietitanLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitan_languages_id")
	private int dietitanLanguagesId;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Column(name="exp_lvl_1to5")
	private int expLvl1to5;

	@Column(name="language_name")
	private String languageName;

	@Column(name="language_region")
	private String languageRegion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public DietitanLanguage() {
	}

	public int getDietitanLanguagesId() {
		return this.dietitanLanguagesId;
	}

	public void setDietitanLanguagesId(int dietitanLanguagesId) {
		this.dietitanLanguagesId = dietitanLanguagesId;
	}

	public int getDietitianId() {
		return this.dietitianId;
	}

	public void setDietitianId(int dietitianId) {
		this.dietitianId = dietitianId;
	}

	public int getExpLvl1to5() {
		return this.expLvl1to5;
	}

	public void setExpLvl1to5(int expLvl1to5) {
		this.expLvl1to5 = expLvl1to5;
	}

	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageRegion() {
		return this.languageRegion;
	}

	public void setLanguageRegion(String languageRegion) {
		this.languageRegion = languageRegion;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

}