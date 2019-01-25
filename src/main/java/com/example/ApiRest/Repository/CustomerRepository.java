package com.example.ApiRest.Repository;

import com.example.ApiRest.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Serializable>  {
    Customer findByFirstName(String firstName);
    Customer findByLastName(String lastName);
}
