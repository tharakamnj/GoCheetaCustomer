package com.gocheeta.cab.entities;

import javax.validation.constraints.NotBlank;

public class Customer {

	private String customerId;
	
	@NotBlank(message = "is required")
	private String customerName;
	
	@NotBlank(message = "is required")
	private String phoneNo;
	
	@NotBlank(message = "is required")
	private String password;
	
	@NotBlank(message = "is required")
	private String email;
	
	public Customer(){

	}

	public Customer(String customer_Id) {
		super();
		this.customerId = customer_Id;
	}

	public Customer(String phone_No, String password) {
		super();
		this.phoneNo = phone_No;
		this.password = password;
	}
	
	public Customer(String customer_Id, String customer_Name, String phone_No,String email) {
		super();
		this.customerId = customer_Id;
		this.customerName = customer_Name;
		this.phoneNo = phone_No;
		this.email = email;
		
	}
	
	public Customer(String customer_Id, String customer_Name, String phone_No, String password,String email) {
		super();
		this.customerId = customer_Id;
		this.customerName = customer_Name;
		this.phoneNo = phone_No;
		this.password = password;
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customer_Id) {
		this.customerId = customer_Id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customer_Name) {
		this.customerName = customer_Name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phone_No) {
		this.phoneNo = phone_No;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customer_Id=" + customerId + ", customer_Name=" + customerName + ", phone_No=" + phoneNo
				+ ", password=" + password + ", email=" + email + "]";
	}

	
	
}
