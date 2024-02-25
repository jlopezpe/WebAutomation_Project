package Tests;
import Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import outils.MyDriver;

public class BaseTest {

    protected static MyDriver driver;
    protected LoginPage LoginPage;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"url","username","password"})
    public void BeforeMethod(String browser, String url){
        driver=new MyDriver(browser);
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
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
