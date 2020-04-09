package com.model;

import javax.persistence.*;

@Entity
public class Product {
    private int id;
    private String name;
    private ProductType type;
    private Color color;
    private int count;
    private double price;
    private Brand brand;

    public Product(String name, ProductType type, Color color, int count, double price, Brand brand) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.count = count;
        this.price = price;
        this.brand = brand;
    }

    public Product() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @Column
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Column
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Column
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
