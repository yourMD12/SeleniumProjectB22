package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class tc2_findElements_Apple {
    public static void main(String[] args) {

        //TC #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to iPhone
        // 4.Print out the texts of all links
        // 5.Print out how many link is missing text
        // 6.Print out how many link has text
        // 7.Print out how many total link
    }
}
