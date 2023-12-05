package com.example.demo.Product;

import java.util.Comparator;

public class HardwareProduct extends Product{

    public HardwareProduct(Integer id, String description, Integer weight, String shortdescription, Category category) {
        super(id, description);
        this.weight = weight;
        this.shortdescription = shortdescription;
        this.category = category;
    }

    Integer weight;
    String shortdescription;
    Category category;

    public Integer getWeight() {
        return weight;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public Category getCategory() {
        return category;
    }
}
