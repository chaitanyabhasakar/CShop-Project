package com.CShop.CShop_Project.Repository;

import com.CShop.CShop_Project.Model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GoodsRepository extends JpaRepository<Goods,Integer> {
}
