package com.example.nazar.service.product;

import com.example.nazar.dto.ProductRequest;
import com.example.nazar.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    @Override
    public void create(ProductRequest productRequest) {
        Product product=new Product();

        product.setName(productRequest.getName());
    }
}
