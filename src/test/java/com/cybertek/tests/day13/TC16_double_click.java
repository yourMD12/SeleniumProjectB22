package com.cybertek.tests.day13;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC16_double_click {

    @Test
    public void double_click_test() {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");
//        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@id='iframeResult']"));
//        Driver.getDriver().switchTo().frame(iframe);
        // Double click on the text “Double-click me to change my text color.”
        Actions actions = new Actions(Driver.getDriver());
        WebElement click = Driver.getDriver().findElement(By.id("demo"));
        actions.doubleClick(click).perform();

        // Assert: Text’s “style” attribute value contains “red”
        String expected = "red";
        String actual = click.getAttribute("style");
        Assert.assertTrue(actual.contains(expected));

    }
}