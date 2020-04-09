package com.service;

import com.dao.DBConnection;
import com.model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BrandService {

    private Connection con = DBConnection.getConnection().getCon();

    public List<Product> getProducts() throws SQLException {
        String query = "select * from products";
        ResultSet rs = con.createStatement().executeQuery(query);
        return null;
    }

    public List<Product> getProducts(String name) throws SQLException {
        String query = "select * from products";
        ResultSet rs = con.createStatement().executeQuery(query);
        return null;
    }
}
