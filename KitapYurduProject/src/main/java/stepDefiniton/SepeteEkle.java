package stepDefiniton;

import PageObjectModel.Home_page_function;
import PageObjectModel.login_page_function;

import cucumber.api.java.en.*;

public class SepeteEkle {


    login_page_function login_page_fun = new login_page_function();
    Home_page_function home_page_function = new Home_page_function();

    @Given("go to kitapyurrdu website")
    public void go_to_kitapyurrdu_website() {
        login_page_fun.setup("https://www.kitapyurdu.com/index.php?route=common/home");

    }

    @Given("click kirtasiye")
    public void click_kirtasiye() {
        home_page_function.clickkirtasiye();
    }

    @Given("click books")
    public void click_books() {
        home_page_function.clickbooks();
    }

    @Given("click books details")
    public void click_books_details() {
        home_page_function.clickbooksdetails();

    }

    @Given("add basket")
    public void add_basket() throws InterruptedException {
        home_page_function.addbasket();
    }

    @Given("click basket")
    public void click_basket() {
        home_page_function.clickbasket();

    }

    @When("change the price")
    public void change_the_price() {
        home_page_function.changeprice();
    }

    @Then("read books price")
    public void read_books_price() {
        home_page_function.readbooksprice();
        login_page_fun.quitdriver();


    }


}
