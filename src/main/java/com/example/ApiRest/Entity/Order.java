package com.example.ApiRest.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
public class Order {

    @Id
    private String id;

    private String total;
    @DBRef
    private Customer customer;

    private List<Product> product;
    private TypePayEnum typePay;

    public Order(){}

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProduct() {
        return product;
    }

    public TypePayEnum getTypePay() {
        return typePay;
    }

    public void setTypePay(TypePayEnum typePay) {
        this.typePay = typePay;
    }
}
