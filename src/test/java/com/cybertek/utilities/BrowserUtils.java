package com.cybertek.utilities;

public class BrowserUtils {

    /*
    method that will accept int
    wait for given 2nd duration
    in our code u should text BrowserUtil.sleep(1) <-num of sec
     */

    public static void sleep(int second) {   //throws InterruptedException
        second *= 1000;
        // 1sec = 1000 milli sec
            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {
                System.out.println("something happened in the sleep method");
            }

        }


}
