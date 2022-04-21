package PageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import utilities.Driver;

public class Home_page_function extends AbstractClass {

    WebDriver driver;

    public Home_page_function() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void writername() {
        sendKeysFunction(driver.findElement(By.xpath("//input[@id='search-input']")), "victor hugo");
    }

    public void clicksearchbutton() {
        clickFunction(driver.findElement(By.xpath("//span[@class='common-sprite button-search']")));
    }

    public void clickbook() {
        clickFunction(driver.findElement(By.xpath("(//div[@class='cover'])[2]")));
    }

    public void readbookname() {
        String bookanem = driver.findElement(By.xpath("//h1[@class='pr_header__heading']")).getText();
        System.out.println(bookanem);
    }

    public void clickEnglish() {
        clickFunction(driver.findElement(By.xpath("//a[@class='common-sprite icon-lang-tr']")));
        clickFunction(driver.findElement(By.xpath("//a[@class='common-sprite icon-lang-en lang-list-link']")));
    }

    public void checkEnglishtext() {
        String cart = driver.findElement(By.xpath("//h4[text()='Cart']")).getText();
        Assert.assertEquals(cart, "Cart");
        System.out.println(cart);

        String books = driver.findElement(By.xpath("//span[text()='Books']")).getText();
       Assert.assertEquals(books, "Books");
        System.out.println(books);

        String magazine = driver.findElement(By.xpath("//span[text()='Magazines']")).getText();
       Assert.assertEquals(magazine, "Magazines");
        System.out.println(magazine);

        String login = driver.findElement(By.xpath("//a[text()='Login']")).getText();
        Assert.assertEquals(login, "Login");
        System.out.println(login);

        String best=driver.findElement(By.xpath("//div[text()='Bestsellers']")).getText();
        Assert.assertEquals(best, "Bestsellers");
        System.out.println(best);


    }

    public void clickTurkish() {
        clickFunction(driver.findElement(By.xpath("//a[@class='common-sprite icon-lang-en']")));
        clickFunction(driver.findElement(By.xpath("//a[@class='common-sprite icon-lang-tr lang-list-link']")));
    }

    public void checkTurkishtext() {

        String kart = driver.findElement(By.xpath("//h4[text()='Sepetim']")).getText();
       Assert.assertEquals(kart, "Sepetim");
        System.out.println(kart);

        String kitap = driver.findElement(By.xpath("//span[text()='Kitap']")).getText();
       Assert.assertEquals(kitap, "Kitap");
        System.out.println(kitap);

        String dergi = driver.findElement(By.xpath("//span[text()='Dergi']")).getText();
       Assert.assertEquals(dergi, "Dergi");
        System.out.println(dergi);

        String login = driver.findElement(By.xpath("//a[text()='Giriş Yap']")).getText();
      Assert.assertEquals(login, "Giriş Yap");
        System.out.println(login);

        String best=driver.findElement(By.xpath("//div[text()='En Çok Satılanlar']")).getText();
       Assert.assertEquals(best, "En Çok Satılanlar");
        System.out.println(best);


    }

    public void clickkirtasiye()
    {
        clickFunction(driver.findElement(By.xpath("//li[@class='stationery has-menu']")));
    }
    public void clickbooks()
    {
        clickFunction(driver.findElement(By.xpath("//span[normalize-space()='Defterler']")));
        clickFunction(driver.findElement(By.xpath("//strong[contains(text(),'Okul Alışverişi')]")));
    }
    public void clickbooksdetails()
    {
        clickFunction(driver.findElement(By.xpath("(//a[@class='cover-image'])[1]")));

    }
    public void addbasket() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//span[text()='Sepete Ekle']")));
        Thread.sleep(3000);
    }
    public void clickbasket()
    {
        clickFunction(driver.findElement(By.xpath("//h4[text()='Sepetim']")));
        clickFunction(driver.findElement(By.xpath("//a[@id='js-cart']")));
    }
    public void changeprice()
    {
        driver.findElement(By.xpath("//input[@name='quantity']")).clear();
        sendKeysFunction(driver.findElement(By.xpath("//input[@name='quantity']")), "2");
        clickFunction(driver.findElement(By.xpath("//i[@title='Güncelle']")));

    }
    public void readbooksprice()
    {
        String name =driver.findElement(By.xpath("(//td[@class='name'])[2]")).getText();
        String price =driver.findElement(By.xpath("(//td[@class='right'])[4]")).getText();
        System.out.println(price);
        System.out.println(name);
    }
    public void clickallcategories() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//a[text()='Tüm Kategoriler']")));
        Thread.sleep(2000);
    }

    public void clicksciendengineer()
    {
        clickFunction(driver.findElement(By.xpath("//h2[text()='Bilim & Mühendislik (7002)']")));
    }
    public void choosebook()
    {
        clickFunction(driver.findElement(By.xpath("(//div[@class='name ellipsis'])[1]")));
    }
    public void giveinfoaboutbook()
    {
        String value =driver.findElement(By.xpath("(//td[@class='name'])[2]")).getText();
        System.out.println("Kitap İsmi : "+value);
    }
    public void deletebasket()
    {
        clickFunction(driver.findElement(By.xpath("//i[@class='fa fa-times red-icon']")));
    }
    public void showsuccessmessage()
    {
        String deletemessage =driver.findElement(By.xpath("//h2[@class='swal2-title ky-swal-title-single']")).getText();
        System.out.println("Sepetten Silme Mesajı  :"+deletemessage);
    }



}
