package com.example.loan_application.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.type.TrueFalseType;

@Entity
@Table(name = "loan")
public class LoanEntity {
	


	@Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerID;

	@Column(name="loan_id")
	private int loanID;
	
	@Column(name="payment_term")
	private String paymentTerm;
	
	@Column(name="loan_amount")
	private long loanAmount;
	
	@Column(name="tradedate")
	private LocalDate tradedate;
	
	@Column(name="loan_startdate")
	private LocalDate loanstartdate;
	
	@Column(name="maturity_date")
	private LocalDate maturitydate;
	
	@Column(name="payment_frequency")
	private int paymentFrquency;
	
	@Column(name="interest_rate")
	private long interestrate;
	
	@OneToMany
	@JoinColumn(name="payment_id")
	List<PaymentShedule> paymentShedule;
	
	
	
	@Column(name ="tenure")
	private int tenure;
	
	
	public String getPayment_term() {
		return paymentTerm;
	}
	public void setPayment_term(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}
	
	
	public List<PaymentShedule> getPaymentShedule() {
		return paymentShedule;
	}
	public void setPaymentShedule(List<PaymentShedule> paymentShedule) {
		this.paymentShedule = paymentShedule;
	}

	public int getLoanID() {
		return loanID;
	}
	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	

	public long getLoanamount() {
		return loanAmount;
	}
	public void setLoanamount(long loanamount) {
		this.loanAmount = loanamount;
	}
	

	public LocalDate getTradedate() {
		return tradedate;
	}
	public void setTradedate(LocalDate tradedate) {
		this.tradedate = tradedate;
	}
	

	public LocalDate getLoanstartdate() {
		return loanstartdate;
	}
	public void setLoanstartdate(LocalDate loanstartdate) {
		this.loanstartdate = loanstartdate;
	}
	

	public LocalDate getMaturitydate() {
		return maturitydate;
	}
	public void setMaturitydate(LocalDate maturitydate) {
		this.maturitydate = maturitydate;
	}
	

	public int getPayment_frquency() {
		return paymentFrquency;
	}
	public void setPayment_frquency(int paymentFrquency) {
		this.paymentFrquency = paymentFrquency;
	}
	
	

	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public long getInterest_rate() {
		return interestrate;
	}
	public void setInterest_rate(long interestRate) {
		this.interestrate = interestRate;
	}
	
	

	public LoanEntity(){
		
	}
	
	
	
	public LoanEntity(int customerID, int loanID, String paymentTerm, long loanamount, LocalDate tradedate,
			LocalDate loanstartdate, LocalDate maturitydate, int payment_frquency, int interest_rate,
			List<PaymentShedule> paymentShedule) {
		super();
		this.customerID = customerID;
		this.loanID = loanID;
		this.paymentTerm = paymentTerm;
		this.loanAmount = loanamount;
		this.tradedate = tradedate;
		this.loanstartdate = loanstartdate;
		this.maturitydate = maturitydate;
		this.paymentFrquency = payment_frquency;
		this.interestrate = interest_rate;
		this.paymentShedule = paymentShedule;
	}
	
	@Override
	public String toString() {
		return "Loan_entity [customerID=" + customerID + ", loanamount=" + loanAmount + ", tradedate=" + tradedate
				+ ", loanstartdate=" + loanstartdate + ", maturitydate=" + maturitydate + ", payment_frquency="
				+ paymentFrquency + ", interest_rate=" + interestrate + "]";
	}
	
	
	
	
	

	

}
