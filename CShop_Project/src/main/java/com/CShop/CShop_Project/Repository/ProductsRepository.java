package com.CShop.CShop_Project.Repository;

import com.CShop.CShop_Project.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductsRepository extends JpaRepository<Products,Integer> {
}
