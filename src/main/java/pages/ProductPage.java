package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // ---------- Page Verification ----------
    private By productSaleLogo = By.cssSelector("img[alt='Website for practice']");

    // ---------- Product Details ----------
    private By firstProduct = By.cssSelector("a[href='/product_details/1']");
    private By productName = By.cssSelector(".product-information h2");
    private By category = By.xpath("//p[contains(text(),'Category')]");
    private By productPrice = By.xpath("//span[contains(text(),'Rs.')]");
    private By availability = By.xpath("//b[contains(text(),'Availability')]");
    private By condition = By.xpath("//b[contains(text(),'Condition')]");
    private By brand = By.xpath("//b[contains(text(),'Brand')]");

    // ---------- Product Cards ----------
    private By firstProductCard =
            By.xpath("(//div[@class='single-products'])[1]");

    private By secondProductCard =
            By.xpath("(//div[@class='single-products'])[2]");

    // ---------- Add To Cart ----------
    private By firstAddToCart =
            By.xpath("(//a[@data-product-id='1'])[1]");

    private By secondAddToCart =
            By.xpath("(//a[@data-product-id='2'])[1]");

    // ---------- Popup ----------
    private By continueShoppingButton =
            By.cssSelector(".close-modal");

    private By viewCartButton =
            By.xpath("//u[text()='View Cart']");

    // ---------- Product Information ----------
    private By firstProductName =
            By.xpath("(//div[@class='productinfo text-center']//p)[1]");

    private By secondProductName =
            By.xpath("(//div[@class='productinfo text-center']//p)[2]");

    private By firstProductPrice =
            By.xpath("(//div[@class='productinfo text-center']//h2)[1]");

    private By secondProductPrice =
            By.xpath("(//div[@class='productinfo text-center']//h2)[2]");

    // ---------------------------------------------------

    public boolean isProductPageDisplayed() {
        return isDisplayed(productSaleLogo);
    }

    public boolean isProductDisplayed() {
        return isDisplayed(firstProduct);
    }

    public void clickFirstProduct() {
        jsClick(firstProduct);
    }

    // ---------- Product Details ----------

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

    // ---------- Capture Product Data ----------

    public String getFirstProductName() {
        return find(firstProductName).getText();
    }

    public String getFirstProductPrice() {
        return find(firstProductPrice).getText();
    }

    public String getSecondProductName() {
        return find(secondProductName).getText();
    }

    public String getSecondProductPrice() {
        return find(secondProductPrice).getText();
    }

    // ---------- Cart ----------

    public void addFirstProductToCart() {
        hover(firstProductCard);
        jsClick(firstAddToCart);
    }

    public void addSecondProductToCart() {
        hover(secondProductCard);
        jsClick(secondAddToCart);
    }

    public void clickContinueShopping() {
        click(continueShoppingButton);
    }

    public void clickViewCart() {
        click(viewCartButton);
    }
}