package com.cjc.app.fss.master.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int productId;
	private String productName;
//	private String productType;
//	private String productHsn;
//	private String productManfactDate;
//	private String product;
//	private String productExpDate;
//	private int	modelId;
//	private String productCostExcGst;
//	private String productCostIncGst;
//	private int gstId;
	
	

	
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
	
	
	

}
