package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the allergens_type database table.
 * 
 */
@Entity
@Table(name="allergens_type")
@NamedQuery(name="AllergensType.findAll", query="SELECT a FROM AllergensType a")
public class AllergensType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="allergens_id")
	private int allergensId;

	@Column(name="allergens_desc")
	private String allergensDesc;

	@Column(name="allergens_type")
	private String allergensType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public AllergensType() {
	}

	public int getAllergensId() {
		return this.allergensId;
	}

	public void setAllergensId(int allergensId) {
		this.allergensId = allergensId;
	}

	public String getAllergensDesc() {
		return this.allergensDesc;
	}

	public void setAllergensDesc(String allergensDesc) {
		this.allergensDesc = allergensDesc;
	}

	public String getAllergensType() {
		return this.allergensType;
	}

	public void setAllergensType(String allergensType) {
		this.allergensType = allergensType;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

}