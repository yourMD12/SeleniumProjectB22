package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //1 create constructor & initialize driver & object of the class
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement signInButton;

    //appears when user enters invalid email type
    @FindBy(id = "inputEmail-error")
    public WebElement invalidEmailError;

    //appears when user enters invalid login or password
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement incorrectEmailOrPasswordError;



}
