package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TableUtils {
    //PRACTICE #4: Method: verify Order
    // •Create a method named verifyOrder in TableUtils class.
    // •Method takes WebDriver object and String(name).
    // •Method should verify if given name exists in orders.
    // •This method should simply accepts a name(String), and assert whether given name is in the list or not.
    // •Create a new TestNG test to test if the method is working as expected.

        public static void verifyOrder(WebDriver driver, String name){

            //locate all the names from table and store them in a list of WbElements
            List<WebElement>  allNames= driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));

            for(WebElement each : allNames){
                if(each.getText().equals(name)){
                    Assert.assertTrue(true);
                    return;
                }
            }
//            Assert.fail();
            Assert.assertTrue(false,"name doesn't exist in the list");
        }
}
