package com.ofss.model;

public class CurrentAccount extends Account {

	private double overDraftLimit;

	public CurrentAccount() {
		super();
		System.out.println("CurrentAccount: default constructor is called");
	}

	public CurrentAccount(int accountNo, double accountBalance, String accountType, double minimumBalance, double overDraftLimit) {
		super(accountNo, accountBalance, accountType, minimumBalance);
		this.overDraftLimit=overDraftLimit;
		System.out.println("CurrentAccount: parameterized constructor is called");
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", getAccountNo()=" + getAccountNo()
				+ ", getAccountBalance()=" + getAccountBalance() + ", getAccountType()=" + getAccountType()
				+ ", getMinimumBalance()=" + getMinimumBalance() + "]";
	}


	
	
}
