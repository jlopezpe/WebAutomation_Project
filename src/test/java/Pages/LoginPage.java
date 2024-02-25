package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "[name='user-name']")
    private WebElement username;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(className = "submit-button btn_action")
    private WebElement login_button;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void write_username(String username){
        write_Text(this.username,username);
    }
    public void write_password(String password){
        write_Text(this.password,password);
    }
    public void click_LoginButton(){
        click_Element(this.login_button);
    }
    
    public String search_LoginButtonName(){
        return this.login_button.getText();
    }

}
