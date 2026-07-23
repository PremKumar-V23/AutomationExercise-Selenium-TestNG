package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SubscriptionTest extends BaseTest {

    @Test
    public void Subcription(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.scrollDownPage();
        Assert.assertTrue(homePage.isFooterDisplayed());
        homePage.addSubcriptionDetails();
        Assert.assertTrue(homePage.isSubscriptionSuccessDisplayed());
    }
}
