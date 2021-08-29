package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage {
    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(id = "search")
        public WebElement searchField;

        @FindBy(id = "search-icon-legacy")
        public WebElement searchButton;

        @FindBy(linkText = "lofi hip hop radio - beats to relax/study to")
        public WebElement chosen;

        @FindBy(xpath = "//span[@class='ytp-ad-skip-button-icon']")
        public WebElement skipButton;


    }

