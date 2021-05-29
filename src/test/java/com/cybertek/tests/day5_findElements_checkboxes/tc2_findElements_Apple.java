package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tc2_findElements_Apple {
    public static void main(String[] args) {

        //TC #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to iPhone
        // 4.Print out the texts of all links
        // 5.Print out how many link is missing text
        // 6.Print out how many link has text
        // 7.Print out how many total link

        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int numLinks = links.size();
        System.out.println(numLinks);

        int hasText = 0;
        int hasNoText = 0;
        for(WebElement each : links){
            if(each.getText().isEmpty()){
                System.out.println(hasNoText++);
            }else if(!each.getText().isEmpty()){
                System.out.println((hasText++)+ each.getText());
            }
        }
        System.out.println("nums of links: " + numLinks);
        System.out.println("has text links: " + hasText);
        System.out.println("has no text: " +  hasNoText);
    }
}
