package com.cybertek.utilities;

import org.testng.annotations.Test;

public class DriverUsingExample {

    @Test
    public void how_to_use_the_driver(){
        //Driver.getDriver() -> driver
        Driver.getDriver().get("http://practice.cybertekschool.com/login.html");
    }


}
