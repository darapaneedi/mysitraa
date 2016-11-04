package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_retail database table.
 * 
 */
@Entity
@Table(name="member_retail")
@NamedQuery(name="MemberRetail.findAll", query="SELECT m FROM MemberRetail m")
public class MemberRetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_retail_id")
	private int memberRetailId;

	@Column(name="all_retail_id")
	private int allRetailId;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="purchase_freq_permontth")
	private int purchaseFreqPermontth;

	public MemberRetail() {
	}

	public int getMemberRetailId() {
		return this.memberRetailId;
	}

	public void setMemberRetailId(int memberRetailId) {
		this.memberRetailId = memberRetailId;
	}

	public int getAllRetailId() {
		return this.allRetailId;
	}

	public void setAllRetailId(int allRetailId) {
		this.allRetailId = allRetailId;
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

	public int getPurchaseFreqPermontth() {
		return this.purchaseFreqPermontth;
	}

	public void setPurchaseFreqPermontth(int purchaseFreqPermontth) {
		this.purchaseFreqPermontth = purchaseFreqPermontth;
	}

}