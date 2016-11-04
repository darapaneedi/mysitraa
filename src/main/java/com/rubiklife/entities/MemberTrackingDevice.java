package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_tracking_devices database table.
 * 
 */
@Entity
@Table(name="member_tracking_devices")
@NamedQuery(name="MemberTrackingDevice.findAll", query="SELECT m FROM MemberTrackingDevice m")
public class MemberTrackingDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_tracking_devices_id")
	private int memberTrackingDevicesId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="device_id")
	private int deviceId;

	@Column(name="device_usage_scale")
	private int deviceUsageScale;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	public MemberTrackingDevice() {
	}

	public int getMemberTrackingDevicesId() {
		return this.memberTrackingDevicesId;
	}

	public void setMemberTrackingDevicesId(int memberTrackingDevicesId) {
		this.memberTrackingDevicesId = memberTrackingDevicesId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getDeviceUsageScale() {
		return this.deviceUsageScale;
	}

	public void setDeviceUsageScale(int deviceUsageScale) {
		this.deviceUsageScale = deviceUsageScale;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

}