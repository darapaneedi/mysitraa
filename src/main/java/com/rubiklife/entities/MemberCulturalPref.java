package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_cultural_pref database table.
 * 
 */
@Entity
@Table(name="member_cultural_pref")
@NamedQuery(name="MemberCulturalPref.findAll", query="SELECT m FROM MemberCulturalPref m")
public class MemberCulturalPref implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_cultural_id")
	private int memberCulturalId;

	@Column(name="cultural_id")
	private int culturalId;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public MemberCulturalPref() {
	}

	public int getMemberCulturalId() {
		return this.memberCulturalId;
	}

	public void setMemberCulturalId(int memberCulturalId) {
		this.memberCulturalId = memberCulturalId;
	}

	public int getCulturalId() {
		return this.culturalId;
	}

	public void setCulturalId(int culturalId) {
		this.culturalId = culturalId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

}