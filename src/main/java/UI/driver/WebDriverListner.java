package UI.driver;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class WebDriverListner implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

        String browserType= iTestContext.getCurrentXmlTest().getLocalParameters().get("browserType");
        WebDriver driver =DriverFactory.instantiateDriver(browserType);
        DriverMananger.setDriver(driver);

    }

    public void onFinish(ITestContext iTestContext) {
        WebDriver driver =  DriverMananger.getDriver();
        if (null != driver)
            driver.quit();

    }
}
