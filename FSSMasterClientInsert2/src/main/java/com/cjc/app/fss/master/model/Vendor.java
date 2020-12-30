package com.cjc.app.fss.master.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	private String vendorName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "acId")
	private Account account;
	
	
	private int vendorContactNumber;
	private String vendorEmailId;
	private String vendorGstn;
	private int statusId;
	
	
	
	public int getVendorContactNumber() {
		return vendorContactNumber;
	}

	public void setVendorContactNumber(int vendorContactNumber) {
		this.vendorContactNumber = vendorContactNumber;
	}

	public String getVendorEmailId() {
		return vendorEmailId;
	}

	public void setVendorEmailId(String vendorEmailId) {
		this.vendorEmailId = vendorEmailId;
	}

	public String getVendorGstn() {
		return vendorGstn;
	}

	public void setVendorGstn(String vendorGstn) {
		this.vendorGstn = vendorGstn;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	
	
//	private int vendorContactNumber;
//	private String vendorEmailId;
//	private String vendorGstn;
//	
//	private int statusId;
	
	
	
	

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
//	private int vendorContactNumber;
//	private String vendorEmailId;
//	private String vendorGstn;
//	
//	private int statusId;
	
	
	
	
	


	
	
}
