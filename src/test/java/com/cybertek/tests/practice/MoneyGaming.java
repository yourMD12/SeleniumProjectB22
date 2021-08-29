package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoneyGaming {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    // 1. Navigate to: https://moneygaming.qa.gameaccount.com/
        driver.get("https://moneygaming.qa.gameaccount.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void moneyGame(){
        // 2. Click the JOIN NOW button to open the registration page
        WebElement button = driver.findElement(By.xpath("//a[@class='newUser green']"));
        button.click();

//        3. Select a title value from the dropdown
        WebElement title = driver.findElement(By.id("title"));
        Select select = new Select(title);
        select.selectByVisibleText("Mr");

//        4. Enter your first name and surname in the form
        WebElement name = driver.findElement(By.xpath("//input[@name='map(firstName)']"));
        name.sendKeys("John");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        lastName.sendKeys("Smith");

//        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        WebElement termbox = driver.findElement(By.xpath("//input[@name='map(terms)']"));
        termbox.click();

//        6. Submit the form by clicking the JOIN NOW button
        WebElement joinButton = driver.findElement(By.xpath("//input[@id='form']"));
        joinButton.click();

//        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
//        birth box
        WebElement validationMessage = driver.findElement(By.xpath("//label[@for='dob']"));
        String actual = validationMessage.getText();
        String expected = "This field is required";
        Assert.assertEquals(actual,expected);
    }



}
