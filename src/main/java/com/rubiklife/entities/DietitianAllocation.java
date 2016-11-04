package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dietitian_allocation database table.
 * 
 */
@Entity
@Table(name="dietitian_allocation")
@NamedQuery(name="DietitianAllocation.findAll", query="SELECT d FROM DietitianAllocation d")
public class DietitianAllocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dietitian_allocation_id")
	private int dietitianAllocationId;

	@Column(name="allocation_month")
	private String allocationMonth;

	@Column(name="allocation_percentage")
	private int allocationPercentage;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	@Column(name="overtime_limit")
	private int overtimeLimit;

	public DietitianAllocation() {
	}

	public int getDietitianAllocationId() {
		return this.dietitianAllocationId;
	}

	public void setDietitianAllocationId(int dietitianAllocationId) {
		this.dietitianAllocationId = dietitianAllocationId;
	}

	public String getAllocationMonth() {
		return this.allocationMonth;
	}

	public void setAllocationMonth(String allocationMonth) {
		this.allocationMonth = allocationMonth;
	}

	public int getAllocationPercentage() {
		return this.allocationPercentage;
	}

	public void setAllocationPercentage(int allocationPercentage) {
		this.allocationPercentage = allocationPercentage;
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

	public int getOvertimeLimit() {
		return this.overtimeLimit;
	}

	public void setOvertimeLimit(int overtimeLimit) {
		this.overtimeLimit = overtimeLimit;
	}

}