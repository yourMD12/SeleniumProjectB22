package com.cybertek.tests.practice.dropdownTasks1_5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC5 {
    public static void main(String[] args) throws InterruptedException {

        //TC #5: Selecting value from non-select dropdown
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Click to non-select dropdown
        WebElement nonSelect = driver.findElement(By.xpath("//a[@href ='#']"));
        nonSelect.click();

        // 4.Select Facebook from dropdown
        driver.findElement(By.linkText("Facebook")).click();

        // 5.Verify title is “Facebook -Log In or Sign Up”
        String actual = driver.getTitle();
        String expected = "Facebook - Log In or Sign Up";
        if(actual.equals(expected)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
