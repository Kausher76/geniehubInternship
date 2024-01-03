package com.MyBankApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticController {
	@GetMapping("/notice")
	public String getNotice() {
		return "get notice details form db";
	}
	
}
