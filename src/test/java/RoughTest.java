import UI.driver.DriverMananger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoughTest extends BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverMananger.getDriver();
        super.setUp();
    }

    @Test
    public void openHomePage() {
        screens.homePage().goToHomePage();
        screens.homePage().verifyTitle(getConstants("HOME_PAGE_TITLE"));
    }

    @Test
    public void verifyLoginPage() {
        screens.homePage().goToHomePage();
        screens.homePage().clickOnLoginLink();
        screens.loginPage().enterUserName("abc@abc.com");
        screens.loginPage().enterPassword("abcav");
        screens.loginPage().clickSignIn();
    }
}
