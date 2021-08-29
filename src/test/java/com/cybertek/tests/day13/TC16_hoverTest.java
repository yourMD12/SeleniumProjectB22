package com.cybertek.tests.day13;

import com.cybertek.pages.TelerikPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC16_hoverTest {

    @Test
    public void hoverTest() {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        TelerikPage telerikPage = new TelerikPage();
            Actions actions = new Actions(Driver.getDriver());

            //accept cookies by clicking to this button
            BrowserUtils.sleep(2);
            telerikPage.acceptCookiesButton.click();

//        //Drag and drop the small circle to bigger circle.
        actions.dragAndDrop(telerikPage.smallCircle, telerikPage.bigCircle).perform();

//        //or longer way :
//        actions.moveToElement(telerikPage.smallCircle).clickAndHold(telerikPage.smallCircle)
//                .moveToElement(telerikPage.bigCircle).release().perform();

        // 3rd way:
//        Actions actions = new Actions(Driver.getDriver());
//        WebElement circle = Driver.getDriver().findElement(By.id("draggable"));
//        WebElement bigOne = Driver.getDriver().findElement(By.id("droptarget"));
//        actions.dragAndDrop(circle,bigOne).perform();
//
//        // Assert: -Text in big circle changed to: “You did great!”
        String expected = "You did great!";
        String actual = telerikPage.bigCircle.getText();
        Assert.assertEquals(actual,expected);



    }
}
