package com.CShop.CShop_Project.Service;

import com.CShop.CShop_Project.Model.SignInPage;
import com.CShop.CShop_Project.Repository.LoginPageRepository;
import com.CShop.CShop_Project.Repository.SigninPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInPageService
{
    @Autowired
    private SigninPageRepository repos;

    public void signInData(SignInPage page)
    {
        repos.save(page);
    }
}
