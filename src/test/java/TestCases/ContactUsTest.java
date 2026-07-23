package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends BaseTest {

    @Test
    public void verifyContactForm(){
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);

        homePage.clickContactUs();
        Assert.assertTrue(contactUsPage.isContactPageDisplayed());
        contactUsPage.fillContactForm("Mathi","Hot@gmail.com","Hello","Hello Everyone","C:\\Users\\preml\\OneDrive\\Pictures\\Screenshots\\Screenshot (1).png");
        contactUsPage.confirmSubmission();
        Assert.assertTrue(contactUsPage.isSuccessMessageDisplayed());

    }
}
