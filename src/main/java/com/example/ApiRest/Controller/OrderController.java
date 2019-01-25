package com.example.ApiRest.Controller;

import com.example.ApiRest.Dtos.OrderDto;
import com.example.ApiRest.Entity.Customer;
import com.example.ApiRest.Entity.Order;
import com.example.ApiRest.Services.OrderService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping()
    public ResponseEntity save(@RequestBody OrderDto orderDto) throws Exception{
        Order result = this.orderService.save(orderDto);
        return ResponseEntity.ok(result.getId());
    }

    @GetMapping()
    public ResponseEntity getAll(){
        List<Order> result = this.orderService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/find/id/{id}")
    public ResponseEntity findById(@PathVariable String id){
        Optional<Order> result = this.orderService.findById(id);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id){
        this.orderService.delete(id);
        return ResponseEntity.ok(true);
    }
}
