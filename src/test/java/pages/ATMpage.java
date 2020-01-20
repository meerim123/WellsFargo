package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.SeleniumUtils;

public class ATMpage extends TestBase {

    public ATMpage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//h1[contains (text(), 'ATM and Banking Locations')]")
    public WebElement AtmText;


}
