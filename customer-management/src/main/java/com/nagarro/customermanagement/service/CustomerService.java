package com.nagarro.customermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.customermanagement.external_service.AccountService_External;
import com.nagarro.customermanagement.model.Customer;
import com.nagarro.customermanagement.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
    private CustomerRepository customerRepository;

    private AccountService_External accountServiceExternal;


    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }


    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id){
        if(this.customerRepository.findById(id).isPresent()){
            this.customerRepository.deleteById(id);
            this.accountServiceExternal.deleteAccount(id);
        }
    }


}
