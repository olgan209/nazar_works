package com.example.nazar.mapper.product;

import com.example.nazar.dto.ProductResponse;
import com.example.nazar.entities.Product;

import java.util.List;

public interface ProductMapper {
    ProductResponse toDto(Product product);

    List<ProductResponse> toDtos(List<Product>all);
}
