package com.mfg.repository;

import org.springframework.data.repository.CrudRepository;

import com.mfg.model.Customer;

/**
 * Created by shakeelosmani on 24/12/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
