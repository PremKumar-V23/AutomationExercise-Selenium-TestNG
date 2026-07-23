package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTest {
    @Test
    public void loginWithInvalidCredentials() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(homePage.isHomePageDisplayed());

        homePage.clickSignupLogin();

        Assert.assertTrue(loginPage.isLoginPageDisplayed());

        loginPage.login("wrong@gmail.com", "wrongpassword");

        Assert.assertTrue(loginPage.isLoginErrorDisplayed(),
                "Error message is not displayed.");
    }
}
