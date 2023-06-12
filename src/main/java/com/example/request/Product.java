package com.example.request;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Product {

    public String id;
    public String name;
    public Integer price;

    public Product() {
    }

    public Product(String id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
