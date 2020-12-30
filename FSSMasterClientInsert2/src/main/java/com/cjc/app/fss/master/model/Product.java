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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int productId;
	private String productName;
	
	
	private String productType;
	private String productHsn;

	private double productCostExcGst;
	private double productCostIncGst;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "gstID")
	private Gst gst;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "vendId")
	private List<Vendor> vendor =new ArrayList<Vendor>();
	
	
	@ManyToMany(fetch =FetchType.LAZY )
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@JoinColumn(name = "supplierId")
	private List<Supplier> supplier=new ArrayList<Supplier>();


	
	
	
	


	public double getProductCostExcGst() {
		return productCostExcGst;
	}


	public void setProductCostExcGst(double productCostExcGst) {
		this.productCostExcGst = productCostExcGst;
	}


	public double getProductCostIncGst() {
		return productCostIncGst;
	}


	public void setProductCostIncGst(double productCostIncGst) {
		this.productCostIncGst = productCostIncGst;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getProductHsn() {
		return productHsn;
	}


	public void setProductHsn(String productHsn) {
		this.productHsn = productHsn;
	}


	

	


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Gst getGst() {
		return gst;
	}


	public void setGst(Gst gst) {
		this.gst = gst;
	}


	




	public List<Vendor> getVendor() {
		return vendor;
	}


	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}


	public List<Supplier> getSupplier() {
		return supplier;
	}


	public void setSupplier(List<Supplier> supplier) {
		this.supplier = supplier;
	}


	

	//private String productManfactDate;
	
		//private String productExpDate;
	
	

}
