package com.cybertek.tests.practice;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.SmartBearUtility;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC4_verifyOrder {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables#edit");
    }

    @Test
    public void TC4_verifyOrder() {
        //•Create a method named verifyOrder in TableUtilsclass.
        // •Method takes WebDriver object and String(name).
        // •Method should verify if given name exists in orders.
        // •This method should simply accepts a name(String), and assert whether given name
        // is in the list or not.
        // •Create a new TestNG test to test if the method is working as expected.
        SmartBearUtility.verifyOrder(driver,"Marina");

    }

    @Test
        // Practice #5: Method: printNamesAndEmails
    // •Create a method named printNamesAndEmails in TableUtils class.
    // •Output should be like:•Name1: name , Email1: email•Name2: name , Email2: email
        public void printNamesAndEmails(){
            SmartBearUtility.printNamesAndEmails(driver);
        }

}
