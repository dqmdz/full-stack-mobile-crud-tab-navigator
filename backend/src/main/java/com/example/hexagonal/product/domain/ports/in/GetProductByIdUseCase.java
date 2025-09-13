package com.example.hexagonal.product.domain.ports.in;

import com.example.hexagonal.product.domain.model.Product;

import java.util.Optional;

public interface GetProductByIdUseCase {
    Optional<Product> getProductById(Long id);
}
