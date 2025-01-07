package com.CShop.CShop_Project.Controller;


import com.CShop.CShop_Project.Model.Products;
import com.CShop.CShop_Project.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController
{
    private ProductsService service;

    @Autowired
    public ProductsController(ProductsService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Products> getTheProducts()
    {
        return service.getProductData();
    }

    @GetMapping("/products/{productName}")
    public Products getSingleProduct(@PathVariable int productName)
    {
        return service.getSingleProductById(productName);
    }
}
