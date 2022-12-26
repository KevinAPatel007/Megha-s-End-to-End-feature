package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverManager;
import pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    LoginPage loginPage = new LoginPage();

    @Then("^I should see \"([^\"]*)\" text on login page$")
    public void i_should_see_text_on_login_page(String expText) throws Throwable {
        String myAcutalText= loginPage.getWelcomeSignInText();
        assertThat(myAcutalText, is(equalToIgnoringCase(expText)));
    }

    @When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_email_and_password(String email, String password) throws Throwable {
       loginPage.enterEmailAndPassword(email, password);
    }

    @When("^I click on log in on login page$")
    public void i_click_on_log_in_on_login_page() throws Throwable {
        loginPage.clickOnLoginSubmitButton();
    }

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
//        validation through url
        String actualUrl = driverManager.getUrl();
        System.out.println(actualUrl);
        assertThat(actualUrl, is(endsWith("nopcommerce.com/")));
    }
    @Then("^I see Login was unsuccessful\\. so i need to register onthe website$")
    public void i_see_Login_was_unsuccessful_so_i_need_to_register_onthe_website() throws Throwable {
boolean isDisplayed = loginPage.Loginunsucessful();
        assertThat(isDisplayed, is(true));
    }

}
