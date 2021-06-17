package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver = null ;

    // locators of the login Page
    @FindBy(xpath = "//input[@id=\'user_login\']")
    @CacheLookup
    private WebElement userName;

    @FindBy(xpath = "//input[@id=\'user_pass\']")
    @CacheLookup
    private WebElement passWord;

    @FindBy(xpath = "//button[@name=\'wp-submit\']")
    @CacheLookup
    private WebElement loginButton;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }

   /*  action to enter text to the username input */
    // set value in to the text box
    public void setUsername(String User){
        userName.sendKeys(User);
    }

     // get value
    public WebElement getUserName(){
        return userName;
    }

    // action to enter text to the username input
    public void setPassWord(String pass){
        passWord.sendKeys(pass);
    }

    // get value of paasword
    public WebElement getPassWord(){
        return passWord;
    }


    public DashBoard clickBtnLogin(){
        loginButton.click();
        return new DashBoard(driver);
    }






}
