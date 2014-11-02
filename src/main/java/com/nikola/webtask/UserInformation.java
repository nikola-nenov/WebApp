package com.nikola.webtask;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinformation")
public class UserInformation {

	@Id
	@GeneratedValue
	private int rollNo;
	private String ip;
	private String userAgent;
	private Date date;

	public UserInformation(String ip, String userAgent, Date date) {
		super();
		this.ip = ip;
		this.userAgent = userAgent;
		this.date = date;
	}

	public UserInformation() {
		super();
	}

	@Column(name = "rollNo")
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Column(name = "ip")
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "userAgent")
	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public Date getDate() {
		return date;
	}

	@Column(name = "date")
	public void setDate(Date date) {
		this.date = date;
	}
}
