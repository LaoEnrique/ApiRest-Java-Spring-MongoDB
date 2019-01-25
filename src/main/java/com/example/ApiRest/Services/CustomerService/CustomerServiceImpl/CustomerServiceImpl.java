package com.example.ApiRest.Services.CustomerService.CustomerServiceImpl;

import com.example.ApiRest.Entity.Customer;
import com.example.ApiRest.Repository.CustomerRepository;
import com.example.ApiRest.Services.CustomerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return this.customerRepository.findAll();
    }

    public Optional<Customer> findById(String id){
        Optional<Customer> result = this.customerRepository.findById(id);
        return result;
    }

    public Customer findByfirstName(String firstname){
        Customer result = this.customerRepository.findByFirstName(firstname);
        return result;
    }

    public Customer findByLastName(String lastname){
        Customer result = this.customerRepository.findByLastName(lastname);
        return result;
    }

    public Customer save(Customer customer){
        Customer result = this.customerRepository.save(customer);
        return result;
    }

    public void delete(String id){
        this.customerRepository.deleteById(id);
    }
}
