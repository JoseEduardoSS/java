package com.jose.db_connection.service.impl;

import com.jose.db_connection.domain.ProductEntity;
import com.jose.db_connection.repository.ProductRepository;
import com.jose.db_connection.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        return repository.save(productEntity);
    }
}
