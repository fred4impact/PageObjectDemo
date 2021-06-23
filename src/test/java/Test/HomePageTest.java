package Test;

import PageObjects.PageInitializer;
import Utilities.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends PageInitializer {


        /*
           1 -> extends the master page
           2 -> create your test methods
           3 -> call the initialize method in teh pageinitialize
           4 -> use the instance of your page
           5- >  call the method you will like to use in from the commonMethod
          */

     @Test(description = "verify logo is visible")
     public void  verifyLogoIsVisible(){

     Initialize();
     Assert.assertTrue(CommonMethods.isDisplay(home.appLogo()));
     LOG.info(" **** Application Logo is Visible *****");

     }


}
