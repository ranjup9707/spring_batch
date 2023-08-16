package com.springbatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.springbatch.entity.Customer;

//Item Processor
public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer customer) throws Exception {
		//Allow only record which has country name United State
		/*
		if(customer.getCountry().equals("United States")) {
			return customer;
		}
		else
		{
			return null;
		}
		*/
		return customer;
	}

}
