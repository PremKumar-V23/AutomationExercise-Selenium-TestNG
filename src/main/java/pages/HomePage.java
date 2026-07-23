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
    private By contactUsLink = By.partialLinkText("Contact us");
    private By testCaseLink = By.partialLinkText("Test Cases");
    private By productLink = By.partialLinkText("Products");
    private By cartLink = By.partialLinkText("Cart");
    private By subscriptionHeader = By.xpath("//h2[contains(text(),'Subscription')]");
    private By subscriptionEmail = By.id("susbscribe_email");
    private By subscriptionButton = By.id("subscribe");
    private By successMessage = By.xpath("//div[contains(@class,'alert-success')]");

    // Actions
    public void clickSignupLogin() {
        click(signupLoginLink);
    }

    public void clickContactUs() { click(contactUsLink); }

    public void clickTestCase() { click(testCaseLink); };

    public void clickProduct(){ click(productLink); }

    // Validations
    public boolean isHomePageDisplayed() {
        return isDisplayed(homeLogo);
    }

    public boolean isUserLoggedIn() {
        return isDisplayed(loggedInUser);
    }

    public void scrollDownPage(){
        scrollToBottom();
    }

    public boolean isFooterDisplayed(){
        return isDisplayed(subscriptionHeader);
    }

    public void addSubcriptionDetails(){
        type(subscriptionEmail,"st@gmail");
        jsClick(subscriptionButton);
    }

    public boolean isSubscriptionSuccessDisplayed() {
        return isDisplayed(successMessage);
    }

    public void ClickCart(){
        click(cartLink);
    }

}