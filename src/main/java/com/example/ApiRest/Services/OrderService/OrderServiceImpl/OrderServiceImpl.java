package com.example.ApiRest.Services.OrderService.OrderServiceImpl;

import com.example.ApiRest.Dtos.OrderDto;
import com.example.ApiRest.Entity.Customer;
import com.example.ApiRest.Entity.Order;
import com.example.ApiRest.Entity.Product;
import com.example.ApiRest.Repository.OrderRepository;
import com.example.ApiRest.Services.CustomerService.CustomerService;
import com.example.ApiRest.Services.OrderService.OrderService;
import com.example.ApiRest.Services.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    CustomerService customerService;

    @Autowired
    ProductService productService;

    @Override
    public List<Order> findAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(String id) {
        Optional<Order> result = this.orderRepository.findById(id);
        return result;
    }

    @Override
    public Order save(OrderDto order) {
        Order orderObject = new Order();
        orderObject.setTotal(order.getTotal());

        Optional<Customer> customer = this.customerService.findById(order.getCustomerId());
        orderObject.setCustomer(customer.get());

        Optional<Product> product = this.productService.findById(order.getProductId());
        orderObject.setProduct(product.get());

        Order result = this.orderRepository.save(orderObject);
        return result;
    }

    @Override
    public void delete(String id) {
        this.orderRepository.deleteById(id);
    }
}
