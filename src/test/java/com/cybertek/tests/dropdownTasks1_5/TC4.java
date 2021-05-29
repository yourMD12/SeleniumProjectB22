package com.cybertek.tests.dropdownTasks1_5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC4 {
    public static void main(String[] args) throws InterruptedException {

        //TC #4: Selecting value from multiple select dropdown
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Select all the options from multiple select dropdown.
        WebElement all = driver.findElement(By.xpath("//select[@name ='Languages']"));
        Select select = new Select(all);
        List<WebElement> list = select.getOptions();
        for(int i =0; i < list.size(); i++) {
            select.selectByIndex(i);

            // 4.Print out all selected values.
            System.out.println(select.getAllSelectedOptions().get(i).getText());
        }
//        System.out.println(all);

        // 5.Deselect all values.
           select.deselectAll();



//        List<WebElement> list = driver.findElements(By.xpath("//select[@name ='Languages']"));
//        for(WebElement each : list){
//            each.click();
//        }
//        Select selectList = new Select(list);
//        Thread.sleep(1000);
//        selectList.getOptions();
//        String all = selectList.getOptions().toString();




    }
}
