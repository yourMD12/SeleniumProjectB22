package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_ClassLocatorPractice {
    public static void main(String[] args) {

        //TC #6: Practice Cybertek –Class locator practice
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to http://practice.cybertekschool.com/inputs
        driver.get("http://practice.cybertekschool.com/inputs");

        // 3.Click “Home”button
        // 1) locate the web element using class attribute value
        // 2) click
        driver.findElement(By.className("nav-link")).click();

        // 4.Verify title as expected :Expected: Practice
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Practice")){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }


    }
}
