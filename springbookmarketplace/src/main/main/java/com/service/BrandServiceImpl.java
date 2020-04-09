package com.service;

import com.model.Brand;
import com.model.Color;
import com.model.Product;
import com.model.ProductType;
import com.repository.ProductRepository;


import java.util.List;
import java.util.Optional;

public class BrandServiceImpl implements BrandService{

    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProducts(Integer id) {
        Optional<Product> optProduct =  productRepository.findById(id);
        return optProduct.get();
    }

    public List<Product> getProducts(Brand brand) {
        return null;
    }

    @Override
    public List<Product> getProduct(ProductType type) {
        return null;
    }

    @Override
    public List<Product> getProducts(Color color) {
        return null;
    }

}
