package com.service;

import com.model.Brand;
import com.model.Color;
import com.model.Product;
import com.model.ProductType;

import java.util.List;

public interface BrandService {
    public List<Product> getProducts();
    public Product getProducts(Integer id);
    public List<Product> getProducts(Brand brand);
    public List<Product> getProduct(ProductType type);
    public List<Product> getProducts(Color color);
}
