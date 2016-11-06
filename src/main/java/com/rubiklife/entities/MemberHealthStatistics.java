package com.rubiklife.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberHealthStatistics {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="statistics_id")
	private Integer statisticsId;
	
	private Integer customerId;
	
	private String type;
	
	private Date statisticsDate;
	
	private Integer unit;

	public Integer getStatisticsId() {
		return statisticsId;
	}

	public void setStatisticsId(Integer statisticsId) {
		this.statisticsId = statisticsId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getStatisticsDate() {
		return statisticsDate;
	}

	public void setStatisticsDate(Date statisticsDate) {
		this.statisticsDate = statisticsDate;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	
}
