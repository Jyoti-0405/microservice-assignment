package com.nagarro.accountmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;

@Entity
public class Account {
	
	@Id
    private Long id;

    @NonNull
    private BigDecimal balance;

    @Transient
    private Customer customer;

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(@NonNull BigDecimal balance) {
        this.balance = balance;
    }

    public Account(Long id, @NonNull BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
