package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasePage extends BasePage {

    public TestCasePage(WebDriver driver){
        super(driver);
    }

    private By TestCaseHeader = By.xpath("//b[contains(text(),'Test Cases')]");

    public boolean isTestCaseDisplayed(){
        return isDisplayed(TestCaseHeader);
    }

    public boolean isTestCaseUrlDisplayed() {
        return getCurrentUrl().contains("/test_cases");
    }

}
