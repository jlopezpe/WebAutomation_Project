package Tests;

import org.testng.annotations.Test;
import outils.Data_getter;

public class LoginTest extends BaseTest{

    @Test(dataProvider = "login_successful",dataProviderClass = Data_getter.class)
    public void login_info(String username,String password){
        LoginPage.write_username(username);
        LoginPage.write_password(password);
        LoginPage.click_LoginButton();
    }
}
