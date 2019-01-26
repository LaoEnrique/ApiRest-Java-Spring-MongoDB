package com.example.ApiRest.Services.ProductService;

import com.example.ApiRest.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(String id);
    List<Product> findByName(String name);
    Product save(Product product);
    void delete(String id);
}
