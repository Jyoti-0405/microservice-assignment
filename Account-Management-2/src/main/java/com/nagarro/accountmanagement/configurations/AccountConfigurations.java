package com.nagarro.accountmanagement.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AccountConfigurations {
	 @Bean
	 public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

}
