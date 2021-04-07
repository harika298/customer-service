package com.service.customer.controller;

import com.service.customer.domain.Customer;
import com.service.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    static String s[] = {"ANil","Kumar","Harika"};


    @PostMapping(path = "/insertCustomer", consumes = "application/json", produces = "application/json")
    public void insertCustomer(@RequestBody Customer customer){
        customerService.insertCustomer(customer);
    }

    @GetMapping(path = "/getCustomer/{id}", produces = "application/json")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomer(id);
    }

    @DeleteMapping(path = "/deleteCustomer/{id}")
    public HttpStatus deleteCustomerById(@PathVariable int id){
        customerService.deleteCustomer(id);
        return HttpStatus.OK;
    }

}
