package com.CShop.CShop_Project.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
public class Goods
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int goodsId;
    private String brandName;
    private String model;
    private double price;
    private long quantityLeft;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "productId")
    private Products productId;


    public Goods() {
    }

    public Goods(int goodsId, String brandName, String model, double price, long quantityLeft) {
        this.goodsId = goodsId;
        this.brandName = brandName;
        this.model = model;
        this.price = price;
        this.quantityLeft = quantityLeft;
    }

    public int getGoodsId() {
        return goodsId;
    }


    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public long getQuantityLeft() {
        return quantityLeft;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityLeft(long quantityLeft) {
        this.quantityLeft = quantityLeft;
    }

    @Override
    public String toString() {
        return "Goods{" +
                ", goodsId=" + goodsId +
                ", brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantityLeft=" + quantityLeft +
                '}';
    }
}
