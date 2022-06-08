package com.francesca.pascalau.data;

import com.francesca.pascalau.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}