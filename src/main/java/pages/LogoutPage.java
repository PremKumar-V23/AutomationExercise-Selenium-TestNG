package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{

    public LogoutPage(WebDriver driver){
        super(driver);
    }

    private By LogoutBtn = By.partialLinkText("Logout");
    public void ClickLogout(){
        click(LogoutBtn);
    }
}
