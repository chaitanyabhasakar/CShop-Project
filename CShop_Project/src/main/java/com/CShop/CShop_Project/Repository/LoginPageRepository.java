package com.CShop.CShop_Project.Repository;

import com.CShop.CShop_Project.Model.LoginPage;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface LoginPageRepository extends JpaRepository<LoginPage,String> {
}
