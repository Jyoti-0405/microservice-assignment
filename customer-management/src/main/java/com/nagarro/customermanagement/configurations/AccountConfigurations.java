package com.nagarro.customermanagement.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class AccountConfigurations {
	
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
