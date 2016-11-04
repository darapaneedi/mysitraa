package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_actviity database table.
 * 
 */
@Entity
@Table(name="member_actviity")
@NamedQuery(name="MemberActviity.findAll", query="SELECT m FROM MemberActviity m")
public class MemberActviity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_actviity_id")
	private int memberActviityId;

	@Column(name="activity_freq")
	private String activityFreq;

	@Column(name="activity_level_scale_1to5")
	private int activityLevelScale1to5;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public MemberActviity() {
	}

	public int getMemberActviityId() {
		return this.memberActviityId;
	}

	public void setMemberActviityId(int memberActviityId) {
		this.memberActviityId = memberActviityId;
	}

	public String getActivityFreq() {
		return this.activityFreq;
	}

	public void setActivityFreq(String activityFreq) {
		this.activityFreq = activityFreq;
	}

	public int getActivityLevelScale1to5() {
		return this.activityLevelScale1to5;
	}

	public void setActivityLevelScale1to5(int activityLevelScale1to5) {
		this.activityLevelScale1to5 = activityLevelScale1to5;
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