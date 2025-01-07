package com.CShop.CShop_Project.Controller;


import com.CShop.CShop_Project.Model.Goods;
import com.CShop.CShop_Project.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController
{
    private GoodsService service;
    @Autowired
    public GoodsController(GoodsService service) {
        this.service = service;
    }

    @GetMapping("/goods/{id}")
    public Goods getTheDataById(@PathVariable int id)
    {
        return service.getTheGoodsData(id);
    }
}
