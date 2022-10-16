package com.example.loan_application.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import utility.LoanMessageConstans;

@Entity
@Table(name = "login_details")
public class CustomerLoginEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	 private int customerId;
	
	@Column(name="password")
	private String password;
	
	public int getId() {
		return customerId;
	}

	public void setId(int id) {
		this.customerId = id;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerLoginEntity(){
		
	}

	public CustomerLoginEntity(int id, String password) {
		super();
		this.customerId = id;
		this.password = password;
	}

	
}
