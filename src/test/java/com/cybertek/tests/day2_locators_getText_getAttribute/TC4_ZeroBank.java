package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_ZeroBank {
    public static void main(String[] args) {

        //TC #4: Zero Bank login title verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Enter username: username
        driver.findElement(By.id("user_login")).sendKeys("username");

        // 4.Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);

        // 5.Click to “Account Activity” link
        driver.findElement(By.linkText("Account Activity")).click();

        // 6.Verify title changed to: Expected: “Zero –Account Activity”
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Zero –Account Activity")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        // 7.Click to “Transfer Funds” link
        driver.findElement(By.linkText("Transfer Funds")).click();

        // 8.Verify title changed to: Expected: “Zero –Transfer Funds”
        String actualTitle2 = driver.getTitle();
        if(actualTitle2.equals("Zero –Transfer Funds")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        // 9.Click to “Pay Bills” link
        driver.findElement(By.linkText("Pay Bills")).click();

        // 10.Verify title changed to: Expected: “Zero -Pay Bills”
        String actualTitle3 = driver.getTitle();
        if(actualTitle3.equals("Zero -Pay Bills")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        // 11.Click to “My Money Map” link
        driver.findElement(By.linkText("My Money Map")).click();

        // 12.Verify title changed to: Expected: “Zero –My Money Map”
        String actualTitle4 = driver.getTitle();
        if(actualTitle4.equals("Zero –My Money Map")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        // 13.Click to “Online Statements” link
        driver.findElement(By.linkText("Online Statements")).click();

        // 14.Verify title changed to: Expected: “Zero –Online Statements”
        String actualTitle5 = driver.getTitle();
        if(actualTitle5.equals("Zero –Online Statements")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
