package stepDefiniton;

import PageObjectModel.Home_page_function;
import PageObjectModel.login_page_function;
import cucumber.api.java.en.*;


public class DİlSecimi {

    login_page_function login_page_fun = new login_page_function();
    Home_page_function home_page_function = new Home_page_function();

    @Given("go to kitapyurduu website")
    public void go_to_kitapyurduu_website() {
        login_page_fun.setup("https://www.kitapyurdu.com/index.php?route=common/home");

    }

    @Given("choose Engish")
    public void choose_engish() throws InterruptedException {
        home_page_function.clickEnglish();
        Thread.sleep(2000);
    }

    @Given("check English text")
    public void check_english_text() {
        home_page_function.checkEnglishtext();
    }

    @When("choose Turkish")
    public void choose_turkish() {
        home_page_function.clickTurkish();

    }

    @Then("check Turkish text")
    public void check_turkish_text() throws InterruptedException {
        Thread.sleep(3000);
        home_page_function.checkTurkishtext();
        login_page_fun.quitdriver();
    }


}
