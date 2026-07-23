package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void verifyProductElements() {

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        Assert.assertTrue(homePage.isHomePageDisplayed());

        homePage.clickProduct();

        Assert.assertTrue(productPage.isProductPageDisplayed());

        Assert.assertTrue(productPage.isProductDisplayed());

        productPage.clickFirstProduct();

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(productPage.isProductNameDisplayed());
        Assert.assertTrue(productPage.isProductCategoryDisplayed());
        Assert.assertTrue(productPage.isProductPriceDisplayed());
        Assert.assertTrue(productPage.isProductAvailabilityDisplayed());
        Assert.assertTrue(productPage.isProductConditionDisplayed());
        Assert.assertTrue(productPage.isProductBrandDisplayed());
    }
}
