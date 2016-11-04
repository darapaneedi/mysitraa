package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hospital_affiliations database table.
 * 
 */
@Entity
@Table(name="hospital_affiliations")
@NamedQuery(name="HospitalAffiliation.findAll", query="SELECT h FROM HospitalAffiliation h")
public class HospitalAffiliation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hospital_affiliations_id")
	private int hospitalAffiliationsId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_join")
	private Date dateOfJoin;

	private String designation;

	@Column(name="dieitian_id")
	private int dieitianId;

	@Column(name="hospital_address")
	private String hospitalAddress;

	@Column(name="hospital_name")
	private String hospitalName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="provider_id")
	private String providerId;

	public HospitalAffiliation() {
	}

	public int getHospitalAffiliationsId() {
		return this.hospitalAffiliationsId;
	}

	public void setHospitalAffiliationsId(int hospitalAffiliationsId) {
		this.hospitalAffiliationsId = hospitalAffiliationsId;
	}

	public Date getDateOfJoin() {
		return this.dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getDieitianId() {
		return this.dieitianId;
	}

	public void setDieitianId(int dieitianId) {
		this.dieitianId = dieitianId;
	}

	public String getHospitalAddress() {
		return this.hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

}