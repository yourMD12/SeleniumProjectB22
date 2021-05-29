package com.cybertek.tests.dropdownTasks1_5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC2 {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Selecting state from State dropdown and verifying result
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement states = driver.findElement(By.xpath("//select[@id ='state']"));
        Select state = new Select(states);

        state.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        state.selectByValue("VA");
        Thread.sleep(2000);
        state.selectByIndex(5);
        String actual = state.getFirstSelectedOption().getText();
        if(actual.equals("California")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

//        // 3.Select Illinois
//        WebElement il = driver.findElement(By.xpath("//option[@value ='IL']"));
//        Thread.sleep(2000);
//        il.click();
//
//        // 4.Select Virginia
//        WebElement va = driver.findElement(By.xpath("//option[@value ='VA']"));
//        Thread.sleep(2000);
//        va.click();
//
//        // 5.Select California
//        WebElement ca = driver.findElement(By.xpath("//option[@value ='CA']"));
//        Thread.sleep(2000);
//        ca.click();
//
//        // 6.Verify final selected option is California.
//        // Use all Select options.(visible text, value, index)
//        String actual = ca.getText();
//        if(actual.equals("California")){
//            System.out.println("passed");
//        }else{
//            System.out.println("failed");
//        }


    }
}
