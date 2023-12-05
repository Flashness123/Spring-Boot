package com.example.demo.Product;

public class SoftwareProduct extends Product {
    public SoftwareProduct(Integer id, String description, String url, Integer size) {
        super(id, description);
        this.url = url;
        this.size = size;
    }

    String url;
    Integer size;

    public String getUrl() {
        return url;
    }

    public Integer getSize() {
        return size;
    }
}
