package UI.objects;

import UI.driver.DriverMananger;
import org.openqa.selenium.WebDriver;
import UI.pageFactories.HomePage;
import UI.pageFactories.LoginPage;
import UI.pageFactories.RegisterPage;

public class Screens {

    WebDriver driver = DriverMananger.getDriver();
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static RegisterPage registerPage;

    public LoginPage loginPage(){
        if(null ==loginPage) {
            return new LoginPage(driver);
        }else {
            return loginPage;
        }
    }

    public HomePage homePage(){
        if(null ==loginPage) {
            return new HomePage(driver);
        }else {
            return homePage;
        }
    }


    public RegisterPage registerPage(){
        if(null ==loginPage) {
            return new RegisterPage(driver);
        }else {
            return registerPage;
        }
    }
}
