package UI.pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user_email")
    private WebElement userName;
    @FindBy(id = "user_password")
    private WebElement password;
    @FindBy(id = "btn-signin")
    private WebElement signInBtn;



    public void enterUserName(String userName){
        this.userName.sendKeys(userName);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickSignIn(){
        signInBtn.click();
    }
}
