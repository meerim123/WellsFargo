package tests;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ATMpage;
import pages.HomePage;
import utils.SeleniumUtils;
@Test
public class ATMpageTest extends TestBase {
    HomePage homePage;
    ATMpage atMpage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        initializer();
        homePage = new HomePage();
        atMpage = new ATMpage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifyATMpage() {
        homePage.navigateToATMPage();
        Assert.assertEquals(atMpage.AtmText.getText(), "ATM and Banking Locations");
    }



}
