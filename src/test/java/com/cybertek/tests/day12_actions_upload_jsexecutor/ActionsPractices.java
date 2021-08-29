package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void tc15_actions_hover(){

        // http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //locating all of the images here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //locating all the 'user' texts
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        BrowserUtils.sleep(2000);
        //we must create object of Actions class to be able to use methods coming from there
        Actions actions = new Actions(Driver.getDriver());

        //hover over to 1st image & assert
        actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed(),"user1 is not displayed, fail!");

        //hover over to 2nd & assert
        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());

        //to 3rd & assert
        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());




    }

    @Test
    public void scrolling_test(){
        //http://practice.cybertekschool.com/
        Driver.getDriver().get("http://practice.cybertekschool.com/");

        //scroll down in the very end at Powered by CbTek
        Actions actions = new Actions(Driver.getDriver());

        //locate "Powered by CbTek"
        WebElement cbTek = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        //scroll using actions object
        BrowserUtils.sleep(2000);
        actions.moveToElement(cbTek).perform();

        //scrolling up using Keys.Page_UP button
        BrowserUtils.sleep(1000);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();





    }
}
