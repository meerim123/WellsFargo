package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        initializer();
        homePage = new HomePage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test //1st test case
    public void verifyHomePage() {
    Assert.assertEquals( driver.getTitle(), "Wells Fargo – Banking, Credit Cards, Loans, Mortgages & More");
    }

}






