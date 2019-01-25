package com.example.ApiRest.Services.OrderService;

import com.example.ApiRest.Dtos.OrderDto;
import com.example.ApiRest.Entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> findAll();
    Optional<Order> findById(String id);
    Order save(OrderDto order);
    void delete(String id);
}
