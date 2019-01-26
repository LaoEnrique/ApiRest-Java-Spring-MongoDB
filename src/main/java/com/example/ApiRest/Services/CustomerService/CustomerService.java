package com.example.ApiRest.Services.CustomerService;

import com.example.ApiRest.Entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {

    List<Customer> findAll();
    Optional<Customer> findById(String id);
    List<Customer> findByfirstName(String firstname);
    List<Customer> findByLastName(String lastname);
    Customer save(Customer customer);
    void delete(String id);

}
