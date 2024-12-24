package com.CShop.CShop_Project.Controller;

import com.CShop.CShop_Project.Model.LoginPage;
import com.CShop.CShop_Project.Service.LoginPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginPageController
{
    private LoginPageService service;

    @Autowired
    public LoginPageController(LoginPageService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public void gettingNewUserLoginDetails(@RequestBody LoginPage page)
    {
        System.out.println("the components :"+page.getUserName()+" and "+page.getPassword());
        service.detailsOfNewUserLogin(page);
    }
    @GetMapping("/login/{userName}")
    public LoginPage getSingleUserDetails(@PathVariable String userName)
    {
        System.out.println("the user name is : "+userName);
       return service.details(userName);
    }
}
