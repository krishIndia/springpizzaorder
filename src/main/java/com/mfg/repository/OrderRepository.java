package com.mfg.repository;

import org.springframework.data.repository.CrudRepository;

import com.mfg.model.CustomerOrder;

/**
 * Created by shakeelosmani on 01/01/17.
 */
public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}
