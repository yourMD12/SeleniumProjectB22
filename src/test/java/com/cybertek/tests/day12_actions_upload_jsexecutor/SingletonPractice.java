package com.cybertek.tests.day12_actions_upload_jsexecutor;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test (priority = 1)
    public void singleton_understanding_test1(){
        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1); // FIRST TIME CALL. WORD OBJECT IS NULL." + "Assigning value to it now

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2); // word already has a value

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3); // word already has a value
    }

    @Test (priority = 2)
    public void singleton_test2(){
        String str4 = Singleton.getWord();
        System.out.println("str4 = " + str4); // word already has a value
    }
}
