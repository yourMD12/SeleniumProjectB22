package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC2_CT_addRemoveElementsHAVEtoFINISH {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // 2. Go to https://practice.cybertekschool.com/add_remove_elements/
        driver.get("https://practice.cybertekschool.com/add_remove_elements/");


        // 3. Click to “Add Element” button
        driver.findElement(By.xpath("//div[@class='example']")).click();
        Thread.sleep(1000);

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement delete = driver.findElement(By.xpath("//div[@id='elements']"));
        if (delete.isDisplayed()) {
            System.out.println("Verification of DELETE, button is displayed,test passed");
        } else {
            System.out.println("Verification of DELETE, button is not displayed,test failed");
        }

        // 5. Click to “Delete” button.
        delete.click();

        // 6. Verify “Delete” button is NOT displayed after clicking
        if (!delete.isDisplayed()) {
            System.out.println("Verification of DELETE, button is not displayed,test passed");
        } else {
            System.out.println("Verification of DELETE, button is displayed,test failed");
        }

        ////4. Verify button is displayed after clicking.
        // WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        // if (deleteButton.isDisplayed()){
        // System.out.println("Delete button is displayed. Verification passed!");
        // }else{
        // System.out.println("Delete button is NOT displayed. Verification failed!");
        // }
        // 5. Click to button.
        // 6. Verify button is NOT displayed after clicking.
        //       try {
        //       deleteButton.click();
        //       if (!deleteButton.isDisplayed()){
        //       System.out.println("Delete button is NOT displayed after clicking. PASS!");
        //       }else{
        //       System.out.println("Delete button is displayed after clicking. FAILED!");
        //       }
        //       }catch (StaleElementReferenceException exception){
        //       System.out.println("StaleElementException has been thrown.");
        //       System.out.println("It means element has been completely deleted from the HTML.");
        //       System.out.println("Delete button is not displayed. Verification PASSED!");
        //       }

    }
}
