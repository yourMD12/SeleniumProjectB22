package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc6_xpath_locator {
    public static void main(String[] args) {

        //TC #6: XPATH LOCATOR practice
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // 3. Click on Button 1
        // locating using XPATH with class attribute value
       // WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        // locating using text of the button with XPATH
        // WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        // locating using "onclick" attribute value with XPATH locator
        WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));

        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        // 4. Verify text displayed is as expected: Expected:“Clicked on button one!”
        String expected = "Clicked on button one!";
        String actual = resultText.getText();
        if(actual.equals(expected)){
            System.out.println("result test verification passed");
        }else{
            System.out.println("result test verification failed");
        }

    }

}
