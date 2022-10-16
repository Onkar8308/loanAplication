package com.example.loan_application.Service;

import com.example.loan_application.Entity.CustomerLoginEntity;
import com.example.loan_application.Repository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogInService {

	@Autowired
	LoginRepository loginRepository;
	
	public CustomerLoginEntity getlogin(Integer customerId) {
		return loginRepository.findById(customerId).get();
	}

}
