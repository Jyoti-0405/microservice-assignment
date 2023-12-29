package com.nagarro.accountmanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@GetMapping("/home")
	public String mains() {
		return "Welcome";
	}
}
