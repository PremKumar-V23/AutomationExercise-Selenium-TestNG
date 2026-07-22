package pages;
import org.openqa.selenium.*;

public class AccountInformationPage extends BasePage {


    public AccountInformationPage(WebDriver driver){
        super(driver);
    }

    private By genderBtn = By.id("id_gender1");
    private By accountPassword = By.cssSelector("[data-qa='password']");
    private By day = By.id("days");
    private By month = By.id("months");
    private By year = By.id("years");
    private By firstName = By.id("first_name");
    private By lastname = By.id("last_name");
    private By address = By.id("address1");
    private By country = By.id("country");
    private By state = By.cssSelector("[data-qa='state']");
    private By city = By.cssSelector("[data-qa='city']");
    private By zipCode = By.cssSelector("[data-qa='zipcode']");
    private By mobileNumber = By.cssSelector("[data-qa='mobile_number']");
    private By createAccountBtn = By.cssSelector("[data-qa='create-account']");

    public void addAccountInformation(String Password, String Days, String Month, String Year, String Firstname,
                                  String Lastname, String Address, String Country, String State, String City,
                                  String Zipcode, String MobileNo){

        click(genderBtn);
        type(accountPassword,Password);
        selectByVisibleText(day,Days);
        selectByVisibleText(month,Month);
        selectByVisibleText(year,Year);
        type(firstName,Firstname);
        type(lastname,Lastname);
        type(address,Address);
        selectByVisibleText(country,Country);
        type(state,State);
        type(city,City);
        type(zipCode,Zipcode);
        type(mobileNumber,MobileNo);
        click(createAccountBtn);
    }
}
