package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ZeroBank {
    public static void main(String[] args) {

//TC #3: Zero Bank login title verification
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

// 5.Verify title changed to: Expected: “Zero –Account Summary”
        driver.findElement(By.id("account_summary_tab"));
        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero –Account Summary";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
