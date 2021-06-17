package PageObjects;

import Utilities.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends CommonMethods {

    WebDriver driver = null;


    public ContactUsPage(WebDriver driver){
//     this.driver = driver;
     PageFactory.initElements(driver, this);
    }

    @FindBy(name = "your-name")
    WebElement yourName;

    @FindBy(name = "your-email")
    WebElement yourEmail;

    @FindBy(name="your-subject")
    WebElement yourSubject;

    @FindBy(name="your-message")
    WebElement yourMessage;


    @FindBy(xpath = "//input[@value=\'Send Message\']")
    WebElement btnSendMessage;


}
