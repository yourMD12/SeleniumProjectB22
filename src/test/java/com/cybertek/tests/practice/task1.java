package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        //Storemanager201 passw UserUser123

        String actual = driver.getTitle();
        String expected = "Login";
//        if(actual.equals(expected)){
//            System.out.println("passed");
//            }else{
//            System.out.println("failed");
//        }
        String check = actual.equals(expected) ? "PASSED" : "FAILED";
        System.out.println(check);
        System.out.println(driver.getTitle());

//        driver.findElement(By.id("prependedInput")).sendKeys("Storemanager201");
//        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);


       WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
       userName.sendKeys("Storemanager201");
       userName.submit();

       WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
       password.sendKeys("UserUser123");
       password.submit();

       String actual2 = driver.getTitle();
        System.out.println(actual2);
       String expected2 = "Dashboard";

       String check2 = actual2.equals(expected2) ? "passed" : "failed";
        System.out.println(check2);

        String checkLoginDashboard = actual2.equals(actual) ? "failed" : "passed";
        System.out.println(checkLoginDashboard);



    }
}
