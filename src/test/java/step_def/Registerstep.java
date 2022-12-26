package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driver.DriverManager;
import pages.Registerpage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class Registerstep extends DriverManager {
    Registerpage registerpage = new Registerpage();
    DriverManager driverManager = new DriverManager();

    @Given("^I click on registerbutton$")
    public void i_click_on_registerbutton() throws Throwable {
        registerpage.setClickonregister();
    }

    @Given("^I select Gender$")
    public void i_select_Gender() throws Throwable {
        registerpage.setClickongender();
    }

    @Given("^I enter Name$")
    public void i_enter_Name() throws Throwable {
        registerpage.setClickonname();

    }

    @Given("^I enter lastname$")
    public void i_enter_lastname() throws Throwable {
        registerpage.setClickonlastname();

    }

    @Given("^I enter Day$")
    public void i_enter_Day() throws Throwable {
        registerpage.setDay();
    }

    @Given("^I enter month$")
    public void i_enter_month() throws Throwable {
        registerpage.setMonth();

    }

    @Given("^I enter year$")
    public void i_enter_year() throws Throwable {
        registerpage.setYear();
    }

    @Given("^I enter my e-mail$")
    public void i_enter_my_e_mail() throws Throwable {
        registerpage.setEnteremail();
    }

    @Given("^I enter password$")
    public void i_enter_password() throws Throwable {
        registerpage.setEnterpassword();
    }

    @Given("^I enter confirm Password$")
    public void i_enter_confirm_Password() throws Throwable {
        registerpage.setEnterconfirmpassword();
    }

    @Given("^I click on registerbtn$")
    public void i_click_on_registerbtn() throws Throwable {
        registerpage.setClickonregisterbtn();
    }

    @Then("^I Should see \"([^\"]*)\"$")
    public void i_Should_see(String arg1) throws Throwable {
        //        validation through title
        String actualTitle = driverManager.getTitle();
        System.out.println(actualTitle);
        assertThat(actualTitle, is(equalToIgnoringCase("nopCommerce demo store. Register")));
        registerpage.setYourregistrationcompleted();
    }
    @Then("^I submit my register btn$")
    public void i_submit_my_register_btn() throws Throwable {
registerpage.setRegisterSubmit();
    }

    @Then("^I click on continuebtnone$")
    public void i_click_on_continuebtnone() throws Throwable {
        registerpage.setContinuebtn1();
    }
    @Then("^I click on computerbtn$")
    public void i_click_on_computerbtn() throws Throwable {
       registerpage.setClickoncomputer();
    }
    @Then("^I click on notebook$")
    public void i_click_on_notebook() throws Throwable {
        registerpage.setClickonnotebook();
    }
    @Then("^user should see applemcbook description$")
    public void user_should_see_applemcbook_description() throws Throwable {
       registerpage.setApplemcbook();
    }
    @Then("^I Addtocart applemcbook$")
    public void i_Addtocart_applemcbook() throws Throwable {
        registerpage.setAddtocartapple();
    }
    @Then("^I click on shopping cart$")
    public void i_click_on_shopping_cart() throws Throwable {
       registerpage.setAddedtocart();
    }
    @Then("^I click terms and conditionbtn$")
    public void i_click_terms_and_conditionbtn() throws Throwable {
    registerpage.setClickontermsandcondition();
    }
    @Then("^I click on checkoutbtn$")
    public void i_click_on_checkoutbtn() throws Throwable {
        registerpage.setClickoncheckout();
    }

    @Then("^I enter email checkoutpage$")
    public void i_enter_email_checkoutpage() throws Throwable {
     registerpage.setEmailagain();
    }

    @Then("^I enter password checkout page$")
    public void i_enter_password_checkout_page() throws Throwable {
        registerpage.setPasswordagain();
    }
    @Then("^I click on continue two$")
    public void i_click_on_continue_two() throws Throwable {
       registerpage.setClickoncontinuetwo();
    }
    @Then("^I click on terms two$")
    public void i_click_on_terms_two() throws Throwable {
        registerpage.setTermstwo();
    }
    @Then("^I click on checkout two$")
    public void i_click_on_checkout_two() throws Throwable {
      registerpage.setCheckouttwo();
    }
    @Then("^I select country$")
    public void i_select_country() throws Throwable {
        registerpage.setCountryindia();
    }
    @Then("^I select city$")
    public void i_select_city() throws Throwable {
       registerpage.setEntercity();
    }
    @Then("^I enter the address$")
    public void i_enter_the_address() throws Throwable {
        registerpage.setEnteraddress();
    }
    @Then("^I enter my zipcode$")
    public void i_enter_my_zipcode() throws Throwable {
       registerpage.setEnetrzipcode();
    }
    @Then("^I entered my phone number$")
    public void i_entered_my_phone_number() throws Throwable {
        registerpage.setEnterphonenumber();
    }
    @Then("^I clicked on continue button$")
    public void i_clicked_on_continue_button() throws Throwable {
        registerpage.setClickcontinuebtn4();
    }
    @Then("^I then clicked on continue button agian$")
    public void i_then_clicked_on_continue_button_agian() throws Throwable {
        registerpage.setContinuebutton5();
    }
    @Then("^I then cliked on payment continue button$")
    public void i_then_cliked_on_payment_continue_button() throws Throwable {
        registerpage.setContinuebutton6();
    }
    @Then("^I then clicked on continue btn$")
    public void i_then_clicked_on_continue_btn() throws Throwable {
        registerpage.setContinuebutton7();
    }
    @Then("^I clicked on comfirm button$")
    public void i_clicked_on_comfirm_button() throws Throwable {
        registerpage.setComfirmbtn();
    }
    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {
        //        validation through title
        String actualTitle = registerpage.setThankyouforyourshopping();
        System.out.println(actualTitle);
        assertThat(actualTitle, is(equalToIgnoringCase("Your order has been successfully processed!")));


    }



}















