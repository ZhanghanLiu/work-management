package com.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.management.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
