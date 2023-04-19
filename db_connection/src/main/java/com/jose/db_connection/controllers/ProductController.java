package com.jose.db_connection.controllers;

import com.jose.db_connection.domain.ProductEntity;
import com.jose.db_connection.dto.Product;
import com.jose.db_connection.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService productService) {
        this.service = productService;
    }

    @PostMapping("/add")
    public ProductEntity addProduct(@RequestBody Product product) {
        return service.save(new ProductEntity(product));
    }
}
