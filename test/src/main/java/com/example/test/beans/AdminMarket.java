package com.example.test.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AdminMarket {
	
	@Id
	@GeneratedValue
	private int adminId;
	private String adminName;
	private boolean adminStatus;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return adminName;
	}
	public void setName(String name) {
		this.adminName = name;
	}

	public boolean isStatus() {
		return adminStatus;
	}
	public void setStatus(boolean status) {
		this.adminStatus = status;
	}

}
