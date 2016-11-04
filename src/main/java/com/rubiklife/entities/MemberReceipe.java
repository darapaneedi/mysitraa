package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_receipes database table.
 * 
 */
@Entity
@Table(name="member_receipes")
@NamedQuery(name="MemberReceipe.findAll", query="SELECT m FROM MemberReceipe m")
public class MemberReceipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_receipes_id")
	private int memberReceipesId;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="receipe_description")
	private String receipeDescription;

	@Column(name="receipe_name")
	private String receipeName;

	@Column(name="receipe_url")
	private String receipeUrl;

	public MemberReceipe() {
	}

	public int getMemberReceipesId() {
		return this.memberReceipesId;
	}

	public void setMemberReceipesId(int memberReceipesId) {
		this.memberReceipesId = memberReceipesId;
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

	public String getReceipeDescription() {
		return this.receipeDescription;
	}

	public void setReceipeDescription(String receipeDescription) {
		this.receipeDescription = receipeDescription;
	}

	public String getReceipeName() {
		return this.receipeName;
	}

	public void setReceipeName(String receipeName) {
		this.receipeName = receipeName;
	}

	public String getReceipeUrl() {
		return this.receipeUrl;
	}

	public void setReceipeUrl(String receipeUrl) {
		this.receipeUrl = receipeUrl;
	}

}