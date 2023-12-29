package com.nagarro.customermanagement.external_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "ACCOUNT-MANAGEMENT")
public interface AccountService_External {
	
	@PostMapping("/accounts/{id}")
    public void createAccount(@PathVariable Long id);

    @DeleteMapping("/accounts/{id}")
    public boolean deleteAccount(@PathVariable Long id);

}
