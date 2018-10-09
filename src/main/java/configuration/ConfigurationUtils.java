package configuration;

public class ConfigurationUtils {

    public static String getSystemProperty(String propertyName){
        return System.getProperty(propertyName);
    }

    public static void setSystemProperty(String key, String value){

        System.setProperty(key,value);

    }
}
