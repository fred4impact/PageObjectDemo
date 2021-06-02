package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    WebDriver driver = null ;

    @FindBy(xpath = "//a[@href=\'#account-modal\']")
    WebElement loginModal;

    @FindBy(xpath = "//*[contains(text(),'Contact Us')]")
    WebElement contactUsLink;

    // the xpath for the list of feature products on the home page
    @FindBy(xpath = "//img[@class=\'attachment-woocommerce_thumbnail size-woocommerce_thumbnail loaded\']")
    List<WebElement> featuredProducts;


    public HomePage(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver, this);
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
