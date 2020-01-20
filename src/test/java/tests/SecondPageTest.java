package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ATMpage;
import pages.HomePage;
import pages.SecondPage;

public class SecondPageTest extends TestBase {

    HomePage homePage;
    SecondPage secondPage;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        initializer();
        homePage = new HomePage();
        secondPage = new SecondPage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifySecondPage() {
        homePage.navigateToSecondPage();
        Assert.assertEquals(driver.getTitle(), "Sign On to View Your Personal Accounts | Wells Fargo");

    }

}
