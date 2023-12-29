package com.nagarro.accountmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.accountmanagement.exceptions.AccountException;
import com.nagarro.accountmanagement.exceptions.NoAccountFoundException;
import com.nagarro.accountmanagement.external_service.CustomerService_External;
import com.nagarro.accountmanagement.model.Account;
import com.nagarro.accountmanagement.model.Customer;
import com.nagarro.accountmanagement.repository.AccountRepository;

import java.math.BigDecimal;

@Service
public class AccountService {
	

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
    private CustomerService_External customerServiceExternal;

    public AccountService() {
    }


    public Account addMoney(Long id, BigDecimal amount){
        System.out.println("customer service external " +this.customerServiceExternal);
        Customer customer = this.customerServiceExternal.getCustomerById(id);

        if (customer == null) {
            throw new NoAccountFoundException();
        }

        Account account = this.accountRepository.findById(id).get();

        account.setBalance(account.getBalance().add(amount));

        this.accountRepository.save(account);

        return account;
    }

    public Account withdrawMoney(Long id, BigDecimal amount) {
        // TODO Auto-generated method stub

        Customer customer = this.customerServiceExternal.getCustomerById(id);

        if (customer == null) {
            throw new NoAccountFoundException();
        }

        Account account = this.accountRepository.findById(id).get();

        if (account.getBalance().compareTo(amount) == -1) {
            throw new AccountException("Balance is Low");
        }

        account.setBalance(amount.subtract(account.getBalance()));

        this.accountRepository.save(account);

        return account;
    }

    public Account getAccountDetails(Long id){
        Customer customer = this.customerServiceExternal.getCustomerById(id);

        if (customer == null) {
            throw new NoAccountFoundException();
        }

        Account account = this.accountRepository.findById(id).get();

        account.setCustomer(customer);
        return account;
    }

    public boolean deleteAccount(Long id) {

        if (this.accountRepository.existsById(id) == false) {
            return false;
        }

        this.customerServiceExternal.deleteCustomer(id);
        this.accountRepository.deleteById(id);

        return true;
    }

    public void createAccount(Long id) {
        Account account = new Account(id, BigDecimal.ZERO);
        this.accountRepository.save(account);
    }

}
