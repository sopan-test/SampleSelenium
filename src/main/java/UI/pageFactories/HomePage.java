package UI.pageFactories;

import UI.objects.Screens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".et_pb_module_header")
    private WebElement title;

    @FindBy(xpath = "//a[contains(@href,'sign_in')]")
    private WebElement loginLink;


public void goToHomePage(){
    driver.get("https://www.ultimateqa.com/automation/");
}

    public void verifyTitle(String expectedTitle) {
        Assert.assertEquals(title.getText(), expectedTitle);
    }

    public LoginPage clickOnLoginLink(){
        loginLink.click();
        return Screens.loginPage;
    }
}