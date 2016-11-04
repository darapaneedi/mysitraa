package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_drugs database table.
 * 
 */
@Entity
@Table(name="member_drugs")
@NamedQuery(name="MemberDrug.findAll", query="SELECT m FROM MemberDrug m")
public class MemberDrug implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_drugs_id")
	private int memberDrugsId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="diseases_mgmt_id")
	private int diseasesMgmtId;

	@Column(name="drug_name")
	private String drugName;

	@Column(name="drug_strength")
	private int drugStrength;

	@Column(name="drug_usage_per_week")
	private int drugUsagePerWeek;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public MemberDrug() {
	}

	public int getMemberDrugsId() {
		return this.memberDrugsId;
	}

	public void setMemberDrugsId(int memberDrugsId) {
		this.memberDrugsId = memberDrugsId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDiseasesMgmtId() {
		return this.diseasesMgmtId;
	}

	public void setDiseasesMgmtId(int diseasesMgmtId) {
		this.diseasesMgmtId = diseasesMgmtId;
	}

	public String getDrugName() {
		return this.drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public int getDrugStrength() {
		return this.drugStrength;
	}

	public void setDrugStrength(int drugStrength) {
		this.drugStrength = drugStrength;
	}

	public int getDrugUsagePerWeek() {
		return this.drugUsagePerWeek;
	}

	public void setDrugUsagePerWeek(int drugUsagePerWeek) {
		this.drugUsagePerWeek = drugUsagePerWeek;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

}