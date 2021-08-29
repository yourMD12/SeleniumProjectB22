package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.LibraryUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class p1_Library_Login {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1.Open browser
        // 2.Go to website: http://library2.cybertekschool.com/login.html
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }


    @Test
    public void TC1_login_link_count_test() {
        //Task#1: Library software link verification
        //login Method calling to login library app
        LibraryUtils.loginToLibrary(driver);

        // 6.Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        // 7.Print out each link text on this page
        for(WebElement each : allLinks){
            System.out.println(each.getText());
        }
    }

}
