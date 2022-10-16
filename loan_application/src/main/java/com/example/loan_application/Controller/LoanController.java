package com.example.loan_application.Controller;

import java.util.List;

import com.example.loan_application.Entity.LoanEntity;
import com.example.loan_application.Entity.PaymentShedule;
import com.example.loan_application.Service.LoanService;
import com.example.loan_application.Service.PaymentSheduleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoanController {

	@Autowired LoanService loanService;
	

	@Autowired PaymentSheduleService paymentSheduleService;
	
	@GetMapping("/paymentshedule")
	public List<PaymentShedule> getpaymentshedule() {
		return paymentSheduleService.getallpaymentshedule();
	}

	
	@GetMapping("/loan")
	public ResponseEntity<List<LoanEntity>> getallloan(){
		return ResponseEntity.ok(loanService.getalloan());
		}
	
	@GetMapping("/loan/{id}")
	public Object getLoanbByID(@PathVariable int id) {
		return loanService.getLoanById(id);
	}
	
	@PostMapping("/saveloan")
	public ResponseEntity<LoanEntity> saveloan(@RequestBody LoanEntity loan) {
		return ResponseEntity.accepted().body(loanService.saveloan(loan));
	}
	
}
