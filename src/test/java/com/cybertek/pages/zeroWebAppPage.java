package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zeroWebAppPage {

    public zeroWebAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "#user_password")
    public WebElement passwordZeroWebAppPage;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginZeroWebAppPage;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButtonZeroWebAppPage;

    @FindBy(id = "details-button")
    public WebElement advanceButtonZeroWebAppPage;

    @FindBy(css = "a[id='proceed-link']")
    public WebElement proceedButtonZeroWebAppPage;

    @FindBy(css = "li[id='account_activity_tab']")
    public WebElement accountActivityZeroWebAppPage;

    @FindBy(css = "select[name='accountId']")
    public WebElement accountDropDownActivityZeroWebAppPage;

    @FindBy(xpath = "//option[@value='6']")
    public WebElement selectBrokerageZeroWebAppPage;

    @FindBy(xpath = "//div[@class='well']")
    public WebElement noResultZeroWebAppPage;

    //     //div[@id='all_transactions_for_account']

    @FindBy(xpath = "//i[@class='icon-user']")
    public WebElement usernameDropDownZeroWebAppPage;

    @FindBy(css = "a#logout_link")
    public WebElement logOutButtonZeroWebAppPage;

    @FindBy(css = "a[href='/bank/redirect.html?url=online-statements.html']")
    public WebElement onlineStatementsCssZeroWebAppPage;


    //      div[id='blabla'] css a#blabla <- id    a.blabla <- class


}
