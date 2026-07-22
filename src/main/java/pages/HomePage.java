package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By signupLoginLink = By.partialLinkText("Signup / Login");
    private By loggedInUser = By.xpath("//*[contains(text(),'Logged in as')]");
    private By homeLogo = By.cssSelector("img[alt='Website for automation practice']");

    // Actions
    public void clickSignupLogin() {
        click(signupLoginLink);
    }

    // Validations
    public boolean isHomePageDisplayed() {
        return isDisplayed(homeLogo);
    }

    public boolean isUserLoggedIn() {
        return isDisplayed(loggedInUser);
    }
}