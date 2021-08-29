package com.cybertek.tests.practice.switchAllButtons;

import com.cybertek.pages.switchButtonsPage;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class switchAll {

    @Test
    public void SwitchAll(){
        Driver.getDriver().get("http://te.dev.secureci.com/Exercise2.html");

        switchButtonsPage buttonsPage = new switchButtonsPage();

     //   buttonsPage.buttons.click();

        //List<WebElement> buttons = Driver.getDriver().findElements(By.cssSelector(".slider"));
        //for(WebElement each : buttons);
        //new Clicker(webElement).run();

    }
}
