package com.example.ApiRest.Repository;

import com.example.ApiRest.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>  {
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}
