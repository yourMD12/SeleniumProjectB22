package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tc3_findElements_apple {
    public static void main(String[] args) throws InterruptedException {

        //TC #03: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to all of the headers one by one
        // a.Mac, iPad, iPhone, Watch, TV, Music, Support
        //storing 9 web elements including apple logo(idx 0) & searching bar(idx last one)
        List<WebElement> header = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));
        for(int eachLink = 1; eachLink< header.size()-1; eachLink++) {
       //     System.out.println(header.get(eachLink).getText());
            header.get(eachLink).click();
            Thread.sleep(1000);
            header = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));


            // 4.Print out the titles of the each page
            System.out.println("title: " + driver.getTitle());

            // 5.Print out total number of links in each page
            List<WebElement> list = driver.findElements(By.xpath("//body//a"));
            int totalLink = list.size();
            System.out.println("total number of links: " + totalLink);

            // 6.While in each page:
            // a.Print out how many link is missing text TOTAL
            // b.Print out how many link has text TOTAL
            int hasNoText = 0;
            int hasText = 0;
            for(WebElement each : list){
                if(each.getText().isEmpty()){
                    hasNoText++;
                }else if(!each.getText().isEmpty()){
                    hasText++;
                }
            }
            System.out.println("has no text: " + hasNoText);
            System.out.println("has Text = " + hasText);

            header = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));

        }

    }
}
