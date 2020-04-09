package com.resources.customer;

import com.model.Product;
import com.service.BrandService;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.sql.SQLException;
import java.util.List;

public class BrandResource {

    private BrandService service = new BrandService();

    @Path("/brands/products")
    public List<Product> getProducts() throws SQLException {
        return service.getProducts();
    }

    @Path("/brands/{brandName}/products")
    public List<Product> getProducts(@PathParam("brandName") String name) throws SQLException {
        return service.getProducts(name);
    }
}
