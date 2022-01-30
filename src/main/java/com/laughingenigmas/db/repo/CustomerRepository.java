package com.laughingenigmas.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laughingenigmas.db.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


}