package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the anthropometrics database table.
 * 
 */
@Entity
@Table(name="anthropometrics")
@NamedQuery(name="Anthropometric.findAll", query="SELECT a FROM Anthropometric a")
public class Anthropometric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer anthropometrics_id;

	private String age;

	@Column(name="calculated_bmi")
	private int calculatedBmi;

	@Column(name="customer_id")
	private Integer customerId;

	@Column(name="date_of_exam")
	private Date dateOfExam;

	private int height;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update")
	private Date lastUpdate;

	@Column(name="ordered_by_physician")
	private int orderedByPhysician;

	@Column(name="overall_health")
	private String overallHealth;

	private String sex;

	@Column(name="waist_size")
	private int waistSize;

	private String weight;

	public Anthropometric() {
	}

	public Integer getAnthropometrics_id() {
		return this.anthropometrics_id;
	}

	public void setAnthropometrics_id(Integer anthropometrics_id) {
		this.anthropometrics_id = anthropometrics_id;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getCalculatedBmi() {
		return this.calculatedBmi;
	}

	public void setCalculatedBmi(int calculatedBmi) {
		this.calculatedBmi = calculatedBmi;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getDateOfExam() {
		return this.dateOfExam;
	}

	public void setDateOfExam(Date dateOfExam) {
		this.dateOfExam = dateOfExam;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getOrderedByPhysician() {
		return this.orderedByPhysician;
	}

	public void setOrderedByPhysician(int orderedByPhysician) {
		this.orderedByPhysician = orderedByPhysician;
	}

	public String getOverallHealth() {
		return this.overallHealth;
	}

	public void setOverallHealth(String overallHealth) {
		this.overallHealth = overallHealth;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getWaistSize() {
		return this.waistSize;
	}

	public void setWaistSize(int waistSize) {
		this.waistSize = waistSize;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}