package Base;

import Utilities.ConfigsReader;
import com.google.common.io.Files;
import javafx.scene.Camera;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.internal.annotations.TestAnnotation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TestBase {

    // Instance of the config reader
    ConfigsReader configsreader = new ConfigsReader();
    private static final Logger LOG = LoggerFactory.getLogger(TestBase.class);
    // logback intstance

    public String baseURL=configsreader.getURL();
    public static WebDriver driver;
    public String username=configsreader.getUsername();
    public String password=configsreader.getPassword();


//
//    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br)
    {
//        logger = Logger.getLogger("PageObjectDemo");
//        PropertyConfigurator.configure("Log4j.properties");

        if(br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",configsreader.getChrome());
            driver=new ChromeDriver();
            LOG.info("** Chrome browser launched **");
        }
        else if(br.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",configsreader.getFirefox());
            driver = new FirefoxDriver();
            LOG.info("** Lunch Firefox Browser **");
        }


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
        LOG.info("** Open Base Url **");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
        LOG.info("** Application Closed **");
    }


    @AfterMethod
    public void  recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()) {
        }
           var camera = (TakesScreenshot)driver;
           File screenshot = camera.getScreenshotAs(OutputType.FILE);

           try{

               Files.move(screenshot, new File("Screenshots/" + result.getName() + ".png"));

           }catch(IOException e){
               e.printStackTrace();
           }
    }






}
