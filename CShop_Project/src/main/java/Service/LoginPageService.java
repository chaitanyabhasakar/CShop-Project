package Service;

import Model.LoginPage;
import Repository.LoginPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginPageService
{
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private LoginPageRepository repos;

    public void detailsOfNewUserLogin(LoginPage page)
    {
        repos.save(page);
    }

}
