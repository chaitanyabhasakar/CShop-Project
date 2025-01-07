package com.CShop.CShop_Project.Service;

import com.CShop.CShop_Project.Model.Goods;
import com.CShop.CShop_Project.Repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService
{
    @Autowired
    private GoodsRepository repos;

    public Goods getTheGoodsData(int id)
    {
        return repos.findById(id).get();
    }
}
