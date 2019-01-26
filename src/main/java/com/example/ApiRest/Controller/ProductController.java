package com.example.ApiRest.Controller;

import com.example.ApiRest.Entity.Product;
import com.example.ApiRest.Services.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping()
    public ResponseEntity save(@RequestBody Product product) throws Exception{
        Product result = this.productService.save(product);
        return ResponseEntity.ok(result.getId());
    }

    @GetMapping()
    public ResponseEntity getAll(){
        List<Product> result = productService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/find/id/{id}")
    public ResponseEntity findById(@PathVariable String id){
        Optional<Product> result = productService.findById(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/find/name")
    public ResponseEntity findByName(@RequestParam String name){
        List<Product> result = productService.findByName(name);
        return ResponseEntity.ok(result);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id){
        this.productService.delete(id);
        return ResponseEntity.ok(true);
    }
}
