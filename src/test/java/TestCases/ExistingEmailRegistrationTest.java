package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

@Test
public class ExistingEmailRegistrationTest extends BaseTest {

    public void ExistingEmail(){

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    Assert.assertTrue(homePage.isHomePageDisplayed());

    homePage.clickSignupLogin();

    Assert.assertTrue(loginPage.isLoginPageDisplayed());

    loginPage.signUp(ConfigReader.getProperty("name"),ConfigReader.getProperty("email"));

    Assert.assertTrue(loginPage.isEmailExixtingErrorDisplayed(),
            "Error message is not displayed.");
    }
}
