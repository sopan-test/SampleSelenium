import configuration.ConfigurationUtils;
import UI.objects.Screens;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    Screens screens =null;
    Properties prop =null;
    Properties constants =null;

    public void setUp(){
        initializePages();
        loadProperties();
        loadConstants();
    }
    private void loadProperties(){
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(ConfigurationUtils.getSystemProperty("user.dir")+
                    "\\src\\main\\resources\\properties\\propertyFile.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initializePages(){
        screens = new Screens();
    }

    public String getPropertyValue(String propertyName){
        return prop.getProperty(propertyName);

    }

    private void loadConstants(){
        constants = new Properties();
        try {
            FileInputStream fis = new FileInputStream(ConfigurationUtils.getSystemProperty("user.dir")+
                    "\\src\\main\\resources\\properties\\constants.properties");
            constants.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getConstants(String constantName){
        return constants.getProperty(constantName);

    }
}
