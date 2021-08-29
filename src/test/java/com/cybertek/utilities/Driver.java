package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    creating the private constructor so this class object is not reachable from outside
     */

    private Driver(){}
    /*
    -making our "driver' instance private so it is not reachable from outside of the class
    -we make it static, cause we want to run before everything else & we'll use it in a static method
     */
    private static WebDriver driver;

    /*
    creating re-usable utility method that will return same 'driver' instance everytime we call it
     */
    public static WebDriver getDriver(){

        if(driver == null){
            /*
            -we read our browser type from configuration.properties file using .getProperty method
            we creating in ConfigurationReader class
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            -depending on the browser type our switch statement will determine to open
            specific type of browser/driver
             */
            switch(browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;


            }
        }
        /*
        same driver instance will be returned every time we call Driver.getDriver(); method
         */
        return driver;
    }

    /*
    this method makes sure we have some form of driver session or driver id has;
    either null or not null is must exist
     */
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }


}
