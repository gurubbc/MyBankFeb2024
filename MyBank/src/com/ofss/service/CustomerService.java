package com.ofss.service;


import com.ofss.model.Account;
import com.ofss.model.Customer;

public class CustomerService {
	// if the account creation is successful,
	// we must return the account id, account type, account balance, minimum Balance,
	// if it is successful, it will return an object of Account type
	public Account applyForNewAccount(Customer cust, String accountType, long initialAmount ) {
		Services services=new Services();
		return services.openAccount(cust, accountType, initialAmount);
	}
}
