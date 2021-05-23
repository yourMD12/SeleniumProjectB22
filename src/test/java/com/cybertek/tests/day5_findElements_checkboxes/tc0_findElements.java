package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tc0_findElements {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        // 3.Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        for(WebElement each : listOfLinks){
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }
        
        // 4.Print out how many link is missing text
        int count = 0;
        for(WebElement missed : listOfLinks){
            if(missed.getText().equals("")){
                count++;
            }
            System.out.println("missing text links: " + count);
        }

        // 5.Print out how many link has text

        // 6.Print out how many total link
        int numOfLinks = listOfLinks.size();
        System.out.println("numOfLinks = " + numOfLinks);

    }
}
