package com.ofss.model;

import java.util.*;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private char gender;
	private long mobileNumber;
	private String emailId;
	private long aadharId;
	private String pancardId;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String firstName, String lastName, String address, char gender, long mobileNumber,
			String emailId, long aadharId, String pancardId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.aadharId = aadharId;
		this.pancardId = pancardId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getAadharId() {
		return aadharId;
	}
	public void setAadharId(long aadharId) {
		this.aadharId = aadharId;
	}
	public String getPancardId() {
		return pancardId;
	}
	public void setPancardId(String pancardId) {
		this.pancardId = pancardId;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", aadharId="
				+ aadharId + ", pancardId=" + pancardId + "]";
	}

	public void deposit(double depositAmount) {
		System.out.println("Customer wants to depsoit amount Rs. "+depositAmount);
	}

	
	public double withdraw(double withdrawAmount) {
		System.out.println("Customer wants to withdraw Rs. "+withdrawAmount);
		return withdrawAmount;
	}

	public void invest(double investmentMoney) {
		System.out.println("Customer wants to invest Rs. "+investmentMoney);
	}
	
	public void createAccount() {
		
		Random r=new Random();
		this.id=r.nextInt(999);

	}
	
	
	public boolean openAccount() {
		// validate the mobile number to be 10 digits
		// since there is no length function available on number data type, 
		// we must convert long into String
		// This concept is called as TYPE CASTING
		
		String mob=String.valueOf(this.mobileNumber);
		
		
		boolean isKYCValid=false;
		String aadharId1=String.valueOf(this.aadharId);

		if (mob.length()==10) {
		if (this.aadharId!=0 && aadharId1.length()==12) {
			if (this.pancardId.length()>0 && this.pancardId.length()==10) {
				if (this.emailId.length()>0) {
					isKYCValid=true;
					createAccount();
					
				}
				
			}
		}
		}
		
		return isKYCValid;
		
	}
}
