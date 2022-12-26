package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends DriverManager {
    DriverManager driverManager = new DriverManager();
    @FindBy(className = "ico-register")
    private WebElement clickonregister;

    @FindBy(id= "gender-female")
    private WebElement clickongender;

    @FindBy(id= "FirstName")
    private WebElement clickonname;

    @FindBy(id = "LastName")
    private WebElement clickonlastname;

	@FindBy(name = "DateOfBirthDay")
	private WebElement day;

	@FindBy(name = "DateOfBirthMonth")
	private WebElement month;

	@FindBy(name = "DateOfBirthYear")
	private WebElement year;

	@FindBy(id="Email")
	private WebElement enteremail;

	@FindBy(id ="Password")
	private WebElement enterpassword;

	@FindBy(id= "ConfirmPassword")
	private WebElement enterconfirmpassword;

	@FindBy(id="register-button")
	private WebElement clickonregisterbtn;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
	private WebElement yourregistrationcompleted;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")
    private WebElement continuebtn1;

	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	private WebElement clickoncomputer;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2/a")
	private WebElement clickonnotebook;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")
	private WebElement applemcbook;

	@FindBy(id ="add-to-cart-button-4")
	private WebElement addtocartapple;

	@FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
	private WebElement addedtocart;

	@FindBy(id ="termsofservice")
	private WebElement clickontermsandcondition;

    @FindBy(id="checkout")
    private WebElement clickoncheckout;

	@FindBy(xpath = "//*[@id=\"Email\"]")
	private WebElement emailagain;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	private WebElement passwordagain;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	private WebElement clickoncontinuetwo;

	@FindBy(xpath ="//*[@id=\"termsofservice\"]")
	private WebElement termstwo;

	@FindBy(id="checkout")
	private WebElement checkouttwo;

	@FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]")
	private WebElement countryindia;

	@FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
	private WebElement entercity;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
    private WebElement enteraddress;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    private WebElement enetrzipcode;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
    private WebElement enterphonenumber;

    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    private WebElement clickcontinuebtn4;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    private WebElement continuebutton5;

    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    private WebElement continuebutton6;

    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    private WebElement continuebutton7;

    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    private WebElement comfirmbtn;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
    private WebElement thankyouforyourshopping;

	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")
	private WebElement registerSubmit;


    public void setRegisterSubmit() {
        registerSubmit.click();
    }


        public void setClickonregister() {
            clickonregister.click();
        }
        public void setClickongender(){
            clickongender.click();
        }
        public void setClickonname(){
            clickonname.sendKeys("mama");
        }
        public void setClickonlastname() {
            clickonlastname.sendKeys("papa");
        }
        public void setDay(){
            day.sendKeys("25");
        }
        public void setMonth(){
            month.sendKeys("april");
        }
        public void setYear() {
            year.sendKeys("1980");
        }
        public void setEnteremail(){
            int random = driverManager.generateRandomNumber();
            enteremail.sendKeys(random+"22@gmail.com");
        }
        public void setEnterpassword(){
            enterpassword.sendKeys("123456");
        }
        public void setEnterconfirmpassword(){
            enterconfirmpassword.sendKeys("123456");
        }
        public void setClickonregisterbtn(){
            clickonregisterbtn.click();
        }
        public String setYourregistrationcompleted(){
            return yourregistrationcompleted.getText();

        }
        public void setContinuebtn1(){
            continuebtn1.click();
        }
        public void setClickoncomputer(){
            clickoncomputer.click();
        }
        public void setClickonnotebook(){
            clickonnotebook.click();
        }
        public void setApplemcbook(){
            applemcbook.click();
        }
        public void setAddtocartapple(){
            addtocartapple.click();
        }
        public void setAddedtocart(){
            addedtocart.click();
        }
        public void setClickontermsandcondition(){
            clickontermsandcondition.click();
        }
        public void setClickoncheckout(){
            clickoncheckout.click();
        }
        public void setEmailagain(){
          // int random = driverManager.generateRandomNumber();
           // enteremail.sendKeys(random+"@gmail.com");
           // int random = driverManager.generateRandomNumber();
            setEnteremail();
        }
        public void setPasswordagain(){
            passwordagain.sendKeys("123456");
        }
        public void setClickoncontinuetwo(){
            clickoncontinuetwo.click();
        }
        public void setTermstwo(){
            termstwo.click();
        }
        public void setCheckouttwo(){
            checkouttwo.click();
        }
        public void setCountryindia(){
            countryindia.sendKeys("india");
        }
        public void setEntercity(){
            entercity.sendKeys("surat");
        }
        public void setEnteraddress(){
            enteraddress.sendKeys("flat 2 gymkhana");
        }
        public void setEnetrzipcode(){
            enetrzipcode.sendKeys("wd195dd");
        }
        public void setEnterphonenumber(){
            enterphonenumber.sendKeys("07686364778");
        }
        public void setClickcontinuebtn4(){
            clickcontinuebtn4.click();
        }
        public void setContinuebutton5(){
            continuebutton5.click();
        }
        public void setContinuebutton6(){
            continuebutton6.click();
        }
        public void setContinuebutton7(){
            continuebutton7.click();
        }
        public void setComfirmbtn(){
            comfirmbtn.click();
        }
        public String setThankyouforyourshopping(){
            return thankyouforyourshopping.getText();
        }
}







