package com.springbatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.springbatch.entity.Customer;

//Item Processor
public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer customer) throws Exception {
		return customer;
	}

}
