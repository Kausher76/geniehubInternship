package com.MyBankApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	@GetMapping("/loan")
	public String getLoanDeatils() {
		return "loan details from db";
	}
	
}
