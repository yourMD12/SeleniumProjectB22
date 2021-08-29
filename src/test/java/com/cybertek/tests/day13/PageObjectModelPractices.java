package com.cybertek.tests.day13;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {

    @Test
    public void negative_login_to_library_test(){

        // go to library
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

        // -create object of the class
        // -when we create the object of LibraryLoginPage", constructor will automatically
        //  initialize driver & object of LibraryLoginPage
        // -meaning we wil be able to use the selenium method through the object of the class
        LibraryLoginPage loginPage = new LibraryLoginPage();

        // enter incorrect login/password
        loginPage.inputEmail.sendKeys("blabla@gmail.com");
        loginPage.inputPassword.sendKeys("kvakva237kva");

        //click to sign in button
        loginPage.signInButton.click();

        // verify error message
        Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.isDisplayed());

    }

}
