package com.example.techdemo.mvc;

import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private final Map<Long, Product> productDatabase = new HashMap<>();
    private Long nextId = 1L;

    public Product save(Product product) {
        product.setId(nextId++);
        productDatabase.put(product.getId(), product);
        return product;
    }

    public Product findById(Long id) {
        return productDatabase.get(id);
    }
}
