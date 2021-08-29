package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractice {
WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }

    @Test
    public void info_alert_test(){
        //locating the button for alert to click
        WebElement infoAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        //Click to “Click for JS Alert”button
        infoAlertButton.click();

        //switching driver's focus to alert,so we can handle it
        Alert alert = driver.switchTo().alert();

        //Click to OK button from the alert
        alert.accept();

        // Verify “You successfully clicked an alert” text is displayed
        WebElement resultText = driver.findElement(By.xpath("//p[@id ='result']"));
        String expected = "You successfuly clicked an alert";
        String actual = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed(), "result text is not displayed on the page");
        Assert.assertEquals(actual, expected, "actual text is not as expected");
    }

    @Test
    public void conformation_alert_practice(){
        //Click to “Click for JS Confirm” button
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        button.click();

        // Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Verify “You clicked: Ok” text is displayed
        WebElement verify = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You clicked: Ok";
        String actual = verify.getText();

        Assert.assertTrue(verify.isDisplayed());
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void info_alert_TC2() throws InterruptedException {
        //Click to “Click for JS Prompt” button
        WebElement button = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        button.click();

        // Send “hello”text to alert
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");

        // Click to OK button from the alert
        Thread.sleep(1000);
        alert.accept();

        // Verify “You entered:  hello” text is displayed
        WebElement verify = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You entered: hello";
        String actual = verify.getText();
        Assert.assertTrue(verify.isDisplayed());
        Assert.assertEquals(actual,expected);


    }

}
