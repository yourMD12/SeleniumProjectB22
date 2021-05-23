package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_backANDforthNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        // 1-Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2-Go to: https://google.com
        driver.get("https://google.com");

        // 3-Click to Gmail from top right.
        //<=== locating the web element ===> <--click-->
        driver.findElement(By.linkText("Gmail")).click(); //        #1 linkText();
        //driver.findElement(By.partialLinkText("mail")).click();   #2 partialLinkText();

        // 4-Verify title contains: Expected: Gmail
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Gmail")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        // 5-Go back to Google by using the .back();
        driver.navigate().back();

        // 6-Verify title equals: .....0....Expected: Google
        String freshTitle = driver.getTitle();
        if(freshTitle.equals("Google")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }




    }
}
