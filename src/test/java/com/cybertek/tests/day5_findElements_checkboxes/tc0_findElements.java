package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tc0_findElements {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        // 3.Print out the texts of all links
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int hasText = 0;
        int hasNoText = 0;

        for(WebElement each : links){
//            System.out.println(each.getText());
//            System.out.println(each.getAttribute("href"));

            // 4.Print out how many link is missing text
            // 5.Print out how many link has text
            if(each.getText().isEmpty()){
                System.out.println((hasNoText++)+ " " + each);
            }else if(!each.getText().isEmpty()){
                System.out.println((hasText++)+ " " + each);
            }
        }
        // 6.Print out how many total link
        int numOfLinks = links.size();
        System.out.println("numOfLinks = " + numOfLinks);
        System.out.println("has text: " + hasText);
        System.out.println("has no text: " + hasNoText);

    }
}
