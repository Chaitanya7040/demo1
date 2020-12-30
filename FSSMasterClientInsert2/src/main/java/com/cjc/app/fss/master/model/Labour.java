
package com.cjc.app.fss.master.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Labour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int labourId;
	private String labourName;
	
	
	private double labourCostExcGst;
	private double labourCostIncGst;
	private String labourDescription;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "gstId")
	private Gst gst;
	
	
	
	
	public double getLabourCostExcGst() {
		return labourCostExcGst;
	}
	public void setLabourCostExcGst(double labourCostExcGst) {
		this.labourCostExcGst = labourCostExcGst;
	}
	public double getLabourCostIncGst() {
		return labourCostIncGst;
	}
	public void setLabourCostIncGst(double labourCostIncGst) {
		this.labourCostIncGst = labourCostIncGst;
	}
	public String getLabourDescription() {
		return labourDescription;
	}
	public void setLabourDescription(String labourDescription) {
		this.labourDescription = labourDescription;
	}
	public int getLabourId() {
		return labourId;
	}
	public void setLabourId(int labourId) {
		this.labourId = labourId;
	}
	public String getLabourName() {
		return labourName;
	}
	public void setLabourName(String labourName) {
		this.labourName = labourName;
	}
	public Gst getGst() {
		return gst;
	}
	public void setGst(Gst gst) {
		this.gst = gst;
	}
	
	
	
	
	


}
