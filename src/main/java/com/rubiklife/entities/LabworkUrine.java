package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the labwork_urine database table.
 * 
 */
@Entity
@Table(name="labwork_urine")
@NamedQuery(name="LabworkUrine.findAll", query="SELECT l FROM LabworkUrine l")
public class LabworkUrine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="labwork_id")
	private int labworkId;

	@Column(name="customer_id")
	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_exam")
	private Date dateOfExam;

	@Column(name="labwork_urinecol")
	private String labworkUrinecol;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="provider_id")
	private int providerId;

	@Column(name="u_bacteria")
	private String uBacteria;

	@Column(name="u_bilirubin")
	private String uBilirubin;

	@Column(name="u_blood")
	private String uBlood;

	@Column(name="u_color")
	private String uColor;

	@Column(name="u_epithelial_cells")
	private String uEpithelialCells;

	@Column(name="u_glucose")
	private String uGlucose;

	@Column(name="u_ketone")
	private String uKetone;

	@Column(name="u_leuk_esterase")
	private String uLeukEsterase;

	@Column(name="u_microscopic_ind")
	private String uMicroscopicInd;

	@Column(name="u_nitrite")
	private String uNitrite;

	@Column(name="u_ph")
	private int uPh;

	@Column(name="u_protein")
	private String uProtein;

	@Column(name="u_rbc")
	private String uRbc;

	@Column(name="u_spec_grav")
	private int uSpecGrav;

	@Column(name="u_urobilinogen")
	private int uUrobilinogen;

	@Column(name="u_wbc")
	private String uWbc;

	public LabworkUrine() {
	}

	public int getLabworkId() {
		return this.labworkId;
	}

	public void setLabworkId(int labworkId) {
		this.labworkId = labworkId;
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

	public String getLabworkUrinecol() {
		return this.labworkUrinecol;
	}

	public void setLabworkUrinecol(String labworkUrinecol) {
		this.labworkUrinecol = labworkUrinecol;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public int getProviderId() {
		return this.providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public String getUBacteria() {
		return this.uBacteria;
	}

	public void setUBacteria(String uBacteria) {
		this.uBacteria = uBacteria;
	}

	public String getUBilirubin() {
		return this.uBilirubin;
	}

	public void setUBilirubin(String uBilirubin) {
		this.uBilirubin = uBilirubin;
	}

	public String getUBlood() {
		return this.uBlood;
	}

	public void setUBlood(String uBlood) {
		this.uBlood = uBlood;
	}

	public String getUColor() {
		return this.uColor;
	}

	public void setUColor(String uColor) {
		this.uColor = uColor;
	}

	public String getUEpithelialCells() {
		return this.uEpithelialCells;
	}

	public void setUEpithelialCells(String uEpithelialCells) {
		this.uEpithelialCells = uEpithelialCells;
	}

	public String getUGlucose() {
		return this.uGlucose;
	}

	public void setUGlucose(String uGlucose) {
		this.uGlucose = uGlucose;
	}

	public String getUKetone() {
		return this.uKetone;
	}

	public void setUKetone(String uKetone) {
		this.uKetone = uKetone;
	}

	public String getULeukEsterase() {
		return this.uLeukEsterase;
	}

	public void setULeukEsterase(String uLeukEsterase) {
		this.uLeukEsterase = uLeukEsterase;
	}

	public String getUMicroscopicInd() {
		return this.uMicroscopicInd;
	}

	public void setUMicroscopicInd(String uMicroscopicInd) {
		this.uMicroscopicInd = uMicroscopicInd;
	}

	public String getUNitrite() {
		return this.uNitrite;
	}

	public void setUNitrite(String uNitrite) {
		this.uNitrite = uNitrite;
	}

	public int getUPh() {
		return this.uPh;
	}

	public void setUPh(int uPh) {
		this.uPh = uPh;
	}

	public String getUProtein() {
		return this.uProtein;
	}

	public void setUProtein(String uProtein) {
		this.uProtein = uProtein;
	}

	public String getURbc() {
		return this.uRbc;
	}

	public void setURbc(String uRbc) {
		this.uRbc = uRbc;
	}

	public int getUSpecGrav() {
		return this.uSpecGrav;
	}

	public void setUSpecGrav(int uSpecGrav) {
		this.uSpecGrav = uSpecGrav;
	}

	public int getUUrobilinogen() {
		return this.uUrobilinogen;
	}

	public void setUUrobilinogen(int uUrobilinogen) {
		this.uUrobilinogen = uUrobilinogen;
	}

	public String getUWbc() {
		return this.uWbc;
	}

	public void setUWbc(String uWbc) {
		this.uWbc = uWbc;
	}

}