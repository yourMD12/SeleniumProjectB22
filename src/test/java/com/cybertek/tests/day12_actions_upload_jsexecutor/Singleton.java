package com.cybertek.tests.day12_actions_upload_jsexecutor;

public class Singleton {
    //we will create similar logic we created in Driver utility class
    // but it will be for a string

    //create private constructor
    private Singleton(){    }

    //by making the String word private,we will ensure we create access only through our getter method
    private static String word;

    //we allow user to access to 'word' in the way we want them to have
    public static String getWord(){
        if(word == null){
            System.out.println("FIRST TIME CALL. WORD OBJECT IS NULL." + "Assigning value to it now");
            word = "something";
        }else{
            System.out.println("word already has a value");
        }
        return word;
    }



}
