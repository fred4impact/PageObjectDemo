package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

    private WebDriver driver;


    @FindBy(xpath = "//span[@class=\'display-name\']")
    public WebElement Bilarn;


    public DashBoard(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver , this );

    }



}
