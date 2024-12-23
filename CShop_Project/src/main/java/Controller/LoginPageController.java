package Controller;

import Model.LoginPage;
import Service.LoginPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
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
        service.detailsOfNewUserLogin(page);
    }
}
