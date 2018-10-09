import UI.driver.DriverMananger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoughTest2 {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver= DriverMananger.getDriver();
    }

    @Test
    public void hitGoogle2(){
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Chutiya kya hota hai");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        checkThread();
    }


    private void checkThread(){
        System.out.println("====================================================");
        System.out.println("This is thread ID "+Thread.currentThread().getId());
        System.out.println("====================================================");
    }
}
