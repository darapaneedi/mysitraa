package com.rubiklife.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: MemberAppointments
 *
 */
@Entity
@Table(name="MemberAppointments")
public class MemberAppointments implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public MemberAppointments() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appointment_id")
	private Integer appointmentId;
	
	private Integer memberId;
	
	private String subject;
	
	private Date appointmentDate;
	
	private String description;
	
	private Integer dietitianId;

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDietitianId() {
		return dietitianId;
	}

	public void setDietitianId(Integer dietitianId) {
		this.dietitianId = dietitianId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
   
}
