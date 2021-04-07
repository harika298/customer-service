package com.service.customer.serviceImpl;

import com.service.customer.domain.Customer;
import com.service.customer.repository.CustomerRepo;
import com.service.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo repo;

    @Override
    public void insertCustomer(Customer customer) {
        repo.save(customer);
    }

   @Override
   public Customer getCustomer(int id){
        return  repo.getOne(id);
   }

    @Override
    public void deleteCustomer(int id) {
        repo.deleteById(id);
    }
}
