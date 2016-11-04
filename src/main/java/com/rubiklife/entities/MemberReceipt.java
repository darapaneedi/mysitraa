package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the member_receipt database table.
 * 
 */
@Entity
@Table(name="member_receipt")
@NamedQuery(name="MemberReceipt.findAll", query="SELECT m FROM MemberReceipt m")
public class MemberReceipt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="retail_member_receipts_id")
	private int retailMemberReceiptsId;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_receipt")
	private Date dateOfReceipt;

	@Column(name="last_updt")
	private Time lastUpdt;

	@Lob
	@Column(name="receip_image")
	private byte[] receipImage;

	@Column(name="retailer_id")
	private String retailerId;

	@Column(name="uploaded_via")
	private String uploadedVia;

	public MemberReceipt() {
	}

	public int getRetailMemberReceiptsId() {
		return this.retailMemberReceiptsId;
	}

	public void setRetailMemberReceiptsId(int retailMemberReceiptsId) {
		this.retailMemberReceiptsId = retailMemberReceiptsId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getDateOfReceipt() {
		return this.dateOfReceipt;
	}

	public void setDateOfReceipt(Date dateOfReceipt) {
		this.dateOfReceipt = dateOfReceipt;
	}

	public Time getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Time lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public byte[] getReceipImage() {
		return this.receipImage;
	}

	public void setReceipImage(byte[] receipImage) {
		this.receipImage = receipImage;
	}

	public String getRetailerId() {
		return this.retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getUploadedVia() {
		return this.uploadedVia;
	}

	public void setUploadedVia(String uploadedVia) {
		this.uploadedVia = uploadedVia;
	}

}