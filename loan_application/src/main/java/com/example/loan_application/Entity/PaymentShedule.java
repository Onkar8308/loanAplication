package com.example.loan_application.Entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="payment_shedule")
public class PaymentShedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentsheduleid;
	private LocalDate paymentdate;
	private double principle;
	private double projectedintrest;
	private String paymentstatus;
	private double paymentamount;
	
	
	@Column(name="payment_shedule_Id")
	public int getPaymentsheduleid() {
		return paymentsheduleid;
	}
	public void setPaymentsheduleid(int paymentsheduleid) {
		this.paymentsheduleid = paymentsheduleid;
	}
	
	@Column(name="payment_date")
	public LocalDate getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(LocalDate paymentdate) {
		this.paymentdate = paymentdate;
	}
	
	@Column(name="principle")
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	
	@Column(name="projected_intrest")
	public double getProjectedintrest() {
		return projectedintrest;
	}
	public void setProjectedintrest(double projectedintrest) {
		this.projectedintrest = projectedintrest;
	}
	
	@Column(name="payment_status")
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	
	@Column(name="payment_amount")
	public double getPaymentamount() {
		return paymentamount;
	}
	public void setPaymentamount(double paymentamount) {
		this.paymentamount = paymentamount;
	}
	
	
	public PaymentShedule(){
		
	}
	
	public PaymentShedule(int paymentsheduleid, LocalDate paymentdate, double principle, double projectedintrest,
			String paymentstatus, double paymentamount) {
		super();
		this.paymentsheduleid = paymentsheduleid;
		this.paymentdate = paymentdate;
		this.principle = principle;
		this.projectedintrest = projectedintrest;
		this.paymentstatus = paymentstatus;
		this.paymentamount = paymentamount;
		}
	
	
	
	
	

}
