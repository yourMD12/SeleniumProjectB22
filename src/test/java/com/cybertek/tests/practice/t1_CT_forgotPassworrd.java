package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class t1_CT_forgotPassworrd {
    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        // a. “Home” link
        WebElement one = driver.findElement(By.xpath("//a[@class='nav-link']"));

        // b. “Forgot password” header
        WebElement two = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        // c. “E-mail” text
        WebElement three = driver.findElement(By.xpath("//label[@for='email']"));

        // d. E-mail input box
        WebElement four = driver.findElement(By.xpath("//input[@name='email']"));

        // e. “Retrieve password” button
        WebElement five = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));

        // f. “Powered byCybertek School” text
        WebElement six = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all WebElements are displayed.
        if(one.isDisplayed() && two.isDisplayed() && three.isDisplayed() && four.isDisplayed() &&
                five.isDisplayed() && six.isDisplayed()){
            System.out.println("all web element are displayed, test Passed");
        }else{
            System.out.println("not all web element are displayed, test Failed");
        }


    }



}
