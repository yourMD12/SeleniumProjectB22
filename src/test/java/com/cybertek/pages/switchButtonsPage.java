package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class switchButtonsPage {
    public switchButtonsPage(){
        PageFactory.initElements(Driver.getDriver(), this);

        //@FindBy(xpath = "//div[@class='slider round']")
      //  @FindBy(css = ".switch")
         WebElement buttons;



    }
}
