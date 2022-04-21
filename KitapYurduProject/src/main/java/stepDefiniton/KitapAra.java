package stepDefiniton;

import PageObjectModel.Home_page_function;
import PageObjectModel.login_page_function;
import cucumber.api.java.en.*;


public class KitapAra {


    login_page_function login_page_fun = new login_page_function();
    Home_page_function home_page_function = new Home_page_function();

    @Given("go to kitapyurdu websitee")
    public void go_to_kitapyurdu_websitee() {
        login_page_fun.setup("https://www.kitapyurdu.com/index.php?route=common/home");

    }

    @Given("click signin buttonnn")
    public void click_signin_buttonnn() {
        login_page_fun.clickSignin();

    }

    @Given("write usernamee")
    public void write_usernamee() {
        login_page_fun.sendUsername("aysenur.kaya1@hotmail.com");

    }

    @Given("writee passwordd")
    public void writee_passwordd() {
        login_page_fun.sendPassword("Deneme123.");

    }

    @Given("click login buttonnn")
    public void click_login_buttonnn() throws InterruptedException {
        login_page_fun.clickLoginbutton();

    }

    @Given("write book name")
    public void write_book_name() {
        home_page_function.writername();
    }

    @Given("click search button")
    public void click_search_button() {
        home_page_function.clicksearchbutton();
    }

    @When("click book")
    public void click_book() throws InterruptedException {
        home_page_function.clickbook();
        Thread.sleep(2000);
    }

    @Then("read book name")
    public void read_book_name() {
        home_page_function.readbookname();
        login_page_fun.quitdriver();

    }


}
