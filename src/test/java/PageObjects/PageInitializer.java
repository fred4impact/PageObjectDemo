package PageObjects;

import Base.TestBase;

public class PageInitializer extends TestBase {

    public static HomePage home;
    public static LoginPage login;
    public static ContactUsPage contact;
    public static ProductsPages product;
    public static DashBoard  profile ;



    public static void Initialize(){
        // here all the pages are been initialized
        home  = new HomePage(driver);
        login = new LoginPage(driver);
        contact = new ContactUsPage(driver);
        product = new ProductsPages(driver);
        profile = new DashBoard(driver);
    }


}
