package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_allergens database table.
 * 
 */
@Entity
@Table(name="member_allergens")
@NamedQuery(name="MemberAllergen.findAll", query="SELECT m FROM MemberAllergen m")
public class MemberAllergen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_allergens_id")
	private int memberAllergensId;

	@Column(name="allergens_id")
	private int allergensId;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_reported")
	private Date dateReported;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public MemberAllergen() {
	}

	public int getMemberAllergensId() {
		return this.memberAllergensId;
	}

	public void setMemberAllergensId(int memberAllergensId) {
		this.memberAllergensId = memberAllergensId;
	}

	public int getAllergensId() {
		return this.allergensId;
	}

	public void setAllergensId(int allergensId) {
		this.allergensId = allergensId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getDateReported() {
		return this.dateReported;
	}

	public void setDateReported(Date dateReported) {
		this.dateReported = dateReported;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

}