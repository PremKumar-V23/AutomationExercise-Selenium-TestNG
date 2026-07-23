package TestCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TestCasePage;

public class VerifyTestCasesTest extends BaseTest {

    @Test
    public void VerifyTestCasePageExist(){
        HomePage homePage = new HomePage(driver);
        TestCasePage testCasePage= new TestCasePage(driver);
        homePage.clickTestCase();
        Assert.assertTrue(testCasePage.isTestCaseDisplayed(),"TestCase Not Displayed");
        Assert.assertTrue(testCasePage.isTestCaseUrlDisplayed(),"Not a Vaild Url");
    }
}
