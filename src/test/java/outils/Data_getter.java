package outils;
import org.testng.annotations.DataProvider;
public class Data_getter {
    @DataProvider(name = "login_successful")
    public static Object[][] successful_Login() {
        return new Object[][] {
                {
                    "standard_user", "secret_sauce"
                }
        };
    }
    @DataProvider(name = "login_unsuccessful")
    public static Object[][] unsuccessful_Login() {
        return new Object[][] {
                {
                        "incorrect_user",
                        "incorrect_password"
                }
        };
    }

    @DataProvider(name = "checkout_info")
    public static Object[][] testDataCheckoutStepOne() {
        return new Object[][] {
                {
                        "Jonathan",
                        "Lopez",
                        "050051"
                }
        };
    }
}
