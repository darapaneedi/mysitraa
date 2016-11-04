package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_medical_cond database table.
 * 
 */
@Entity
@Table(name="member_medical_cond")
@NamedQuery(name="MemberMedicalCond.findAll", query="SELECT m FROM MemberMedicalCond m")
public class MemberMedicalCond implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mem_medcond_id")
	private int memMedcondId;

	@Column(name="condition_diag")
	private String conditionDiag;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="condition_diag_date")
	private Date conditionDiagDate;

	@Column(name="condition_mgmt_id")
	private int conditionMgmtId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="member_provider_id")
	private int memberProviderId;

	public MemberMedicalCond() {
	}

	public int getMemMedcondId() {
		return this.memMedcondId;
	}

	public void setMemMedcondId(int memMedcondId) {
		this.memMedcondId = memMedcondId;
	}

	public String getConditionDiag() {
		return this.conditionDiag;
	}

	public void setConditionDiag(String conditionDiag) {
		this.conditionDiag = conditionDiag;
	}

	public Date getConditionDiagDate() {
		return this.conditionDiagDate;
	}

	public void setConditionDiagDate(Date conditionDiagDate) {
		this.conditionDiagDate = conditionDiagDate;
	}

	public int getConditionMgmtId() {
		return this.conditionMgmtId;
	}

	public void setConditionMgmtId(int conditionMgmtId) {
		this.conditionMgmtId = conditionMgmtId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getMemberProviderId() {
		return this.memberProviderId;
	}

	public void setMemberProviderId(int memberProviderId) {
		this.memberProviderId = memberProviderId;
	}

}