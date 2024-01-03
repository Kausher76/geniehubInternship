package com.MyBankApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BanlanceController {

	@GetMapping("/balanace")
	public String getBalanace() {
		return "Balanace from db";
	}

}
