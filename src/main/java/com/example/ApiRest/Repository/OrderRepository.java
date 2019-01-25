package com.example.ApiRest.Repository;

import com.example.ApiRest.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends MongoRepository<Order, String> {
}
