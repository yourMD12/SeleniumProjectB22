package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        //driver.close();
    }
    @Test
    public void scenario5() throws InterruptedException {

        //When I navigate to Fleet drop down menu
        //And I click on Vehicles’ tab
        WebElement fleet = driver.findElement(By.xpath("//i[@class='fa-asterisk menu-icon']")); //(By.linkText("Fleet")); //li[@class='dropdown dropdown-level-1'] //a[@class='unclickable']
        fleet.click();
//        Select fleet = new Select(fl);   //
//        fleet.getFirstSelectedOption();
        WebElement text = driver.findElement(By.xpath("//span[@class ='title title-level-2']"));
        Thread.sleep(3000);
        text.click();
//        Select vehicles = new Select(text);
//        vehicles.selectByVisibleText("Vehicles");
//        driver.findElement(By.xpath("//div[@class ='column-manager dropdown']")).click();

        //Then I should see general vehicle’s information and Filters, Refresh, Reset and Grid Settings buttons
        //And I click on Grid Settings button (1)
        WebElement setButton = driver.findElement(By.xpath("//a[@title='Grid Settings']"));
        Thread.sleep(3000);
        setButton.click();
//        WebElement setting = driver.findElement(By.xpath("//input[@data-role ='renderable']"));
//        Select setButton = new Select(setting);
//        Thread.sleep(1000);
//        setButton.getOptions();

        //And I uncheck all checked boxes (2)
        List<WebElement> uncheck = driver.findElements(By.xpath("//input[@data-role='renderable']"));
        for(WebElement each : uncheck){
            Thread.sleep(3000);
            each.click();
        }

        //And I check all unchecked boxes (3)
        List<WebElement> check = driver.findElements(By.xpath("//input[@data-role='renderable']"));
        for(WebElement each2 : check){
            Thread.sleep(3000);
            each2.click();
        }

        //And I click on Reset button (4)
        WebElement resetButton = driver.findElement(By.xpath("//a[@title='Reset']"));
        Thread.sleep(3000);
        resetButton.click();

        //And I click on Grid Settings Button
        Thread.sleep(3000);
        setButton.click();
//
//        //Then I should see all originally checked checkboxes checked (all but ID checkbox) (5)
            WebElement one = driver.findElement(By.xpath("//input[@id='column-c106']"));
            if(!one.isSelected()){
                System.out.println("verification is passed");
            }else{
                System.out.println("verification is failed");
            }


    }



}
