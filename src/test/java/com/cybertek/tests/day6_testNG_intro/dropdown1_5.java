package com.cybertek.tests.day6_testNG_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropdown1_5 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
    @Test
    public void TC1() throws InterruptedException{
        WebElement simple = driver.findElement(By.id("dropdown"));
        Select select = new Select(simple);
        String current = select.getFirstSelectedOption().getText();
        String expected = "Please select an option";
        Thread.sleep(1000);
        Assert.assertEquals(current, expected);
    }
    @Test
    public void TC2() throws InterruptedException{
        WebElement states = driver.findElement(By.xpath("//select[@id ='state']"));
        Select state = new Select(states);
        state.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        state.selectByValue("VA");
        Thread.sleep(2000);
        state.selectByIndex(5);
        String actual = state.getFirstSelectedOption().getText();
        String expected = "Californa";
        Assert.assertEquals(actual, expected);
//        if(actual.equals("California")){
//            System.out.println("passed");
//        }else{
//            System.out.println("failed");
//        }
    }
    @Test
    public void TC3() throws InterruptedException{
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
        String actual = year2 +" " + month1 + " " + day1;
        String expected = "1922 December 1";
        Assert.assertEquals(actual, expected);
//        if(year2.equals("1922") && month1.equals("December") && day1.equals("1")){
//            System.out.println("passed");
//        }else{
//            System.out.println("failed");
//        }

    }
    @Test
    public void TC4() throws InterruptedException{
        WebElement all = driver.findElement(By.xpath("//select[@name ='Languages']"));
        Select select = new Select(all);
        List<WebElement> list = select.getOptions();
        for(WebElement each : list){
            each.click();
            Thread.sleep(1000);
            System.out.print(each.getText() + " ");
        }
        select.deselectAll();
    }
    @Test
    public void TC5() {
        WebElement nonSelect = driver.findElement(By.xpath("//a[@href ='#']"));
        nonSelect.click();
        driver.findElement(By.linkText("Facebook")).click();
        String actual = driver.getTitle();
        String expected = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actual, expected);
    }

}
