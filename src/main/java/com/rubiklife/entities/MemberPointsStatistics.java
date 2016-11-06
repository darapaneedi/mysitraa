package com.rubiklife.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberPointsStatistics {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="statistics_id")
	private Integer statisticsId;
	
	private String pointsType;
	private String actionType;
	private String tranactionType;
	private String points;
	private Date activityDate;
	private Integer customerId;

	
	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public Integer getStatisticsId() {
		return statisticsId;
	}

	public void setStatisticsId(Integer statisticsId) {
		this.statisticsId = statisticsId;
	}

	public String getPointsType() {
		return pointsType;
	}

	public void setPointsType(String pointsType) {
		this.pointsType = pointsType;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getTranactionType() {
		return tranactionType;
	}

	public void setTranactionType(String tranactionType) {
		this.tranactionType = tranactionType;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	
}
