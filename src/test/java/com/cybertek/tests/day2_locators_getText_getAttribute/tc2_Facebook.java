package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc2_Facebook {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("9031895543");

        // 4.Enter incorrect password
        WebElement inputPassword = driver.findElement(By.id("pass"));
                inputPassword.sendKeys("12547ijfrg47" + Keys.ENTER);

        // 5.Verify title changed to: Expected: “Log into Facebook | Facebook
        Thread.sleep(5000); //freezing the code for 5sec so that Chrome browser can catch up with loading the page
        //driver.findElement(By.id("pageTitle"));
        String actual = driver.getTitle();
        String expected = "Log into Facebook";
        if(actual.equals(expected)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
