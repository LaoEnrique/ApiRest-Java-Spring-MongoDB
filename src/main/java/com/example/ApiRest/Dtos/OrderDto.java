package com.example.ApiRest.Dtos;

import com.example.ApiRest.Entity.TypePayEnum;

public class OrderDto {
    private String total;
    private String customerId;
    private String[] productId;
    private TypePayEnum typePay;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String[] getProductId() {
        return productId;
    }

    public void setProductId(String[] productId) {
        this.productId = productId;
    }

    public TypePayEnum getTypePay() {
        return typePay;
    }

    public void setTypePay(TypePayEnum typePay) {
        this.typePay = typePay;
    }
}
