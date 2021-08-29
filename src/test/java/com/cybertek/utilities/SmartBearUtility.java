package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtility {
     public static void verifyOrder(WebDriver driver, String name){
//
//        // •Method takes WebDriver object and String(name).
//        // •Method should verify if given name exists in orders.
//        // •This method should simply accepts a name(String), and assert whether given name is in the list or not.
//        // •Create a new TestNG test to test if the method is working as expected
//
        BrowserUtils.sleep(2);
        List<WebElement> names = driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[2]"));

        BrowserUtils.sleep(2);
        for(WebElement each : names){
            if(each.getText().equalsIgnoreCase(name)){
                Assert.assertTrue(each.getText().equalsIgnoreCase(name));
                return ;
            }
        }
    }
    public static void printNamesAndCities(WebDriver driver){

        // •Method takes WebDriver object.
        // •This method should simply print all the names in the List of All Orders.
        // •Create a new TestNG test to test if the method is working as expected.
        // •Output should be like:
        // •Name1: name , City1: city
        // •Name2: name , City2: city

        List<WebElement> names = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[2]"));
        List<WebElement> cities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[7]"));

        int count =0;
        for(int i =1; i< names.size();i++){
            count++;
            System.out.println("name " + count + ": " + names.get(i).getText() +
                    ", city " + count + ": " + cities.get(i).getText());
        }
            }
            public static void printNamesAndEmails(WebDriver driver){
                // •Method takes WebDriver object.
                // •This method should simply print all the names and emails in the table
                // •Create a new TestNG test to test if the method is working as expected.
                List<WebElement> name = driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));
                List<WebElement> emails = driver.findElements(By.xpath("//table[@id='table1']//tr/td[3]"));

                int count2 =0;
                for(int i= 1; i<name.size();i++){
                    count2++;
                    System.out.println("name" +count2 +": " + name.get(i).getText() +
                            ", email" +count2 + ": " + emails.get(i).getText() );
                }
            }
}
