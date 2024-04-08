package com.example.nazar.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductRequest {
    private Long id;

    private String name;
    private int price;
}
