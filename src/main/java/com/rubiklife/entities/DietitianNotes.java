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
@Table(name="dititian_notes")
@NamedQuery(name="DietitianNotes.findAll", query="SELECT m FROM DietitianNotes m")
public class DietitianNotes implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dititian_notes_id")
	private int dititianNotesId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="dititian_id")
	private int dititianId;
	
	@Column(name="dititian_notes")
	private String dititianNotes;

	public DietitianNotes() {
		
	}
	
	public int getDititianNotesId() {
		return dititianNotesId;
	}

	public void setDititianNotesId(int dititianNotesId) {
		this.dititianNotesId = dititianNotesId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDititianId() {
		return dititianId;
	}

	public void setDititianId(int dititianId) {
		this.dititianId = dititianId;
	}

	public String getDititianNotes() {
		return dititianNotes;
	}

	public void setDititianNotes(String dititianNotes) {
		this.dititianNotes = dititianNotes;
	}
	
	
	
}
