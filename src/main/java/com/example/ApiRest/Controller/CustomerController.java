package com.example.ApiRest.Controller;

import com.example.ApiRest.Entity.Customer;
import com.example.ApiRest.Services.CustomerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping()
    public ResponseEntity save(@RequestBody Customer customer) throws Exception{
        Customer result = this.customerService.save(customer);
        return ResponseEntity.ok(result.getId());
    }

    @GetMapping()
    public ResponseEntity getAll(){
        List<Customer> result = customerService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/find/id/{id}")
    public ResponseEntity findById(@PathVariable String id){
        Optional<Customer> result = customerService.findById(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/find/firstname")
    public ResponseEntity findByFirstName(@RequestParam String firstname){
        Customer result = customerService.findByfirstName(firstname);
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/find/lastname")
    public ResponseEntity findByLastName(@RequestParam String lastname){
        Customer result = customerService.findByLastName(lastname);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id){
        this.customerService.delete(id);
        return ResponseEntity.ok(true);
    }

}
