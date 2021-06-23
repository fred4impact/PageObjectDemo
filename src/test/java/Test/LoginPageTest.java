package Test;

import PageObjects.DashBoard;
import PageObjects.LoginPage;
import PageObjects.PageInitializer;
import TestData.DataProValues;
import Utilities.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends PageInitializer {


    @Test(description = "test valid user login", priority = 1)
    public void UserLoginTest(){
        Initialize(); // here i called the initializer class
        LOG.info(" +++ Page initialization +++");

        // here used a method in the common method called isDisplayed.
        // this method is to verify logo is displayed on teh login page
        Assert.assertTrue(CommonMethods.isDisplay(home.appLogo()));
        LOG.info("*** logo is displayed *** ");

        login = home.clickLoginModal(); // call the home page to link to login
        LOG.info("+++ Robot clicks on login Page +++");
        login.setUsername(username); // this username is coming from the config properties
        LOG.info(" Robot enter Username");
        login.setPassWord(password); // this password is coming form the config properties
        LOG.info(" Robot enter Password");
        profile = login.clickBtnLogin();
        LOG.info("+++ Robot moves to Dashboard successfully ++++");
          if(profile.Bilarn.getText().equals("Bilarn"))
          {

              Assert.assertTrue(true );
              LOG.info(" Robot assert Profile name");
          }
          else {
              Assert.assertTrue(false);
          }

         LOG.info("The current user porfile name is :" + profile.Bilarn.getText());
    }


    @Test(enabled = false, priority = 2, dataProvider = "data-provider", dataProviderClass = DataProValues.class)
    public void InvUserLogin(String InvUser, String InvPass){
        Initialize(); // here i called the initializer class
        LoginPage login = home.clickLoginModal(); // call the home page to link to login
        login.setUsername(InvUser); // this username is coming from the config properties
        login.setPassWord(InvPass); // this password is coming form the config properties
        login.clickBtnLogin();



    }




}
