package com.cjc.app.fss.master.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	private long accountNumber;
	
	private String accountBankName;
	private String accountBranchName;
	private String accountIfscCode;

	
	
	
	
	public String getAccountBankName() {
		return accountBankName;
	}
	public void setAccountBankName(String accountBankName) {
		this.accountBankName = accountBankName;
	}
	public String getAccountBranchName() {
		return accountBranchName;
	}
	public void setAccountBranchName(String accountBranchName) {
		this.accountBranchName = accountBranchName;
	}
	public String getAccountIfscCode() {
		return accountIfscCode;
	}
	public void setAccountIfscCode(String accountIfscCode) {
		this.accountIfscCode = accountIfscCode;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
//	private String accountHolderName;
//	private String accountBankName;
//	private String accountBranchName;
//	private String accountIfscCode;


	

}
