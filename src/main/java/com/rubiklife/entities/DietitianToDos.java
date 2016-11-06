package com.rubiklife.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DietitianToDos implements Serializable{

	private static final long serialVersionUID = 1L;

	public DietitianToDos() {
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="todo_id")
	private Integer todoId;
	private Integer dietitianId;
	private String subject;
	private String category;
	private String description;
	
	private Date todoDate;

	public Integer getTodoId() {
		return todoId;
	}

	public void setTodoId(Integer todoId) {
		this.todoId = todoId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTodoDate() {
		return todoDate;
	}

	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}

	public Integer getDietitianId() {
		return dietitianId;
	}

	public void setDietitianId(Integer dietitianId) {
		this.dietitianId = dietitianId;
	}
	
	
	
}
