package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Driver;


import java.util.concurrent.TimeUnit;


public abstract class AbstractClass {
    public WebDriver driver =Driver.getDriver();
    WebDriverWait wait =new WebDriverWait(driver,30);


    public void clickFunction(WebElement clickElement)
    {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();

    }

    public void sendKeysFunction(WebElement sendKeysElement ,String value)
    {
         wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
         sendKeysElement.sendKeys(value);

    }

    public void getTextFunction(WebElement gettextElement)
    {
        wait.until(ExpectedConditions.elementToBeClickable(gettextElement));
        gettextElement.getText();

    }

   public void AssertionFunction(WebElement actual , String expected)
   {
       wait.until(ExpectedConditions.visibilityOf(actual));
     //  Assert.assertEquals(actual.getText(),expected);
       System.out.println("My Message :"+actual.getText());

   }
   public void driverquit()
   {
       Driver.closeDriver();
   }
   public void setup(String url)
   {
       driver = Driver.getDriver();
       driver.manage().window().maximize();
       //driver.get("https://www.linkedin.com/");
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }
}
