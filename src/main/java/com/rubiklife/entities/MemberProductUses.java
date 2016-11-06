package com.rubiklife.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="member_product_uses")
@NamedQuery(name="MemberProductUses.findAll", query="SELECT m FROM MemberProductUses m")
public class MemberProductUses implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_product_uses_id")
	private int memberProductUsesId;

	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="productName")
	private String ProductName;
	
	@Column(name="productQuantity")
	private int ProductQuantity;
	
	public MemberProductUses() {
	}

	public int getMemberProductUsesId() {
		return memberProductUsesId;
	}

	public void setMemberProductUsesId(int memberProductUsesId) {
		this.memberProductUsesId = memberProductUsesId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductQuantity() {
		return ProductQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	
	
}
