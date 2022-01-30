package com.laughingenigmas.service.impl;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laughingenigmas.db.entity.Customer;
import com.laughingenigmas.db.repo.CustomerRepository;
import com.laughingenigmas.service.CustomerService;

@Service("defaultCustomerService")
public class DefaultCustomerService implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer getCustomer(long customerNumber) {

		return customerRepository.findById(customerNumber)
				.orElseThrow(() -> new EntityNotFoundException("Customer not found"));

	}

}
