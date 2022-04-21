package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver ;

    public static WebDriver getDriver()
    {
        if(driver==null)
        {
            System.setProperty("webdriver.chrome.driver","/Users/aysenurkaya/IdeaProjects/KitapYurduProject/src/main/resources/executables/chromedriver 3");
            driver =new ChromeDriver();
        }
        return driver;
    }
    public static void closeDriver()
    {

            driver.quit();

    }
}

