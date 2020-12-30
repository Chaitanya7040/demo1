package com.cjc.app.fss.master.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	private String vendorName;
//	private int vendorContactNumber;
//	private String vendorEmailId;
	
	
	@OneToMany(cascade = CascadeType.ALL)
          
	@JoinColumn(name = "proId")
	private List<Product> product;
	
	
	
//	private String vendorGstn;
//	private int accountId;
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
//	public int getVendorContactNumber() {
//		return vendorContactNumber;
//	}
//	public void setVendorContactNumber(int vendorContactNumber) {
//		this.vendorContactNumber = vendorContactNumber;
//	}
//	public String getVendorEmailId() {
//		return vendorEmailId;
//	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
//	public void setVendorEmailId(String vendorEmailId) {
//		this.vendorEmailId = vendorEmailId;
//	}
//	
//	public String getVendorGstn() {
//		return vendorGstn;
//	}
//	public void setVendorGstn(String vendorGstn) {
//		this.vendorGstn = vendorGstn;
//	}
//	public int getAccountId() {
//		return accountId;
//	}
//	public void setAccountId(int accountId) {
//		this.accountId = accountId;
//	}
//	public int getStatusId() {
//		return statusId;
//	}
//	public void setStatusId(int statusId) {
//		this.statusId = statusId;
//	}
	
	
	
	
	
	
}
