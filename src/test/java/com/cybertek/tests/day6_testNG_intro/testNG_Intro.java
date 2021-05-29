package com.cybertek.tests.day6_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class testNG_Intro {

    @BeforeClass
    public void setupClass(){
        System.out.println("--> before CLASS is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--> after CLASS is running");
    }

    @BeforeMethod
    public void setUp_method(){
        System.out.println("--> before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> after method is running...");
    }

    @Test
    public void test1(){
        System.out.println("running test 1...");
        String actual = "apple";
        String expected = "apples";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2(){
        System.out.println("running test 2...");

        String actual = "apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));
        // 00Assert.assertFalse(false);
    }


}
