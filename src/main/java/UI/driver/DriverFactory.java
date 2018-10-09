package UI.driver;

import configuration.ConfigurationUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class DriverFactory {

    static WebDriver driver=null;

    static WebDriver instantiateDriver(String browserType){
        if("chrome".equalsIgnoreCase(browserType)){
            ConfigurationUtils.setSystemProperty("webdriver.chrome.UI.driver",ConfigurationUtils.getSystemProperty("user.dir")+
                    "\\src\\main\\resources\\browserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            try {
                driver.manage().wait(100,1000);
                driver.manage().window().maximize();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if("firefox".equalsIgnoreCase(browserType)){
            ConfigurationUtils.setSystemProperty("webdriver.gecko.UI.driver",ConfigurationUtils.getSystemProperty("user.dir")+
                    "\\src\\main\\resources\\browserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            try {
                driver.manage().wait(100,1000);
                driver.manage().window().maximize();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }
}
