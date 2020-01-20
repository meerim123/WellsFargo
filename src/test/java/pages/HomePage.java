package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    public HomePage() {
        PageFactory.initElements( driver, this );
    }

    @FindBy(xpath = "//a[contains (text(), 'ATMs/Locations')]")
    public WebElement ATM;

    @FindBy(id = "userid")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "btnSignon")
    public WebElement signOn;


    public void navigateToSecondPage() {
        SeleniumUtils.click( userName );
        SeleniumUtils.sendKeys( userName,"gtdhggh");
        SeleniumUtils.click( password );
        SeleniumUtils.sendKeys( password, "ygtgj1237");
        SeleniumUtils.click(signOn);
    }

    public void navigateToATMPage() {
        SeleniumUtils.waitForVisibilityOfElement( ATM );
        SeleniumUtils.click(ATM);

    }
}