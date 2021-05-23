package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc4_Facebook {
    public static void main(String[] args) {

        //TC #4: Facebook header verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Verify “Create a page” link href value contains text: Expected: “registration_form”
        WebElement href = driver.findElement(By.linkText("Create a Page"));
        String link = href.getAttribute("href");
        if(link.contains("registration_form")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
