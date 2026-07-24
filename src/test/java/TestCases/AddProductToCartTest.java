package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class AddProductToCartTest extends BaseTest {

    @Test
    public void verifyProductAddingToCart() {

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        // Verify Home Page
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickProduct();

        // Verify Products Page
        Assert.assertTrue(productPage.isProductPageDisplayed());

        // Capture expected values before adding to cart
        String firstExpectedName = productPage.getFirstProductName();
        String firstExpectedPrice = productPage.getFirstProductPrice();

        String expectedSecondName = productPage.getSecondProductName()
                .replaceAll("\\s+", " ")
                .trim();
        String secondExpectedPrice = productPage.getSecondProductPrice();

        // Add first product
        productPage.addFirstProductToCart();
        productPage.clickContinueShopping();

        // Add second product
        productPage.addSecondProductToCart();
        productPage.clickViewCart();

        String actualSecondName = cartPage.s_getCartProductName()
                .replaceAll("\\s+", " ")
                .trim();

        // Verify first product
        Assert.assertEquals(
                cartPage.f_getCartProductName(),
                firstExpectedName,
                "First product name does not match."
        );

        Assert.assertEquals(
                cartPage.f_getCartProductPrice(),
                firstExpectedPrice,
                "First product price does not match."
        );

        // Verify second product
        Assert.assertEquals(actualSecondName, expectedSecondName,
                "Second product name does not match.");

        Assert.assertEquals(
                cartPage.s_getCartProductPrice(),
                secondExpectedPrice,
                "Second product price does not match."
        );
    }
}