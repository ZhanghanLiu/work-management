package com.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.management.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
