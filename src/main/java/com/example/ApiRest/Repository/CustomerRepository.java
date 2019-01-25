package com.example.ApiRest.Repository;

import com.example.ApiRest.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>  {
    Customer findByFirstName(String firstName);
    Customer findByLastName(String lastName);
}
