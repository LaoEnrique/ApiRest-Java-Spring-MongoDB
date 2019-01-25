package com.example.ApiRest.Repository;

import com.example.ApiRest.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    Product findByName(String name);
}
