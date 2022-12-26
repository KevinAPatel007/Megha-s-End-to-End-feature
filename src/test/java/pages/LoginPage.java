package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    @FindBy(css = ".page-title")
    private WebElement welcomeSignInText;

    @FindBy(id = "Email")
    private WebElement emailInputText;

    @FindBy(id = "Password")
    private WebElement passwordInputText;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    private WebElement logInSubmitButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")
    private WebElement loginunsucessful;








    public String getWelcomeSignInText(){
       return welcomeSignInText.getText();
    }

    public void enterEmailAndPassword(String email, String password) {
          emailInputText.clear();
          emailInputText.sendKeys(email);
          passwordInputText.clear();
          passwordInputText.sendKeys(password);
    }

    public void clickOnLoginSubmitButton(){
        logInSubmitButton.click();
    }


    public boolean Loginunsucessful(){
        return loginunsucessful.isDisplayed();}
    }




