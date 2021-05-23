package com.cybertek.tests.day3_reviews_practices;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc5_warmUp {
    public static void main(String[] args) {

        //TC#5: Basic login authentication
        //1-Open a chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        //OR
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3-Verify title equals: Expected: Web Orders Login
        String actual = driver.getTitle();
        if(actual.equals(("Web Orders Login"))){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        // 4-Enter username: Tester
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");


        // 5-Enter password: test
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" );

        // 6-Click “Sign In” button
        WebElement loginButtin = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButtin.click();

        // 7-Verify title equals: Expected: Web Orders
        String fresh = driver.getTitle();
        if(fresh.equals("Web Orders")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
