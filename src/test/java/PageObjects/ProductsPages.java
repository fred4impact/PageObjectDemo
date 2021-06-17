package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductsPages {

    //addToCartBtn =  //button[@class="single_add_to_cart_button button alt added"]

    WebDriver driver ;


    public ProductsPages(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
