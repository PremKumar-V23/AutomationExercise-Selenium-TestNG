package pages;
import org.openqa.selenium.*;

public class AccountCreate extends BasePage {

    public AccountCreate(WebDriver driver){
        super(driver);
    }

    private By Continuebutton = By.cssSelector("[data-qa='continue-button']");

    public void ClickContinue(){
        click(Continuebutton);
    }
    ////        driver.findElement(By.partialLinkText("Logout")).click();
}
