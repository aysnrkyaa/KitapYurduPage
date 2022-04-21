package stepDefiniton;

import PageObjectModel.AbstractClass;
import PageObjectModel.login_page_function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Login extends AbstractClass {

    login_page_function login_page_fun = new login_page_function();

    @Given("^go to kitapyurdu website$")
    public void go_to_kitapyurdu_website() throws Throwable {
        login_page_fun.setup("https://www.kitapyurdu.com/index.php?route=common/home");
    }

    @Given("^click signin button$")
    public void click_signin_button() throws Throwable {
        login_page_fun.clickSignin();
    }

    @Given("^write username$")
    public void write_username() throws Throwable {
        login_page_fun.sendUsername("aysenur.kaya1@hotmail.com");
        Thread.sleep(2000);
    }

    @Given("^write  password$")
    public void write_password() throws Throwable {
        login_page_fun.sendPassword("Deneme123.");
    }

    @When("^clickk login button$")
    public void clickk_login_button() throws Throwable {
        login_page_fun.clickLoginbutton();
        Thread.sleep(2000);
    }

    @Then("^read username$")
    public void read_username() throws Throwable {
        login_page_fun.checkusername();
        login_page_fun.quitdriver();
    }

}
