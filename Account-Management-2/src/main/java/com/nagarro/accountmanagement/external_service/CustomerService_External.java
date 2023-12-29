package com.nagarro.accountmanagement.external_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nagarro.accountmanagement.model.Customer;


@FeignClient(name = "CUSTOMER-MANAGEMENT")
public interface CustomerService_External {
	
	@GetMapping("/{customersId}")
    public Customer getCustomerById(@PathVariable Long customersId);

    @DeleteMapping("/{customersId}")
    public void deleteCustomer(@PathVariable Long customersId);

}
