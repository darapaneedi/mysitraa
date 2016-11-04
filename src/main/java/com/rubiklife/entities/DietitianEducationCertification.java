package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_education_certification database table.
 * 
 */
@Entity
@Table(name="dietitian_education_certification")
@NamedQuery(name="DietitianEducationCertification.findAll", query="SELECT d FROM DietitianEducationCertification d")
public class DietitianEducationCertification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_education_id")
	private int dietitianEducationId;

	@Column(name="certfication_name")
	private String certficationName;

	@Column(name="certification_desc")
	private String certificationDesc;

	@Column(name="certification_gpa")
	private int certificationGpa;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	@Column(name="license_number")
	private String licenseNumber;

	public DietitianEducationCertification() {
	}

	public int getDietitianEducationId() {
		return this.dietitianEducationId;
	}

	public void setDietitianEducationId(int dietitianEducationId) {
		this.dietitianEducationId = dietitianEducationId;
	}

	public String getCertficationName() {
		return this.certficationName;
	}

	public void setCertficationName(String certficationName) {
		this.certficationName = certficationName;
	}

	public String getCertificationDesc() {
		return this.certificationDesc;
	}

	public void setCertificationDesc(String certificationDesc) {
		this.certificationDesc = certificationDesc;
	}

	public int getCertificationGpa() {
		return this.certificationGpa;
	}

	public void setCertificationGpa(int certificationGpa) {
		this.certificationGpa = certificationGpa;
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

	public String getLastUpdtUser() {
		return this.lastUpdtUser;
	}

	public void setLastUpdtUser(String lastUpdtUser) {
		this.lastUpdtUser = lastUpdtUser;
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

}