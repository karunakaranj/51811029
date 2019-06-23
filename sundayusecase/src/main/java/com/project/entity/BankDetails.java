package com.project.entity;

public class BankDetails {
	private CustomerMetaData customer;
	private double accountNo;
	private long balance;
	
	
	public BankDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerMetaData getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerMetaData customer) {
		this.customer = customer;
	}

	public double getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
   enum AccountType{
	   SAVING,
	   CURRENT,
	   DEMAT,
	   TRADING
   }

}
