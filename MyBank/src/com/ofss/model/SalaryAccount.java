package com.ofss.model;

public class SalaryAccount extends Account {
	
	private String employmentType;

	public SalaryAccount() {
		super();
		System.out.println("SalaryAccount: default constructor is called");
	}

	public SalaryAccount(int accountNo, double accountBalance, String accountType, double minimumBalance, String employmentType) {
		super(accountNo, accountBalance, accountType, minimumBalance);
		this.employmentType=employmentType;
		System.out.println("SalaryAccount: parameterized constructor is called");
	}

	@Override
	public String toString() {
		return "SalaryAccount [employmentType=" + employmentType + ", getAccountNo()=" + getAccountNo()
				+ ", getAccountBalance()=" + getAccountBalance() + ", getAccountType()=" + getAccountType()
				+ ", getMinimumBalance()=" + getMinimumBalance() + "]";
	}

	
	

}
