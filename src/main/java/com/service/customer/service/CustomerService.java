package com.service.customer.service;

import com.service.customer.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CustomerService {
    public void insertCustomer(Customer customer);
    public Customer getCustomer(int id);
    public void deleteCustomer(int id);
}
