package com.example.loan_application.Controller;

import com.example.loan_application.Entity.CustomerLoginEntity;
import com.example.loan_application.Service.LogInService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Autowired
	LogInService login;
	
	@GetMapping("/customerLogin/{customerId}")
	public Object login(@PathVariable int customerId) {
		CustomerLoginEntity customer =login.getlogin(customerId);
		return customer;
		
	}

}
