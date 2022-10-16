package com.example.loan_application.Service;


import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import com.example.loan_application.Entity.LoanEntity;
import com.example.loan_application.Entity.PaymentShedule;
import com.example.loan_application.Repository.LoanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utility.LoanMessageConstans;

@Service
public class LoanService {
	
	int interest_percent=5;
	
	@Autowired
	LoanRepository loanRepo;
	
	
	@Autowired
	PaymentSheduleService paymentSheduleService;
	
	
	public List<com.example.loan_application.Entity.LoanEntity> getalloan() {
		// TODO Auto-generated method stub
		return loanRepo.findAll();
//		LoanEntity showLoan=findloan(LoanEntity);
//		return  showLoan ;
	}

	
	
	public LoanEntity saveloan(LoanEntity loan) {
		loan.setPaymentShedule(paymentSheduleService.addpaymentshedule(loan));
		loan.setTradedate(LocalDate.now());
		loan.setMaturitydate(loan.getLoanstartdate().plusMonths(loan.getTenure()));
		loan.setInterest_rate(LoanMessageConstans.INTREST);
		return loanRepo.save(loan);
		
	}
	



	public Object getLoanById(int id) {
		return loanRepo.findById(id);
	
	}
	
	

}
