package com.cjc.app.fss.master.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supplierId;
	private String supplierName;
	
	
	
	
	
	
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
	
	
//	private long supplierCntctNumber;
//	private String supplierEmailId;
//	private int vendorId;
//	private int productId;
//	private String supplierGstn;
//	private int accountId;
//	private int supplierStatus;


}
