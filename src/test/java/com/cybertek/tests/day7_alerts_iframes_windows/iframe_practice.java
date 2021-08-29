package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframe_practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void iframeTest(){

        // #1 - changing to iframe by idx: we pass idx number
       // driver.switchTo().frame(0);  idx starts with 0
        // #2 - locate as a web Element to switch: we find & locate <iframe>
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        driver.switchTo().frame(iframe);
        // #3 - if <iframe> tag has no id/name attr, we can pas its attr value as a string into
        // .switchTo().frame() method directly
        driver.switchTo().frame("mce_0_ifr");

        //locating web element text
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

       // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //locating header as webEl
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        // Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue(headerText.isDisplayed());

    }



}
