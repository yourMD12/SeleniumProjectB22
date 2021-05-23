package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    // new method creation
    //method name getDriver
    //static method
    //accept String arg: browserType
    //  -this arg will determine what type of browser is opened
    // -if chrome passed -> it will open chrome, if fox -> fox
    // RETURN TYPE:  "WebDriver"
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

        getDriver("chrome");
    }
        public static WebDriver getDriver(String browserType) {
        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("browser not found");
            return null;
        }

    }

}
