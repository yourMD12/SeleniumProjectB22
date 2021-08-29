package com.cybertek.tests.base;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
   public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        String browser = ConfigurationReader.getProperty("browser");
        //This line returns String : chrome


        //this line returns String: http://practice.cybertekschool.com/tables#edit

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}
