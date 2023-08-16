package com.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbatch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
