package com.controller;

import com.model.Brand;
import com.model.Product;
import com.repository.ProductRepository;
import com.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class BrandController {

    @Autowired
    private BrandService service;

    @GetMapping("/brands")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/brands/{brandName}")
    public List<Product> getProducts(@PathVariable("brandName") Brand brand) {
        return service.getProducts(brand);
    }

    @GetMapping("/{productId}")
    public Product getProducts(@PathVariable("productId") Integer id) {
        return service.getProducts(id);
    }

}
