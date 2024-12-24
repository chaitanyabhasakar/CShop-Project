package com.CShop.CShop_Project.Controller;

import com.CShop.CShop_Project.Model.SignInPage;
import com.CShop.CShop_Project.Service.SignInPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInPageController
{
    private SignInPageService service;

    @Autowired
    public SignInPageController(SignInPageService service) {
        this.service = service;
    }

    @PostMapping("/signin")
    public void signInFirstTimeData(@RequestBody SignInPage page)
    {
        service.signInData(page);
    }
}
