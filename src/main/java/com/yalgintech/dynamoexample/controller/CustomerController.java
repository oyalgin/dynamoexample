package com.yalgintech.dynamoexample.controller;

import com.yalgintech.dynamoexample.entity.Customer;
import com.yalgintech.dynamoexample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/add/customer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerRepository.saveCustomer(customer);
    }

}
