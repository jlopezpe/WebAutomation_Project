package Tests;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import outils.MyDriver;

public class BaseTest {

    protected static MyDriver driver;

    protected static WebDriver driver1;
    protected LoginPage LoginPage;


    @Parameters({"browser","url","username","password"})
    @BeforeMethod(alwaysRun = true)
    public void BeforeMethod(String browser,String url,String username,String password){
        driver=new MyDriver(browser);
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
        load_loginpage();
        LoginPage.write_password(username);
        LoginPage.write_password(password);
        LoginPage.click_LoginButton();
    }

    public void navigateTo(String url){
        driver.getDriver().get(url);
    }

    public LoginPage load_loginpage(){
        return new LoginPage(driver.getDriver());
    }

    @AfterMethod()
    public void afterMethod(){
        driver.getDriver().close();
    }
}
