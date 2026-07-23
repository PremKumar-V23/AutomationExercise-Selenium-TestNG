package TestCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class RegisterUser extends BaseTest {

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

