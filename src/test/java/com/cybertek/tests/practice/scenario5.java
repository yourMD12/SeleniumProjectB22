package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class scenario5 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        WebElement login = driver.findElement(By.xpath("//input[@id ='prependedInput']"));
        login.sendKeys("user177");
        WebElement passw = driver.findElement(By.xpath("//input[@id ='prependedInput2']"));
        passw.sendKeys("UserUser123" + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(1000);
        //driver.close();
    }
    @Test
    public void scenario5() throws InterruptedException {
        WebElement fl = driver.findElement(By.xpath("//span[@class ='title title-level-1']"));
        Select fleet = new Select(fl);
        fleet.getFirstSelectedOption();
        WebElement text = driver.findElement(By.xpath("//span[@class ='title title-level-2']"));
        Select vehicles = new Select(text);
        vehicles.selectByVisibleText("Vehicles");
        driver.findElement(By.xpath("//div[@class ='column-manager dropdown']")).click();
        WebElement setting = driver.findElement(By.xpath("//input[@data-role ='renderable']"));
        Select setButton = new Select(setting);
        Thread.sleep(1000);
        setButton.getOptions();


    }



}
