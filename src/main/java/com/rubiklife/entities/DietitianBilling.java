package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_billing database table.
 * 
 */
@Entity
@Table(name="dietitian_billing")
@NamedQuery(name="DietitianBilling.findAll", query="SELECT d FROM DietitianBilling d")
public class DietitianBilling implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_billing_id")
	private int dietitianBillingId;

	@Column(name="billing_hours")
	private int billingHours;

	@Column(name="billing_week")
	private int billingWeek;

	@Column(name="dieititian_id")
	private int dieititianId;

	@Column(name="dieititian_notes")
	private String dieititianNotes;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	@Column(name="member_id")
	private int memberId;

	public DietitianBilling() {
	}

	public int getDietitianBillingId() {
		return this.dietitianBillingId;
	}

	public void setDietitianBillingId(int dietitianBillingId) {
		this.dietitianBillingId = dietitianBillingId;
	}

	public int getBillingHours() {
		return this.billingHours;
	}

	public void setBillingHours(int billingHours) {
		this.billingHours = billingHours;
	}

	public int getBillingWeek() {
		return this.billingWeek;
	}

	public void setBillingWeek(int billingWeek) {
		this.billingWeek = billingWeek;
	}

	public int getDieititianId() {
		return this.dieititianId;
	}

	public void setDieititianId(int dieititianId) {
		this.dieititianId = dieititianId;
	}

	public String getDieititianNotes() {
		return this.dieititianNotes;
	}

	public void setDieititianNotes(String dieititianNotes) {
		this.dieititianNotes = dieititianNotes;
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

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

}