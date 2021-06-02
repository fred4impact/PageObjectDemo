package Utilities;

import Base.TestBase;
import Pages.PageInitializer;
import org.openqa.selenium.WebElement;

public class CommonMethods extends PageInitializer {

   // method to check if an element on the page is visible
    public static boolean isDisplay(WebElement element){
        boolean isVisible = false ;
        if(element.isDisplayed()){
            isVisible=true;
        }
        return isVisible;
    }


    // method to to check if element can be click on
    public static boolean isClickable(WebElement element){
        boolean isClick = false ;
        // a check to see if an element is displayed
        if(isDisplay(element)){
            if(element.isEnabled()){
                isClick=true;
            }
        }
        return isClick; // return result

    }


     // method to send text in an input box
    public static void sendInput(WebElement textbox, String text){
          // check if element is present and also clickable
        if(isClickable(textbox)){
            textbox.sendKeys(text); // your sendkeys into the input
        }else{
            System.out.println("==== TestBox is not visible ====");
        }
    }


    // method to check is button can be clicked.
    public static void clickButton(WebElement button){
          if(isClickable(button)){
              button.click();
          }
    }

}
