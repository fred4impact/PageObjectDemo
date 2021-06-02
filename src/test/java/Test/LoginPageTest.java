package Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PageInitializer;
import TestData.DataProValues;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginPageTest extends PageInitializer {


    @Test(description = "test valid user login", priority = 1)
    public void UserLoginTest(){
//        PageInitializer.Initialize();
        Initialize(); // here i called the initializer class
        LoginPage login = home.clickLoginModal(); // call the home page to link to login
        login.setUsername(username); // this username is coming from the config properties
        login.setPassWord(password); // this password is coming form the config properties
        login.clickBtnLogin();
        // verify the my account title
    }


    // example of data provider
    @Test(enabled = false, priority = 2, dataProvider = "data-provider", dataProviderClass = DataProValues.class)
    public void InvUserLogin(String InvUser, String InvPass){
        Initialize(); // here i called the initializer class
        LoginPage login = home.clickLoginModal(); // call the home page to link to login
        login.setUsername(InvUser); // this username is coming from the config properties
        login.setPassWord(InvPass); // this password is coming form the config properties
        login.clickBtnLogin();



    }




}
