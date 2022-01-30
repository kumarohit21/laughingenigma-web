package com.laughingenigmas.web;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laughingenigmas.db.entity.Customer;
import com.laughingenigmas.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Resource(name = "defaultCustomerService")
	private CustomerService customerService;

	@GetMapping("/customer/{customerNumber}")
	public ResponseEntity<Customer> getCustomer(@PathVariable(value = "customerNumber") Long customerNumber) {

		return ResponseEntity.ok().body(customerService.getCustomer(customerNumber));
	}

}
