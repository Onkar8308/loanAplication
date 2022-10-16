package com.example.loan_application.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.loan_application.Entity.LoanEntity;
import com.example.loan_application.Entity.PaymentShedule;
import com.example.loan_application.Repository.PaymentSheduleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utility.LoanMessageConstans;

@Service
public class PaymentSheduleService {
	
	@Autowired 
	PaymentSheduleRepository paymentSheduleRepository;
	
	public List<PaymentShedule> getallpaymentshedule() {
		
		return paymentSheduleRepository.findAll();
	}
	
	public List<PaymentShedule> addpaymentshedule(LoanEntity loan) {
		List<PaymentShedule> list = new ArrayList<>();
		
		if(LoanMessageConstans.EVEN.equalsIgnoreCase(loan.getPayment_term())) {
			list=evenprinciple(loan);
			
		}
		else if(LoanMessageConstans.INTRESTONLY.equalsIgnoreCase(loan.getPayment_term())) {
			list=intrestonly(loan);
			
		}
		return list;
	}
	
	public List<PaymentShedule> evenprinciple(LoanEntity loan) {
		List<PaymentShedule> evenPrincipleList = new ArrayList<>();
		LocalDate paymentDate=(loan.getLoanstartdate());
		int numberOFPaymentShedule=(loan.getTenure()/loan.getPayment_frquency());
		double interest =(loan.getLoanamount()/(LoanMessageConstans.INTREST*4));
		double paymentAmount =((loan.getLoanamount()+interest)/numberOFPaymentShedule);
		
		for(int paymentNumber = 0; paymentNumber<numberOFPaymentShedule ; paymentNumber++) {
			PaymentShedule paymentShedule = new PaymentShedule();
			paymentDate=paymentDate.plusMonths(loan.getPayment_frquency());
			paymentShedule.setPaymentdate(paymentDate);
			paymentShedule.setProjectedintrest(interest);			
			paymentShedule.setPrinciple(loan.getLoanamount());	
			paymentShedule.setPaymentstatus(LoanMessageConstans.PROJECTED);
			paymentShedule.setPaymentamount(paymentAmount);
			paymentSheduleRepository.save(paymentShedule);
			evenPrincipleList.add(paymentShedule);
		}
		return evenPrincipleList;
		
	}
	public List<PaymentShedule> intrestonly(LoanEntity loan) {
		
		List<PaymentShedule> intrestonlylist = new ArrayList<>();
			 
		LocalDate paymentDate=(loan.getLoanstartdate());
		int numberOFPaymentShedule=(loan.getTenure()/loan.getPayment_frquency());
		double interest =(loan.getLoanamount()/(LoanMessageConstans.INTREST*4));
		double paymentintrest=(interest/(loan.getTenure()/loan.getPayment_frquency()));
		for(int paymentNumber = 0; paymentNumber<numberOFPaymentShedule ; paymentNumber++) {
			
			if(paymentNumber==numberOFPaymentShedule-1) {
				PaymentShedule paymentShedule = new PaymentShedule();
			paymentDate=paymentDate.plusMonths(loan.getPayment_frquency());
			paymentShedule.setPaymentdate(paymentDate);
			paymentShedule.setProjectedintrest(interest);
			paymentShedule.setPrinciple(0);
			paymentShedule.setPaymentamount(loan.getLoanamount()+paymentintrest);
			paymentShedule.setPaymentstatus(LoanMessageConstans.PROJECTED);
			paymentSheduleRepository.save(paymentShedule);
			intrestonlylist.add(paymentShedule);
			}
			else {
				PaymentShedule paymentShedule = new PaymentShedule();
				paymentDate=paymentDate.plusMonths(loan.getPayment_frquency());
			paymentShedule.setPaymentdate(paymentDate);
			paymentShedule.setProjectedintrest(interest);	
			paymentShedule.setPrinciple(0);
			paymentShedule.setPaymentamount(paymentintrest);
			paymentShedule.setPaymentstatus(LoanMessageConstans.PROJECTED);
			paymentSheduleRepository.save(paymentShedule);
			intrestonlylist.add(paymentShedule);
			}
		}		
		return intrestonlylist;
		}
}
