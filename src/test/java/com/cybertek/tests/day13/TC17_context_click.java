package com.cybertek.tests.day13;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC17_context_click {

    @Test
    public void contextClick(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        //Right click to the box.
        Actions actions = new Actions(Driver.getDriver());
        WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));
        actions.contextClick(box).perform();

        // Alert will open.
        // Accept alert
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        // No assertion needed for this practice.
    }
}
