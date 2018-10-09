package UI.pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageFactory {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
        initElements(driver,this);
    }


}
