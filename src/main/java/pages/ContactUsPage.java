package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage{

    public ContactUsPage(WebDriver driver){
        super(driver);
    }

    private By ContactName = By.cssSelector("[data-qa='name']");
    private By ContactEmail = By.cssSelector("[data-qa='email']");
    private By ContactSubject = By.cssSelector("[data-qa='subject']");
    private By ContactMessage = By.cssSelector("[data-qa='message']");
    private By ContactSubmit = By.cssSelector("[data-qa='submit-button']");
    private By UploadFile = By.name("upload_file");

    private By ContactHeader =
            By.xpath("//h2[contains(text(),'Get In Touch')]");

    private By successMessage =
            By.xpath("//*[contains(text(),'Success! Your details have been submitted successfully.')]");

    public void fillContactForm(String Name,String Email,String Subject,String Message,String Path){
        type(ContactName,Name);
        type(ContactEmail,Email);
        type(ContactSubject,Subject);
        type(ContactMessage,Message);
        upload(UploadFile,Path);
        click(ContactSubmit);
    }

    public boolean isContactPageDisplayed(){
        return isDisplayed(ContactHeader);
    }

    public void confirmSubmission() {
        acceptAlert();
    }

    public boolean isSuccessMessageDisplayed(){
        return isDisplayed(successMessage);
    }
}
