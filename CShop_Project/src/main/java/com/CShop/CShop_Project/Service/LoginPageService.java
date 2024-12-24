package com.CShop.CShop_Project.Service;

import com.CShop.CShop_Project.Model.LoginPage;
import com.CShop.CShop_Project.Repository.LoginPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginPageService
{
    @Autowired
    private LoginPageRepository repos;

    public void detailsOfNewUserLogin(LoginPage page)
    {
        System.out.println("the component in service are : "+page.getUserName()+" and "+page.getPassword());
        repos.save(page);
    }

    public LoginPage details(String userName) {
        System.out.println("the user in service : "+userName);
        return repos.findById(userName).get();
    }
}
