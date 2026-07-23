package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    private By subscriptionHeader = By.xpath("//h2[contains(text(),'Subscription')]");
    private By subscriptionEmail = By.id("susbscribe_email");
    private By subscriptionButton = By.id("subscribe");
    private By successMessage = By.xpath("//div[contains(@class,'alert-success')]");
    private By shoppingCartHeader = By.cssSelector("li.active");

    public boolean isFooterDisplayed(){
        return isDisplayed(subscriptionHeader);
    }

    public boolean isCartPageDisplayed(){
        return isDisplayed(shoppingCartHeader);
    }

    public void addSubcriptionDetails(){
        type(subscriptionEmail,"st@gmail");
        jsClick(subscriptionButton);
    }

    public boolean isSubscriptionSuccessDisplayed() {
        return isDisplayed(successMessage);
    }
}
