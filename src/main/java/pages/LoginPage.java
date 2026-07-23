package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Signup Locators
    private By signupName = By.name("name");
    private By signupEmail = By.cssSelector("[data-qa='signup-email']");
    private By signupButton = By.cssSelector("[data-qa='signup-button']");

    // Login Locators
    private By loginEmail = By.cssSelector("[data-qa='login-email']");
    private By loginPassword = By.cssSelector("[data-qa='login-password']");
    private By loginButton = By.cssSelector("[data-qa='login-button']");

    // Validation Locator
    private By loginHeader = By.xpath("//h2[text()='Login to your account']");

    // Login Error Message
    private By loginErrorMessage =
            By.xpath("//*[contains(text(),'Your email or password is incorrect!')]");

    private By ExistingEmailErrorMessage =
            By.xpath("//*[contains(text(),'Email Address already exist!')]");

    // Signup
    public void signUp(String name, String email) {
        type(signupName, name);
        type(signupEmail, email);
        click(signupButton);
    }

    // Login
    public void login(String email, String password) {
        type(loginEmail, email);
        type(loginPassword, password);
        click(loginButton);
    }

    // Validation
    public boolean isLoginPageDisplayed() {
        return isDisplayed(loginHeader);
    }


    public boolean isLoginErrorDisplayed(){
        return isDisplayed(loginErrorMessage);
    }

    public boolean isEmailExixtingErrorDisplayed(){
        return isDisplayed(ExistingEmailErrorMessage);
    }
}