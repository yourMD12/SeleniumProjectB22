package com.cybertek.tests.day8_windows_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class javaFakerPractice {

    @Test
    public void test1(){
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);

        String boJack = faker.harryPotter().quote();
        System.out.println("boJack = " + boJack);

        String cat = faker.cat().name();
        System.out.println("cat = " + cat);
    }
}
