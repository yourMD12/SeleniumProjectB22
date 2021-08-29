package com.cybertek.tests.day9_properties_browser_utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LearningProperties {
WebDriver driver;



    @Test
    public void java_properties_reading_test(){
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));

    }

}
