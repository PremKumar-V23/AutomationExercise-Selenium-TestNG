package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class CartSubcriptionTest extends BaseTest {

    @Test
    public void VerifyCartSubcription() {
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.ClickCart();
        Assert.assertTrue(cartPage.isCartPageDisplayed());
        Assert.assertTrue(cartPage.isFooterDisplayed());
        cartPage.addSubcriptionDetails();
        Assert.assertTrue(cartPage.isSubscriptionSuccessDisplayed());
    }
}
