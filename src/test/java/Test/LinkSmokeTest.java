package Test;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class LinkSmokeTest extends TestBase {


    @Test
    public void TestLink() {
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("*** Total links on the application is    "+links.size());

        for(int i=0;i<links.size();i++)
        {
            WebElement weblink= links.get(i);
            String url = weblink.getAttribute("href");
            verifyLinkActive(url);
        }


    }

    public void verifyLinkActive(String Linkurl){

        try
        {
            URL url = new URL(Linkurl);

            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();

            httpURLConnect.setConnectTimeout(3000);

            httpURLConnect.connect();

            if(httpURLConnect.getResponseCode()==200)
            {
                System.out.println(Linkurl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
            {
                System.out.println(Linkurl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {

        }

    }








}
