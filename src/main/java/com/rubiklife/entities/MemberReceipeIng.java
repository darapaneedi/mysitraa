package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_receipe_ing database table.
 * 
 */
@Entity
@Table(name="member_receipe_ing")
@NamedQuery(name="MemberReceipeIng.findAll", query="SELECT m FROM MemberReceipeIng m")
public class MemberReceipeIng implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int member_receipe_Ing_id;

	@Column(name="ingredient_desc")
	private String ingredientDesc;

	@Column(name="ingredient_name")
	private String ingredientName;

	@Column(name="ingredient_quan")
	private int ingredientQuan;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="member_receipes_id")
	private int memberReceipesId;

	@Column(name="quantity_unit")
	private String quantityUnit;

	public MemberReceipeIng() {
	}

	public int getMember_receipe_Ing_id() {
		return this.member_receipe_Ing_id;
	}

	public void setMember_receipe_Ing_id(int member_receipe_Ing_id) {
		this.member_receipe_Ing_id = member_receipe_Ing_id;
	}

	public String getIngredientDesc() {
		return this.ingredientDesc;
	}

	public void setIngredientDesc(String ingredientDesc) {
		this.ingredientDesc = ingredientDesc;
	}

	public String getIngredientName() {
		return this.ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public int getIngredientQuan() {
		return this.ingredientQuan;
	}

	public void setIngredientQuan(int ingredientQuan) {
		this.ingredientQuan = ingredientQuan;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public int getMemberReceipesId() {
		return this.memberReceipesId;
	}

	public void setMemberReceipesId(int memberReceipesId) {
		this.memberReceipesId = memberReceipesId;
	}

	public String getQuantityUnit() {
		return this.quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

}