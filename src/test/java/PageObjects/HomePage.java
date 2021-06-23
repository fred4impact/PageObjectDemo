package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import javax.xml.xpath.XPath;
import java.util.List;

public class HomePage {

    WebDriver driver = null ;

    @FindBy(xpath = "//a[@href=\'#account-modal\']")
    @CacheLookup
    WebElement loginModal;

    @FindBy(xpath = "//*[contains(text(),'Contact Us')]")
    @CacheLookup
    WebElement contactUsLink;

    // the xpath for the list of feature products on the home page
    @FindBy(xpath = "//img[@class=\'attachment-woocommerce_thumbnail size-woocommerce_thumbnail loaded\']")
    @CacheLookup
    List<WebElement> featuredProducts;

    @FindBy(xpath = "//*[@class=\'default-logo\']")
    @CacheLookup
    private WebElement logo ;


    public HomePage(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver, this);
    }


    public WebElement appLogo(){
        return logo;
    }









  // this method click on the login link on home page
    public LoginPage clickLoginModal(){
        loginModal.click();
        return new LoginPage(driver);
    }

    /* this method clicks on the contact us link */

    public ContactUsPage clickContact(){
        contactUsLink.click();
        return new ContactUsPage(driver);
    }





}
