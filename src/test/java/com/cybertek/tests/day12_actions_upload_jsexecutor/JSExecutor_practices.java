package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutor_practices {

    @Test
    public void scroll_using_jsExecutor_test1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //down casting our driver type to JSExecutor so we can reach methods in this interface
        BrowserUtils.sleep(2);
       JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //((JavascriptExecutor) Driver.getDriver()).executeScript("");
        //using js we reach executeScript method so we are allowed to pass JS functions & apply that into our Java+Selenium code

        //in each iteration it will scroll down 750 pixels
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750");
        }
        //this would go 750 pixels up
        js.executeScript("window.scrollBy(0, -750");





    }

    @Test
    public void scroll_using_test2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //locating the web elements so we can use in js.executeScript method
        WebElement cbTek = Driver.getDriver().findElement(By.linkText("Cybertek school"));
        WebElement home = Driver.getDriver().findElement(By.linkText("Home"));

        //use js.execute with different scrolling JS function
        //scroll down to cbtek link
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", cbTek);

        //scroll up to home ink
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", home);

    }
}
