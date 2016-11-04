package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the all_retail database table.
 * 
 */
@Entity
@Table(name="all_retail")
@NamedQuery(name="AllRetail.findAll", query="SELECT a FROM AllRetail a")
public class AllRetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="all_retail_id")
	private int allRetailId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="retail_descritption")
	private String retailDescritption;

	@Column(name="retail_location")
	private String retailLocation;

	@Column(name="retail_name")
	private String retailName;

	@Column(name="retail_type")
	private String retailType;

	public AllRetail() {
	}

	public int getAllRetailId() {
		return this.allRetailId;
	}

	public void setAllRetailId(int allRetailId) {
		this.allRetailId = allRetailId;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public String getRetailDescritption() {
		return this.retailDescritption;
	}

	public void setRetailDescritption(String retailDescritption) {
		this.retailDescritption = retailDescritption;
	}

	public String getRetailLocation() {
		return this.retailLocation;
	}

	public void setRetailLocation(String retailLocation) {
		this.retailLocation = retailLocation;
	}

	public String getRetailName() {
		return this.retailName;
	}

	public void setRetailName(String retailName) {
		this.retailName = retailName;
	}

	public String getRetailType() {
		return this.retailType;
	}

	public void setRetailType(String retailType) {
		this.retailType = retailType;
	}

}