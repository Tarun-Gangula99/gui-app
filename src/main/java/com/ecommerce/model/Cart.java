package com.ecommerce.model;

public class Cart {
    private String productName;
    private double price;

    public Cart(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() { return productName; }
    public double getPrice() { return price; }
}
