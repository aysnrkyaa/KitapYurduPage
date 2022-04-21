package stepDefiniton;

import PageObjectModel.login_page_function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginOlumsuz {

    login_page_function login_page_fun = new login_page_function();


    @Given("go to kitapyurdu website websitee")
    public void go_to_kitapyurdu_website_websitee() {
        login_page_fun.setup("https://www.kitapyurdu.com/index.php?route=common/home");

    }

    @Given("click signinn button")
    public void click_signinn_button() {
        login_page_fun.clickSignin();

    }

    @Given("writee username")
    public void writee_username() throws InterruptedException {
        login_page_fun.sendUsername("aysenur.kaya1@hotmail.com");
        Thread.sleep(2000);

    }

    @Given("write wrong password")
    public void write_wrong_password() {
        login_page_fun.sendPassword("123456");

    }

    @When("click login button")
    public void click_login_button() throws InterruptedException {
        login_page_fun.clickLoginbutton();

    }

    @Then("show error message")
    public void show_error_message() throws InterruptedException {
        login_page_fun.showerrormessagelogin();
        Thread.sleep(2000);
        login_page_fun.quitdriver();


    }

}
