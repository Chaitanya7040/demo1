package com.cjc.app.fss.master.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gstId;
	private int gstPercent;
	
	private String gstDescription;
	private int gstStatus;
	
	public String getGstDescription() {
		return gstDescription;
	}
	public void setGstDescription(String gstDescription) {
		this.gstDescription = gstDescription;
	}
	public int getGstStatus() {
		return gstStatus;
	}
	public void setGstStatus(int gstStatus) {
		this.gstStatus = gstStatus;
	}
	
	public int getGstId() {
		return gstId;
	}
	public void setGstId(int gstId) {
		this.gstId = gstId;
	}
	public int getGstPercent() {
		return gstPercent;
	}
	public void setGstPercent(int gstPercent) {
		this.gstPercent = gstPercent;
	}
	
	
	


	

}
