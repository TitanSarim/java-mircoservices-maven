package com.siggmaa.productservice.repository;

import com.siggmaa.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {



}

