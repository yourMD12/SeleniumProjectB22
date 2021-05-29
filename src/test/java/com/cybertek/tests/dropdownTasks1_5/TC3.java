package com.cybertek.tests.dropdownTasks1_5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC3 {
    public static void main(String[] args) throws InterruptedException {

        //TC #3: Selecting date on dropdown and verifying
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Select “December 1st, 1922” and verify it is selected.
        // Select year using: visible text
        // Select month using : value attribute
        // Select day using: index number
        WebElement year = driver.findElement(By.xpath("//select[@id ='year']"));
        Select year1 = new Select(year);
        year1.selectByVisibleText("1922");
        Thread.sleep(2000);
        Select month = new Select(driver.findElement(By.xpath("//select[@id ='month']")));
        month.selectByValue("11");
        Thread.sleep(2000);
        Select day = new Select(driver.findElement(By.xpath("//select[@id ='day']")));
        day.selectByIndex(0);
        String year2 = year1.getFirstSelectedOption().getText();
        String month1 = month.getFirstSelectedOption().getText();
        String day1 = day.getFirstSelectedOption().getText();
        if(year2.equals("1922") && month1.equals("December") && day1.equals("1")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
