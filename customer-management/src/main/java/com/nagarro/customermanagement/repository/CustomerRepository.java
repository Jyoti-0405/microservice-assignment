package com.nagarro.customermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.customermanagement.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>  {

}
