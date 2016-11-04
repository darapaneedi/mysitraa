package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the memberprovider database table.
 * 
 */
@Entity
@NamedQuery(name="Memberprovider.findAll", query="SELECT m FROM Memberprovider m")
public class Memberprovider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_provider_id")
	private int memberProviderId;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update")
	private Date lastUpdate;

	private int medicaid;

	private int medicare;

	@Column(name="member_emr_pwd")
	private String memberEmrPwd;

	@Column(name="member_emr_uid")
	private String memberEmrUid;

	private int npi;

	@Column(name="provider_address1")
	private String providerAddress1;

	@Column(name="provider_address2")
	private String providerAddress2;

	@Column(name="provider_city")
	private String providerCity;

	@Column(name="provider_country")
	private String providerCountry;

	@Column(name="provider_name")
	private String providerName;

	@Column(name="provider_portal")
	private String providerPortal;

	@Column(name="provider_speciality")
	private String providerSpeciality;

	@Column(name="provider_zip")
	private String providerZip;

	public Memberprovider() {
	}

	public int getMemberProviderId() {
		return this.memberProviderId;
	}

	public void setMemberProviderId(int memberProviderId) {
		this.memberProviderId = memberProviderId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getMedicaid() {
		return this.medicaid;
	}

	public void setMedicaid(int medicaid) {
		this.medicaid = medicaid;
	}

	public int getMedicare() {
		return this.medicare;
	}

	public void setMedicare(int medicare) {
		this.medicare = medicare;
	}

	public String getMemberEmrPwd() {
		return this.memberEmrPwd;
	}

	public void setMemberEmrPwd(String memberEmrPwd) {
		this.memberEmrPwd = memberEmrPwd;
	}

	public String getMemberEmrUid() {
		return this.memberEmrUid;
	}

	public void setMemberEmrUid(String memberEmrUid) {
		this.memberEmrUid = memberEmrUid;
	}

	public int getNpi() {
		return this.npi;
	}

	public void setNpi(int npi) {
		this.npi = npi;
	}

	public String getProviderAddress1() {
		return this.providerAddress1;
	}

	public void setProviderAddress1(String providerAddress1) {
		this.providerAddress1 = providerAddress1;
	}

	public String getProviderAddress2() {
		return this.providerAddress2;
	}

	public void setProviderAddress2(String providerAddress2) {
		this.providerAddress2 = providerAddress2;
	}

	public String getProviderCity() {
		return this.providerCity;
	}

	public void setProviderCity(String providerCity) {
		this.providerCity = providerCity;
	}

	public String getProviderCountry() {
		return this.providerCountry;
	}

	public void setProviderCountry(String providerCountry) {
		this.providerCountry = providerCountry;
	}

	public String getProviderName() {
		return this.providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderPortal() {
		return this.providerPortal;
	}

	public void setProviderPortal(String providerPortal) {
		this.providerPortal = providerPortal;
	}

	public String getProviderSpeciality() {
		return this.providerSpeciality;
	}

	public void setProviderSpeciality(String providerSpeciality) {
		this.providerSpeciality = providerSpeciality;
	}

	public String getProviderZip() {
		return this.providerZip;
	}

	public void setProviderZip(String providerZip) {
		this.providerZip = providerZip;
	}

}