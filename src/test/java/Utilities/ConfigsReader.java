package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigsReader {
     Properties prop; // create a virable of properties

    public ConfigsReader(){

        // set the path to the config file
        File src = new File("./Configuration/config.properties");


        try {
            FileInputStream fis = new FileInputStream(src);
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }

    }


    // methods to read data from each the configuration properties

    public String getURL()
    {
        String url=prop.getProperty("url");
        return url;
    }

     // method to get username
    public String getUsername()
    {
        String username=prop.getProperty("username");
        return username;
    }

    // method to get Password
    public String getPassword()
    {
        String password=prop.getProperty("password");
        return password;
    }


    public String getChrome()
    {
        String chromepath=prop.getProperty("chrome");
        return chromepath;
    }


    public String getFirefox()
    {
        String firefoxpath=prop.getProperty("firefox");
        return firefoxpath;
    }





}
