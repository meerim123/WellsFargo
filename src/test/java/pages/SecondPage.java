package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage extends TestBase {
    HomePage homePage = new HomePage();

    public SecondPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//strong[contains (text(), 'We do not recognize')] ")
    public WebElement getWrongText;




}
