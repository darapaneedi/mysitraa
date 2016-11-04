package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_medical_cond_fly database table.
 * 
 */
@Entity
@Table(name="member_medical_cond_fly")
@NamedQuery(name="MemberMedicalCondFly.findAll", query="SELECT m FROM MemberMedicalCondFly m")
public class MemberMedicalCondFly implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mem_medcond_flyid")
	private int memMedcondFlyid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="condition_diag_date")
	private Date conditionDiagDate;

	@Column(name="condition_diag_fly")
	private String conditionDiagFly;

	@Column(name="condition_mgmt_id")
	private int conditionMgmtId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="member_provider_id")
	private int memberProviderId;

	public MemberMedicalCondFly() {
	}

	public int getMemMedcondFlyid() {
		return this.memMedcondFlyid;
	}

	public void setMemMedcondFlyid(int memMedcondFlyid) {
		this.memMedcondFlyid = memMedcondFlyid;
	}

	public Date getConditionDiagDate() {
		return this.conditionDiagDate;
	}

	public void setConditionDiagDate(Date conditionDiagDate) {
		this.conditionDiagDate = conditionDiagDate;
	}

	public String getConditionDiagFly() {
		return this.conditionDiagFly;
	}

	public void setConditionDiagFly(String conditionDiagFly) {
		this.conditionDiagFly = conditionDiagFly;
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