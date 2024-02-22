package com.ofss.model;

public abstract class Account {
	private int accountNo;
	private double accountBalance;
	private String accountType;
	private double minimumBalance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNo, double accountBalance, String accountType, double minimumBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.minimumBalance = minimumBalance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
	
	
}
