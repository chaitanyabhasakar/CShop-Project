package com.CShop.CShop_Project.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Entity
@Table
public class Products
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;

    public Products() {
    }

    public Products(String productName, int productId) {
        this.productName = productName;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }
}
