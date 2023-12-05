package com.example.demo.Product;

public abstract class Product {

    public Product(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    Integer id;
    String description;

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}

