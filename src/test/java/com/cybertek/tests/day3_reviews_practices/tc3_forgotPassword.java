package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class tc3_forgotPassword {
    public static void main(String[] args) throws InterruptedException {


        //   TC #3: PracticeCybertek/ForgotPassword URL verification
        //   1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //   2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
//
//        //   3.Enter any email into input box
//        //   4.Click on Retrieve password
        driver.findElement(By.name("email")).sendKeys("hello@gmail.com" + Keys.ENTER);

        //   5.Verify URL contains: Expected: “email_sent”


        //   6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”


    }
}
