package com.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.management.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
