package com.example.nazar.controller;

import com.example.nazar.dto.ProductRequest;
import com.example.nazar.service.product.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @PostMapping("/create")
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.create(productRequest);
    }
}
