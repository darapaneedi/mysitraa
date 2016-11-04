package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cultural_type database table.
 * 
 */
@Entity
@Table(name="cultural_type")
@NamedQuery(name="CulturalType.findAll", query="SELECT c FROM CulturalType c")
public class CulturalType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cultural_id")
	private int culturalId;

	@Column(name="cultural_eggs")
	private String culturalEggs;

	@Column(name="culture_dairy")
	private String cultureDairy;

	@Column(name="culture_desc")
	private String cultureDesc;

	@Column(name="culture_gluten")
	private String cultureGluten;

	@Column(name="culture_meat")
	private String cultureMeat;

	@Column(name="culture_name")
	private String cultureName;

	@Column(name="culture_veggies")
	private String cultureVeggies;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public CulturalType() {
	}

	public int getCulturalId() {
		return this.culturalId;
	}

	public void setCulturalId(int culturalId) {
		this.culturalId = culturalId;
	}

	public String getCulturalEggs() {
		return this.culturalEggs;
	}

	public void setCulturalEggs(String culturalEggs) {
		this.culturalEggs = culturalEggs;
	}

	public String getCultureDairy() {
		return this.cultureDairy;
	}

	public void setCultureDairy(String cultureDairy) {
		this.cultureDairy = cultureDairy;
	}

	public String getCultureDesc() {
		return this.cultureDesc;
	}

	public void setCultureDesc(String cultureDesc) {
		this.cultureDesc = cultureDesc;
	}

	public String getCultureGluten() {
		return this.cultureGluten;
	}

	public void setCultureGluten(String cultureGluten) {
		this.cultureGluten = cultureGluten;
	}

	public String getCultureMeat() {
		return this.cultureMeat;
	}

	public void setCultureMeat(String cultureMeat) {
		this.cultureMeat = cultureMeat;
	}

	public String getCultureName() {
		return this.cultureName;
	}

	public void setCultureName(String cultureName) {
		this.cultureName = cultureName;
	}

	public String getCultureVeggies() {
		return this.cultureVeggies;
	}

	public void setCultureVeggies(String cultureVeggies) {
		this.cultureVeggies = cultureVeggies;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

}