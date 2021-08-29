package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void window_test(){

        //4. Assert: Title is “Practice”
        String actualTitleBeforeClick = driver.getTitle();
        String expected = "Practice";
        System.out.println("actualTitleBeforeClick = " + actualTitleBeforeClick);

        //5. Click to: “Click Here” text
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        for(String eachWindow : driver.getWindowHandles() ){
            driver.switchTo().window(eachWindow);
            System.out.println("current title while switching: " + driver.getTitle());
        }

        String afterClick = driver.getTitle();
        System.out.println("afterClick = " + afterClick);

        //6. Switch to new Window

        //7. Assert: Title is “New Window”

    }

}
