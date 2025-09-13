package com.example.hexagonal.product.domain.ports.in;

import com.example.hexagonal.product.domain.model.Product;

import java.util.Optional;

public interface UpdateProductUseCase {
    Optional<Product> updateProduct(Long id, Product product);
}
