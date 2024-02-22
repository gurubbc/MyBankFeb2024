package com.ofss.service;

import com.ofss.model.Account;
import com.ofss.model.CurrentAccount;
import com.ofss.model.Customer;
import com.ofss.model.SalaryAccount;
import com.ofss.model.SavingsAccount;
import com.ofss.util.MyUtility;

// This is a previleged class and can't be called by the caller

public class Services {
	public Account openAccount(Customer cust, String accountType, long initialAmount) {
		// we need to insert all that validations we had done yesterday to be placed here
		
		Account ac=null; // start with null object
		boolean isKycValid=false;
		
		if (initialAmount >= 5000) {
			// start the kyc validation process
			String mob=String.valueOf(cust.getMobileNumber());

			String aadharId1=String.valueOf(cust.getAadharId());

			if (mob.length()==10) {
			if (cust.getAadharId()!=0 && aadharId1.length()==12) {
				if (cust.getPancardId().length()>0 && cust.getPancardId().length()==10) {
					if (cust.getEmailId().length()>0) {
						isKycValid=true;
						// kyc is validated
						if (accountType.equalsIgnoreCase("Savings")) {
							ac=new SavingsAccount(MyUtility.getRandomNumber(), initialAmount, accountType, 1000, 0.02);
						}
						
						if (accountType.equalsIgnoreCase("Current")) {
							ac=new CurrentAccount(MyUtility.getRandomNumber(), initialAmount, accountType, 1000, 0.02);
						}
						
						if (accountType.equalsIgnoreCase("Salary")) {
							ac=new SalaryAccount(MyUtility.getRandomNumber(), initialAmount, accountType, 1000, "Permanent");
						}
					}
					else {
						System.out.println("KYC Failure: Please enter valid email id");
					}
					
				} else {
					System.out.println("KYC Failure: Please enter valid PAN id");
				}
			} else {
				System.out.println("KYC Failure: Please enter valid aadhar id");
			}
			} else {
				System.out.println("KYC Failure: Your mobile must be of 10 digits long");
			}
		} else {
			System.out.println("Can't open account: The initial amount should be greater than or equal to 5000");
			System.out.println("Deposit that and invoke the method");
			return null;
		}
		return ac; // One of the account types would have been created before returning
	}
}
