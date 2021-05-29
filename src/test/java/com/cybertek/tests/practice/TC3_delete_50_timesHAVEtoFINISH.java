package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3_delete_50_timesHAVEtoFINISH {
    public static void main(String[] args) {

        //TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3. Click to “Add Element” button 50 times
        WebElement addElement = driver.findElement(By.xpath("//div[@class ='example']"));
        for(int i=0; i<50; i++){
            addElement.click();
        }

        // 4. Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> listOfDelete = driver.findElements(By.xpath("//div[@id='elements']"));
        WebElement deleteButton = driver.findElement(By.xpath("//div[@id='elements']"));
        System.out.println("number of delete buttons on the page:  " + listOfDelete.size());

        // 5. Click to ALL “Delete” buttons to delete them.
        for(WebElement button : listOfDelete){
            button.click();
        }

        // 6. Verify “Delete” button is NOT displayed after clicking.

        //try {
        // if (!deleteButton.isDisplayed()){
        // System.out.println("Delete button is NOT displayedafter clicking. PASS!");
        // }else{
        // System.out.println("Delete button is displayed after clicking. FAILED!");
        // }
        // }catch (StaleElementReferenceException exception){
        // System.out.println("StaleElementException has been thrown.");
        // System.out.println("It means element has been completely deleted from the HTML.");
        // System.out.println("Delete button is not displayed. Verification PASSED!");}

        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        // Hint: Need to use findElements method.

    }
}
