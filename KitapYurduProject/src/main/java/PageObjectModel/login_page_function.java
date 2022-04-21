package PageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;


public class login_page_function extends AbstractClass {

    WebDriver driver;


    public login_page_function() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickSignin() {
         String girisyap =driver.findElement(By.xpath("//a[contains(text(),'Giriş Yap')]")).getText();
         System.out.println(girisyap);
          Assert.assertEquals(girisyap,"Giriş Yap");

        clickFunction(driver.findElement(By.xpath("//a[contains(text(),'Giriş Yap')]")));


    }

    public void sendUsername(String username) {
        sendKeysFunction(driver.findElement(By.xpath("//input[@id='login-email']")), username);
    }

    public void sendPassword(String password) {
        sendKeysFunction(driver.findElement(By.xpath("//input[@id='login-password']")), password);


    }

    public void clickLoginbutton() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//button[@role='button']")));
        Thread.sleep(2000);
    }

    public void showerrormessagelogin() {
        String error = driver.findElement(By.xpath("//div[@class='ky-error']")).getText();
        System.out.println(error);
    }

    public void checkusername() {

        String username = driver.findElement(By.xpath("(//a[@class='common-sprite'])[1]")).getText();
        System.out.println(username);

    }

    public void quitdriver() {
        Driver.closeDriver();
    }


}
