package com.nagarro.accountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@EntityScan(basePackages = "com.nagarro.accountmanagement")
public class AccountManagement2Application {

	public static void main(String[] args) {
		SpringApplication.run(AccountManagement2Application.class, args);
	}

}
