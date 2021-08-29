package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
we will create a re-usable method that will be reading from configuration.reader file
 */


public class ConfigurationReader {

    // 1 create properties object
    private static Properties properties = new Properties();


    static {

        try {
            // #2 load the file intoFileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3 load properties object with the fie(configuration.properties)
            properties.load(file);

        } catch (IOException e) {
            System.out.println("file not found in Configuration properties");
        }

    }
    //use the above created logic to create a re-usable static method
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }


}
