package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected WebElement find(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    protected void jsClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    protected boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }

    protected void type(By locator, String text) {
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected void selectByVisibleText(By locator, String visibleText) {
        Select select = new Select(find(locator));
        select.selectByVisibleText(visibleText);
    }

    protected void selectByValue(By locator, String value) {
        Select select = new Select(find(locator));
        select.selectByValue(value);
    }

    protected void selectByIndex(By locator, int index) {
        Select select = new Select(find(locator));
        select.selectByIndex(index);
    }

    protected void upload(By locator, String filePath) {
        find(locator).sendKeys(filePath);
    }

    protected String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    protected void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    protected void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}