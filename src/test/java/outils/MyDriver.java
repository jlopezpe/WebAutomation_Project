package outils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

    private WebDriver driver;

    public MyDriver(String browser){

        //if we would create it with firefox we should do the same as chrome (adding a path)
        if("firefox".equals(browser)){
            driver=new FirefoxDriver();
        }
        else{
            String path= System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
            driver=new ChromeDriver();
        }
    }
}
