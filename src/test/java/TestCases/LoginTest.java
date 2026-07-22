package TestCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class LoginTest extends BaseTest {

        @Test
        public void registerUser() {

            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            AccountInformationPage accountInfo = new AccountInformationPage(driver);
            AccountCreate accountCreate = new AccountCreate(driver);
            LogoutPage logoutPage = new LogoutPage(driver);

            homePage.clickSignupLogin();

            String email = "user" + System.currentTimeMillis() + "@gmail.com";

            loginPage.signUp("Jobless", email);

            accountInfo.addAccountInformation(
                    "password",
                    "21",
                    "December",
                    "2000",
                    "Arun",
                    "Raj",
                    "No.17 Velachery",
                    "India",
                    "TN",
                    "Chennai",
                    "600102",
                    "9656874242"
            );
            accountCreate.ClickContinue();
            logoutPage.ClickLogout();
        }
}

//    @Test
//    public void openBrowser() {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://automationexercise.com/");
//        driver.manage().window().maximize();
//
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        AccountInformationPage accountInfo = new AccountInformationPage(driver);
//
//        homePage.clickSignupLogin();
//        String email = "user" + System.currentTimeMillis() + "@gmail.com";
//        loginPage.signUp("Jobless", email);
//        accountInfo.addAccountInformation(
//                "password",
//                "21",
//                "December",
//                "2000",
//                "Arun",
//                "Raj",
//                "No.17 Velachery",
//                "India",
//                "TN",
//                "Chennai",
//                "600102",
//                "9656874242"
//        );
//
//        driver.quit();
//
//        //SignUp
//        // driver.findElement(By.partialLinkText("Signup / Login")).click();
////        driver.findElement(By.name("name")).sendKeys("Jobless");
////        driver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys("infopleaset@gmail.com");
////        driver.findElement(By.cssSelector("[data-qa='signup-button']")).click();
////        String Url = driver.getCurrentUrl();
////        System.out.println(Url);
////        driver.findElement(By.id("id_gender1")).click();
////        driver.findElement(By.cssSelector("[data-qa='password']")).sendKeys("password");
////        Select select = new Select(driver.findElement(By.id("days")));
////        select.selectByVisibleText("21");
////        Select select1 = new Select(driver.findElement(By.id("months")));
////        select1.selectByVisibleText("December");
////        Select select2 = new Select(driver.findElement(By.id("years")));
////        select2.selectByVisibleText("2000");
////        driver.findElement(By.id("first_name")).sendKeys("Arun");
////        driver.findElement(By.id("last_name")).sendKeys("Raj");
////        driver.findElement(By.id("address1")).sendKeys("NO.17 valechery chennai");
////        Select select3 = new Select(driver.findElement(By.id("country")));
////        select3.selectByVisibleText("India");
////        driver.findElement(By.cssSelector("[data-qa='state']")).sendKeys("TN");
////        driver.findElement(By.cssSelector("[data-qa='city']")).sendKeys("Chennai");
////        driver.findElement(By.cssSelector("[data-qa='zipcode']")).sendKeys("600102");
////        driver.findElement(By.cssSelector("[data-qa='mobile_number']")).sendKeys("9656874242");
////        driver.findElement(By.cssSelector("[data-qa='create-account']")).click();
////        String URL = driver.getCurrentUrl();
////        System.out.println(URL);
////        driver.findElement(By.cssSelector("[data-qa='continue-button']")).click();
////        String FinalUrl = driver.getCurrentUrl();
////        System.out.println(FinalUrl);
////        driver.findElement(By.partialLinkText("Logout")).click();
//    }

