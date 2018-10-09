package UI.driver;

import org.openqa.selenium.WebDriver;

public class DriverMananger {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void setDriver(WebDriver webDriver) {
        if(null==driver.get()){
            driver.set(webDriver);
        }
    }
}
