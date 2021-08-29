package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Anastasiia {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user185");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);

    }

    //TC1 - TC2
    @Test
    public void vytrack1() throws InterruptedException {

        WebElement fleet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleet.click();
        Thread.sleep(2000);
        WebElement vehicle = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        vehicle.click();
        Thread.sleep(2000);
        WebElement solomon = driver.findElement(By.xpath("(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate'])[1]"));
        solomon.click();
    }

    //TS3
    @Test
    public void vytrack3() throws InterruptedException {

        //driver.findElement(By.id("prependedInput")).sendKeys("user185");
        //driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        // Thread.sleep(1000);


        Actions action = new Actions(driver);
        WebElement btn = driver.findElement(By.xpath("(//ul[@class='nav-multilevel main-menu']/li)[3]"));
        action.moveToElement(btn).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[.='Calendar Events']")).click();


    }

    @Test
    public void vytrack4() throws InterruptedException {

        WebElement profile = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
        profile.click();
        WebElement myConfiguration = driver.findElement(By.linkText("My Configuration"));
        myConfiguration.click();
        WebElement resetButton = driver.findElement(By.xpath("//button[@type='reset']"));
        Thread.sleep(1000);
        resetButton.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[.='OK']")).click();
        WebElement acceptReset = driver.findElement(By.xpath("//button[@type='reset']"));
        acceptReset.click();
        Thread.sleep(1000);
        WebElement checkBox = driver.findElement(By.xpath("(//input[@data-name='field__use-parent-scope-value'] )[2]"));
        //  Thread.sleep(1000);
        //checkBox.click();
        Assert.assertTrue(checkBox.isSelected());
    }
}
