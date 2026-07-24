package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    private By F_cartProductName = By.xpath("//tr[@id='product-1']//td[@class='cart_description']//a");
    private By F_cartProductPrice = By.xpath("//tr[@id='product-1']//td[@class='cart_price']//p");

    private By S_cartProductName = By.xpath("//tr[@id='product-2']//td[@class='cart_description']//a");
    private By S_cartProductPrice = By.xpath("//tr[@id='product-2']//td[@class='cart_price']//p");

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

    public String f_getCartProductName() {
        return find(F_cartProductName).getText();
    }

    public String f_getCartProductPrice() {
        return find(F_cartProductPrice).getText();
    }

    public String s_getCartProductName() {
        return find(S_cartProductName).getText();
    }

    public String s_getCartProductPrice() {
        return find(S_cartProductPrice).getText();
    }

    public boolean isSubscriptionSuccessDisplayed() {
        return isDisplayed(successMessage);
    }
}
