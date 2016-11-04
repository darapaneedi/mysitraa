package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the diseases_mgmt database table.
 * 
 */
@Entity
@Table(name="diseases_mgmt")
@NamedQuery(name="DiseasesMgmt.findAll", query="SELECT d FROM DiseasesMgmt d")
public class DiseasesMgmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="diseases_mgmt_id")
	private int diseasesMgmtId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="diag_cd")
	private String diagCd;

	@Column(name="diseases_name")
	private String diseasesName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update")
	private Date lastUpdate;

	public DiseasesMgmt() {
	}

	public int getDiseasesMgmtId() {
		return this.diseasesMgmtId;
	}

	public void setDiseasesMgmtId(int diseasesMgmtId) {
		this.diseasesMgmtId = diseasesMgmtId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDiagCd() {
		return this.diagCd;
	}

	public void setDiagCd(String diagCd) {
		this.diagCd = diagCd;
	}

	public String getDiseasesName() {
		return this.diseasesName;
	}

	public void setDiseasesName(String diseasesName) {
		this.diseasesName = diseasesName;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}