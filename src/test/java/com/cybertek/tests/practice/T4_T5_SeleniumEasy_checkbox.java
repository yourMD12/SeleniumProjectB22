package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_T5_SeleniumEasy_checkbox {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: SeleniumEasy CheckboxVerification–Section 1
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        // 3.Verify “Success –Check box is checked” message is NOT displayed.
        WebElement text = driver.findElement(By.xpath("//div[@id='txtAge']"));
        if(!text.isDisplayed()){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        // 4.Click to checkbox under “Single Checkbox Demo” section
        Thread.sleep(5);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        // 5.Verify “Success –Check box is checked” message is displayed.
       if(text.getText().equals("Success - Check box is checked")){
           System.out.println("passed");
       }else{
           System.out.println("failed");
       }

//=========================================================================================
        //TC #3: SeleniumEasy Checkbox Verification –Section 2
        // 1.Open Chrome browser
        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        // 3.Verify “Check All” button text is “Check All”
        WebElement checkAll = driver.findElement(By.xpath("//input[@type ='button']"));
       //String actual = checkAll.getAttribute("")
       if(checkAll.getAttribute("value").equals("Check All")){
           System.out.println("verify part 2.1 passed");
       }else{
           System.out.println("verify part 2.1 failed");
       }

        // 4.Click to “Check All” button
        checkAll.click();

        // 5.Verify all check boxes are checked
        List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@class ='cb1-element']"));
        for(WebElement each : checkboxList){
            if(each.isSelected()){
                System.out.println("verify part 2.2. passed");
            }else{
                System.out.println("verify part 2.2. failed");
            }
        }

        // 6.Verify button text changed to “Uncheck All”
        WebElement uncheckAll = driver.findElement(By.xpath("//input[@type ='button']"));
        if(uncheckAll.getAttribute("value").equals("Uncheck All")){
            System.out.println("verify part 2.3. passed");
        }else{
            System.out.println("verify part 2.3. failed");
        }
    }
}
