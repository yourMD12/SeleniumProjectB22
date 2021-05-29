package com.cybertek.tests.dropdownTasks1_5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC1 {
    public static void main(String[] args) {

        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Verify “Simple dropdown” default selected value is correct Expected: “Please select an option”
        WebElement simple = driver.findElement(By.xpath("//option[@disabled ='disabled']"));
//        String actual = simple.getText();
//        String expected = "Please select an option";     //select[@id ='dropdown']
        if(simple.isSelected() && simple.getText().equals("Please select an option")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        // 4.Verify “State selection” default selected value is correct Expected: “Select a State”
        // state.getText().equals("Select a State")   state.isSelected() &&
       WebElement state = driver.findElement(By.xpath("//select[@id ='state']"));
        Select dropdown = new Select(state);
       // Select dropdown = new Select(driver.findElement(By.id("state")));
        String actual = dropdown.getFirstSelectedOption().getText();
        if(actual.equals("Select a State")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }


    }
}
