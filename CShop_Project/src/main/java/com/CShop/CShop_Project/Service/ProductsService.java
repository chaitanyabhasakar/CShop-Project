package com.CShop.CShop_Project.Service;


import com.CShop.CShop_Project.Model.Products;
import com.CShop.CShop_Project.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService
{
    @Autowired
    private ProductsRepository repos;


    public List<Products> getProductData()
    {
        return repos.findAll();
    }

    public Products getSingleProductById(int productName) {
        return repos.findById(productName).get();
    }
}
