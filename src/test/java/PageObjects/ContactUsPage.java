package PageObjects;

import Utilities.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends CommonMethods {

   private  WebDriver driver = null;


    public ContactUsPage(WebDriver driver){
      this.driver = driver;
      PageFactory.initElements(driver, this);
    }

    @FindBy(name = "your-name")
    @CacheLookup
    public WebElement yourName;

    @FindBy(name = "your-email")
    @CacheLookup
    public WebElement yourEmail;

    @FindBy(name="your-subject")
    @CacheLookup
    public WebElement yourSubject;

    @FindBy(name="your-message")
    @CacheLookup
    public WebElement yourMessage;


    @FindBy(xpath = "//input[@value=\'Send Message\']")
    @CacheLookup
    public WebElement btnSendMessage;




}
