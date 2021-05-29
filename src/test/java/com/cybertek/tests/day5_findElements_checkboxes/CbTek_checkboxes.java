package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CbTek_checkboxes {
    public static void main(String[] args) {

        //Practice: Cybertek Checkboxes
        // 1.Go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");

        // 2.Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if (!checkbox1.isSelected()) {
            System.out.println("TEST PASSED: Checkbox #1 is NOT selected by default");
        } else {
            System.out.println("Test Failed");
        }

        // 3.Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if (checkbox2.isSelected()) {
            System.out.println("TEST PASSED: Checkbox #2 is selected by default");
        } else {
            System.out.println("Test Failed");
        }

        // 4.Click checkbox #1 to select it.
        checkbox1.click();

        // 5.Click checkbox #2 to deselect it.
        checkbox2.click();

        // 6.Confirm checkbox #1 is SELECTED.
        if(checkbox1.isSelected()) {
            System.out.println("TEST PASSED: Checkbox #1 is selected, TEST PASSED");
        } else {
            System.out.println("Test failed");
        }

        // 7.Confirm checkbox #2 is NOT selected
        if(!checkbox2.isSelected()) {
            System.out.println("TEST PASSED: Checkbox #2 is not selected, TEST PASSED");
        } else {
            System.out.println("Test failed");
        }

    }
}
