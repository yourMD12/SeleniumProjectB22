package com.cybertek.tests.day13;

import com.cybertek.pages.HoverPage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15_hoverTest {

    //TC #15: Hover Test1.Go to http://practice.cybertekschool.com/hovers
    // 2.Hover over to first image
    // 3.Assert: a.“name: user1” is displayed
    // 4.Hover over to second image
    // 5.Assert: a.“name: user2” is displayed
    // 6.Hover over to third image
    // 7.Confirm: a.“name: user3” is displayed

    @Test
    public void hover_Test(){

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        HoverPage hoverPage = new HoverPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(hoverPage.img1).perform();
        Assert.assertTrue(hoverPage.user1.isDisplayed());

        actions.moveToElement(hoverPage.img2).perform();
        Assert.assertTrue(hoverPage.user2.isDisplayed());

        actions.moveToElement(hoverPage.img3).perform();
        Assert.assertTrue(hoverPage.user3.isDisplayed());
    }


}
