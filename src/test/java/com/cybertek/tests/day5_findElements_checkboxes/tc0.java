package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tc0 {
    public static void main(String[] args) {

        //1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //if a web element isn't found,this will wait UP TO given secs
        //if web element is located before 15sec, it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        
        //we need to create a locator that returns us all the links on the page
        //body//a---> will do that
        
        //we are storing all of the links that we returned by findElements method
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        
        // 3.Print out the texts of all links
        for (WebElement each: listOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }
        
        // 4.Print out how many total link
        int numOfLinks = listOfLinks.size();
        System.out.println("numOfLinks = " + numOfLinks);
        
    }
}
