package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cybertek_Practice {
    public static void main(String[] args) {

        // TC #2: Cybertekpractice tool verifications
        WebDriverManager.chromedriver().setup();

        // 1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 2.Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        // 3.Verify URL contains       Expected: cybertekschool
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        String needs = "cybertekschool";

        // 4.Verify title: Expected: Practice
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        String wants = "Practice";

        if(currentUrl.contains(needs) && currentTitle.contains(wants)){
            System.out.println("URL and Title verification test passed");
        }else{
            System.out.println("URL and Title verification test failed");
        }



    }
}
