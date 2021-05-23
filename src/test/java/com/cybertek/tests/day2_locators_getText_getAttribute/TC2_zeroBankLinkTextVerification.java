package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_zeroBankLinkTextVerification {
    public static void main(String[] args) {

        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        
        //LOCATE THE LINK & STORE INSIDE OF WebElement
        WebElement zeroBank = driver.findElement(By.className("brand"));

        // 3.Verify link text from top left: Expected: “Zero Bank”
        String expected = "Zero Bank";
        String actualLink = zeroBank.getText();
        
        if(actualLink.equals(expected)){
            System.out.println("Link text verification passed");
        }else{
            System.out.println("Link text verification failed");
        }
        
        // 4.Verify link href attribute value contains: Expected: “index.html”
        String expectedAttr = "index.html";
        String actualAttr = zeroBank.getAttribute("href");
        //System.out.println("actualAttr = " + actualAttr);
        if(actualAttr.contains(expectedAttr)){
            System.out.println("Href attribute value verification passed");
        }else{
            System.out.println("Href attribute value verification failed");
        }
        
    }
}
