package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        // this line opens a browser
        WebDriver driver = new ChromeDriver();

        //this line will basically max the browser size
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();         ITS FOR MAC

        //3- get the page for Tesla.com
        driver.get("https://www.tesla.com");
        System.out.println("Current title: " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl); // currentUrl = https://www.tesla.com/

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);
        //Going back using navigations
        driver.navigate().back();

        Thread.sleep(3000);
        //Going forward using navigations
        driver.navigate().forward();

        Thread.sleep(3000);
        //refreshing the page using navigations
        driver.navigate().refresh();

        Thread.sleep(3000);
        //going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " + driver.getTitle()); //Current title: Electric Cars, Solar & Clean Energy | Tesla
                                                                   //Current title: Google
        System.out.println("currentUrl = " + currentUrl); // currentUrl = https://www.tesla.com/  because the same name,if u rename it,it will show google
        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl); //currentUrl = https://www.google.com/

        // this method will close the currently opened browser
        // it will only close 1 browser or 1 tab
        driver.close();

        //driver.quit();
        







    }

}
