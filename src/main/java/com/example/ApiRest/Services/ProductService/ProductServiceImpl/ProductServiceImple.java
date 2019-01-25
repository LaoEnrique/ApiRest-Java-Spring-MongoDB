package com.example.ApiRest.Services.ProductService.ProductServiceImpl;

import com.example.ApiRest.Entity.Product;
import com.example.ApiRest.Repository.ProductRepository;
import com.example.ApiRest.Services.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImple implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(String id) {
        Optional<Product> result = this.productRepository.findById(id);
        return result;
    }

    @Override
    public Product findByName(String name) {
        Product result = this.productRepository.findByName(name);
        return result;
    }

    @Override
    public Product save(Product product) {
        Product result = this.productRepository.save(product);
        return result;
    }

    @Override
    public void delete(String id) {
        this.productRepository.deleteById(id);
    }
}
