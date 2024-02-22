package com.ofss.model;

public class SavingsAccount extends Account {

	private double interestRate;

	public SavingsAccount() {
		super(); // will call parent class's constructor
		System.out.println("Savings Account default constructor");
	}

	public SavingsAccount(int accountNo, double accountBalance, String accountType, double minimumBalance, double interestRate) {
		super(accountNo, accountBalance, accountType, minimumBalance);
		this.interestRate=interestRate;
		System.out.println("Savings Account: parameterized constructor");
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", getAccountNo()=" + getAccountNo()
				+ ", getAccountBalance()=" + getAccountBalance() + ", getAccountType()=" + getAccountType()
				+ ", getMinimumBalance()=" + getMinimumBalance() + "]";
	}

	
	
	
}
