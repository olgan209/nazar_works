package com.example.nazar.mapper.product;

import com.example.nazar.dto.ProductResponse;
import com.example.nazar.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapperImpl implements ProductMapper{
    @Override
    public ProductResponse toDto(Product product) {
        ProductResponse productResponse = new ProductResponse();
        product.setId(product.getId());
        return productResponse;
    }

    @Override
    public List<ProductResponse> toDtos(List<Product> all) {
        return null;
    }
}
