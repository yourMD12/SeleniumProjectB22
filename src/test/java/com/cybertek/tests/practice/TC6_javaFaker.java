package com.cybertek.tests.practice;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC6_javaFaker {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/registration_form");
    }

    @Test
    public void TC6_Cybertek_registration_form_confirmationNote() throws InterruptedException {
        Faker faker = new Faker();
        // 3.Enter first name
        String first = faker.name().firstName();
        driver.findElement(By.name("firstname")).sendKeys(first);
        // 4.Enter last name
        String last = faker.name().lastName();
        driver.findElement(By.name("lastname")).sendKeys(last);
        // 5.Enter username
        driver.findElement(By.name("username")).sendKeys(faker.name().firstName()+faker.name().lastName());
        // 6.Enter email address
        driver.findElement(By.name("email")).sendKeys(faker.internet().emailAddress());
        // 7.Enter password
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(faker.number().digits(8));
        // 8.Enter phone number
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("917-357-4978");
        // 9.Select a gender from radio buttons\
        driver.findElement(By.cssSelector("input[value='male']")).click();
        // 10.Enter date of birth
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("11/12/1996");
        // 11.Select Department/Office
        WebElement office = driver.findElement(By.xpath("//select[@name='department']"));
        Select select = new Select(office);
        select.selectByVisibleText("Department of Engineering");
        // 12.Select Job Title
        WebElement job = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select select2 = new Select(job);
        select2.selectByVisibleText("Developer");
        // 13.Select programming language from checkboxes
        driver.findElement(By.xpath("//input[@value='java']")).click();
        driver.findElement(By.xpath("//input[@value='javascript']")).click();
        // 14.Click to sign up button
        Thread.sleep(1000);
        driver.findElement(By.id("wooden_spoon")).click();
        // 15.Verify success message “You’ve successfully completed registration.”is displayed.
//        String expected = "You've successfully completed registration!";
//        String actual = driver.findElement(By.linkText("You've successfully completed registration!")).getText();
//        Assert.assertEquals(actual,expected);

    }
}
