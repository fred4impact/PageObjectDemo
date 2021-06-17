package Test;

import PageObjects.PageInitializer;
import Utilities.CommonMethods;
import org.testng.annotations.Test;

public class ContactUsTest extends PageInitializer {

    @Test(description = "contact us form test")
    void enterContact(){
        Initialize();
        LOG.info("Page Initializer");
        contact =  home.clickContact();
        LOG.info("Move to Contact Page ");
        CommonMethods.sendInput(contact.yourName, "Mike Jake");
        LOG.info("Enter your name ");
        CommonMethods.sendInput(contact.yourEmail, "Mike.Jake@gmail.com");
        LOG.info("Enter email ");
        CommonMethods.sendInput(contact.yourSubject, "Page Object Principle");
        LOG.info("Enter Your subject");
        CommonMethods.sendInput(contact.yourMessage, "Message Message Message");
        LOG.info("Enter your country");
    }

}
