package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private By productSaleLogo = By.cssSelector("img[alt='Website for practice']");
    private By firstProduct = By.cssSelector("a[href='/product_details/1']");
    private By productName = By.cssSelector(".product-information h2");
    private By category = By.xpath("//p[contains(text(),'Category')]");
    private By productPrice = By.xpath("//span[contains(text(),'Rs.')]");
    private By availability = By.xpath("//b[contains(text(),'Availability')]");
    private By condition = By.xpath("//b[contains(text(),'Condition')]");
    private By brand = By.xpath("//b[contains(text(),'Brand')]");

    public boolean isProductPageDisplayed() {
        return isDisplayed(productSaleLogo);
    }

    public boolean isProductDisplayed() {
        return isDisplayed(firstProduct);
    }

    public void clickFirstProduct() {
        jsClick(firstProduct);
    }

    public boolean isProductNameDisplayed() {
        return isDisplayed(productName);
    }

    public boolean isProductCategoryDisplayed() {
        return isDisplayed(category);
    }

    public boolean isProductPriceDisplayed() {
        return isDisplayed(productPrice);
    }

    public boolean isProductAvailabilityDisplayed() {
        return isDisplayed(availability);
    }

    public boolean isProductConditionDisplayed() {
        return isDisplayed(condition);
    }

    public boolean isProductBrandDisplayed() {
        return isDisplayed(brand);
    }
}