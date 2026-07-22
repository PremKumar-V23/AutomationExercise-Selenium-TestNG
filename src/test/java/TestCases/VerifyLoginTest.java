package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

public class VerifyLoginTest extends BaseTest {

    @Test
    public void loginUserWithValidCredentials() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        LogoutPage logoutPage = new LogoutPage(driver);

        // Verify Home Page
        Assert.assertTrue(homePage.isHomePageDisplayed(),
                "Home page is not displayed.");

        // Open Login Page
        homePage.clickSignupLogin();

        // Verify Login Page
        Assert.assertTrue(loginPage.isLoginPageDisplayed(),
                "Login page is not displayed.");

        // Login
        loginPage.login("hot@gmail.com", "password");

        // Verify User Logged In
        Assert.assertTrue(homePage.isUserLoggedIn(),
                "User login failed.");

        // Logout
        logoutPage.ClickLogout();

        // Verify Login Page Again
        Assert.assertTrue(loginPage.isLoginPageDisplayed(),
                "Login page is not displayed after logout.");
    }
}