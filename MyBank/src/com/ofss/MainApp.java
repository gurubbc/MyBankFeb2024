package com.ofss;

import com.ofss.model.Account;
import com.ofss.model.Customer;
import com.ofss.service.CustomerService;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("Welcome to MyBank...");
		Customer customer=new Customer(1, "Bill", "Gates", "12 South Avenue, California", 'M', 9731801675L, "bill@msn.com", 1234123L, "M28275xks8");
		CustomerService customerService=new CustomerService();
		Account newAccountCreated=customerService.applyForNewAccount(customer, "Current", 15000L);
		if (newAccountCreated!=null) {
			System.out.println("Congratulations...your account has been created...the following are the details");
			System.out.println(newAccountCreated);
		} else {
			System.out.println("Your account has not been created....please see more details");
		}
			

	}

}
