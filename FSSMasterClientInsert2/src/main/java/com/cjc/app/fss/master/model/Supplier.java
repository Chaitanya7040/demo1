package com.cjc.app.fss.master.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supplierId;
	private String supplierName;
	
	
	
	private long supplierCntctNumber;
	private String supplierEmailId;

	private String supplierGstn;
	private int supplierStatus;
	
	
	
	public long getSupplierCntctNumber() {
		return supplierCntctNumber;
	}

	public void setSupplierCntctNumber(long supplierCntctNumber) {
		this.supplierCntctNumber = supplierCntctNumber;
	}

	public String getSupplierEmailId() {
		return supplierEmailId;
	}

	public void setSupplierEmailId(String supplierEmailId) {
		this.supplierEmailId = supplierEmailId;
	}

	
	public String getSupplierGstn() {
		return supplierGstn;
	}

	public void setSupplierGstn(String supplierGstn) {
		this.supplierGstn = supplierGstn;
	}

	public int getSupplierStatus() {
		return supplierStatus;
	}

	public void setSupplierStatus(int supplierStatus) {
		this.supplierStatus = supplierStatus;
	}

	
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "acId")
	private Account account;
	
	@ManyToMany(fetch = FetchType.LAZY)
//	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="supplier_vendor",joinColumns = {@JoinColumn(name="spplr_id")},inverseJoinColumns = {@JoinColumn(name="ven_id")})
	private List<Vendor> vendor=new ArrayList<Vendor>();
	
	
	

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Vendor> getVendor() {
		return vendor;
	}

	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}

	

	
	
	
	
	
	



}
