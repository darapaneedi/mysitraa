package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the labwork_blood database table.
 * 
 */
@Entity
@Table(name="labwork_blood")
@NamedQuery(name="LabworkBlood.findAll", query="SELECT l FROM LabworkBlood l")
public class LabworkBlood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idlabwork_blood_id")
	private int idlabworkBloodId;

	@Column(name="alanine_amino")
	private int alanineAmino;

	@Column(name="albumin_globulin_ratio")
	private int albuminGlobulinRatio;

	@Column(name="albumin_serum")
	private int albuminSerum;

	@Column(name="alkaline_phosphatase")
	private int alkalinePhosphatase;

	@Column(name="aspartate_aminotransferase")
	private int aspartateAminotransferase;

	@Column(name="bilrubin_total")
	private int bilrubinTotal;

	@Column(name="bun_creatinine_ratio")
	private int bunCreatinineRatio;

	@Column(name="carbon_dioxide")
	private int carbonDioxide;

	private int chloride;

	private int cholestrol;

	@Column(name="creatinine_serum")
	private int creatinineSerum;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_exam")
	private Date dateOfExam;

	private int gct;

	@Column(name="globulin_total")
	private int globulinTotal;

	@Column(name="glomerular_egfr")
	private int glomerularEgfr;

	private int glucose;

	private int hdl;

	@Column(name="hdl_ratio")
	private int hdlRatio;

	private int hemoglobin;

	private int iron;

	@Column(name="lactate_dehydrogenase")
	private int lactateDehydrogenase;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	private int ldl;

	@Column(name="physician_id")
	private int physicianId;

	private int potassium;

	private int protein;

	private int rbc;

	@Column(name="sodium_serum")
	private int sodiumSerum;

	private int triglycerides;

	@Column(name="urea_nitrogen")
	private int ureaNitrogen;

	@Column(name="uric_acid")
	private int uricAcid;

	private int wbc;

	public LabworkBlood() {
	}

	public int getIdlabworkBloodId() {
		return this.idlabworkBloodId;
	}

	public void setIdlabworkBloodId(int idlabworkBloodId) {
		this.idlabworkBloodId = idlabworkBloodId;
	}

	public int getAlanineAmino() {
		return this.alanineAmino;
	}

	public void setAlanineAmino(int alanineAmino) {
		this.alanineAmino = alanineAmino;
	}

	public int getAlbuminGlobulinRatio() {
		return this.albuminGlobulinRatio;
	}

	public void setAlbuminGlobulinRatio(int albuminGlobulinRatio) {
		this.albuminGlobulinRatio = albuminGlobulinRatio;
	}

	public int getAlbuminSerum() {
		return this.albuminSerum;
	}

	public void setAlbuminSerum(int albuminSerum) {
		this.albuminSerum = albuminSerum;
	}

	public int getAlkalinePhosphatase() {
		return this.alkalinePhosphatase;
	}

	public void setAlkalinePhosphatase(int alkalinePhosphatase) {
		this.alkalinePhosphatase = alkalinePhosphatase;
	}

	public int getAspartateAminotransferase() {
		return this.aspartateAminotransferase;
	}

	public void setAspartateAminotransferase(int aspartateAminotransferase) {
		this.aspartateAminotransferase = aspartateAminotransferase;
	}

	public int getBilrubinTotal() {
		return this.bilrubinTotal;
	}

	public void setBilrubinTotal(int bilrubinTotal) {
		this.bilrubinTotal = bilrubinTotal;
	}

	public int getBunCreatinineRatio() {
		return this.bunCreatinineRatio;
	}

	public void setBunCreatinineRatio(int bunCreatinineRatio) {
		this.bunCreatinineRatio = bunCreatinineRatio;
	}

	public int getCarbonDioxide() {
		return this.carbonDioxide;
	}

	public void setCarbonDioxide(int carbonDioxide) {
		this.carbonDioxide = carbonDioxide;
	}

	public int getChloride() {
		return this.chloride;
	}

	public void setChloride(int chloride) {
		this.chloride = chloride;
	}

	public int getCholestrol() {
		return this.cholestrol;
	}

	public void setCholestrol(int cholestrol) {
		this.cholestrol = cholestrol;
	}

	public int getCreatinineSerum() {
		return this.creatinineSerum;
	}

	public void setCreatinineSerum(int creatinineSerum) {
		this.creatinineSerum = creatinineSerum;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getDateOfExam() {
		return this.dateOfExam;
	}

	public void setDateOfExam(Date dateOfExam) {
		this.dateOfExam = dateOfExam;
	}

	public int getGct() {
		return this.gct;
	}

	public void setGct(int gct) {
		this.gct = gct;
	}

	public int getGlobulinTotal() {
		return this.globulinTotal;
	}

	public void setGlobulinTotal(int globulinTotal) {
		this.globulinTotal = globulinTotal;
	}

	public int getGlomerularEgfr() {
		return this.glomerularEgfr;
	}

	public void setGlomerularEgfr(int glomerularEgfr) {
		this.glomerularEgfr = glomerularEgfr;
	}

	public int getGlucose() {
		return this.glucose;
	}

	public void setGlucose(int glucose) {
		this.glucose = glucose;
	}

	public int getHdl() {
		return this.hdl;
	}

	public void setHdl(int hdl) {
		this.hdl = hdl;
	}

	public int getHdlRatio() {
		return this.hdlRatio;
	}

	public void setHdlRatio(int hdlRatio) {
		this.hdlRatio = hdlRatio;
	}

	public int getHemoglobin() {
		return this.hemoglobin;
	}

	public void setHemoglobin(int hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public int getIron() {
		return this.iron;
	}

	public void setIron(int iron) {
		this.iron = iron;
	}

	public int getLactateDehydrogenase() {
		return this.lactateDehydrogenase;
	}

	public void setLactateDehydrogenase(int lactateDehydrogenase) {
		this.lactateDehydrogenase = lactateDehydrogenase;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public int getLdl() {
		return this.ldl;
	}

	public void setLdl(int ldl) {
		this.ldl = ldl;
	}

	public int getPhysicianId() {
		return this.physicianId;
	}

	public void setPhysicianId(int physicianId) {
		this.physicianId = physicianId;
	}

	public int getPotassium() {
		return this.potassium;
	}

	public void setPotassium(int potassium) {
		this.potassium = potassium;
	}

	public int getProtein() {
		return this.protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getRbc() {
		return this.rbc;
	}

	public void setRbc(int rbc) {
		this.rbc = rbc;
	}

	public int getSodiumSerum() {
		return this.sodiumSerum;
	}

	public void setSodiumSerum(int sodiumSerum) {
		this.sodiumSerum = sodiumSerum;
	}

	public int getTriglycerides() {
		return this.triglycerides;
	}

	public void setTriglycerides(int triglycerides) {
		this.triglycerides = triglycerides;
	}

	public int getUreaNitrogen() {
		return this.ureaNitrogen;
	}

	public void setUreaNitrogen(int ureaNitrogen) {
		this.ureaNitrogen = ureaNitrogen;
	}

	public int getUricAcid() {
		return this.uricAcid;
	}

	public void setUricAcid(int uricAcid) {
		this.uricAcid = uricAcid;
	}

	public int getWbc() {
		return this.wbc;
	}

	public void setWbc(int wbc) {
		this.wbc = wbc;
	}

}