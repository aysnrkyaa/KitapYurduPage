package stepDefiniton;

import PageObjectModel.Home_page_function;
import PageObjectModel.login_page_function;
import cucumber.api.java.en.*;


public class SepettenUrunCikarma {


    login_page_function login_page_fun = new login_page_function();
    Home_page_function home_page_function=new Home_page_function();

    @Given("click signin buttoon")
    public void click_signin_buttoon() {
        login_page_fun.setup("https://www.kitapyurdu.com/index.php?route=common/home");
        login_page_fun.clickSignin();

    }

    @Given("send login info")
    public void send_login_info() {

        login_page_fun.sendUsername("aysenur.kaya1@hotmail.com");
        login_page_fun.sendPassword("Deneme123.");

    }

    @Given("click login buttoon")
    public void click_login_buttoon() throws InterruptedException {
        login_page_fun.clickLoginbutton();

    }

    @Given("click all categories")
    public void click_all_categories() throws InterruptedException {

     home_page_function.clickallcategories();
    }

    @Given("click science and engineering")
    public void click_science_and_engineering() {
        home_page_function.clicksciendengineer();
    }

    @Given("choose book")
    public void choose_book() {
        home_page_function.choosebook();
    }

    @Given("click add basket")
    public void click_add_basket() throws InterruptedException {
        home_page_function.addbasket();
    }

    @Given("go to basketpage")
    public void go_to_basketpage() {
        home_page_function.clickbasket();
    }

    @Given("give info about book")
    public void give_info_about_book() {
      home_page_function.giveinfoaboutbook();
    }

    @When("delete the book")
    public void delete_the_book() {
      home_page_function.deletebasket();
    }

    @Then("show success message")
    public void show_success_message() {
        home_page_function.showsuccessmessage();
        login_page_fun.quitdriver();


    }




}
