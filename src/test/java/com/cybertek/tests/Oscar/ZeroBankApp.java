package com.cybertek.tests.Oscar;

import com.cybertek.pages.zeroWebAppPage;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZeroBankApp {
    /*
    1. The user navigates to the login page: http://zero.webappsecurity.com/login.html
    2. The user logs in with the user "username" and the password "password"
    3. The user navigates to Account Activity page
    4. Then The page should have the title "Zero - Account Activity"
    5. Then Account drop down should have the following options :
    (Savings, Checking, Savings, Loan, Credit Card, Brokerage)
    6. Brokerage option should have "No results."
     */

    @Test
      public void ZeroBank(){

        Driver.getDriver().get("http://zero.webappsecurity.com/login.html");

        zeroWebAppPage zeroPage = new zeroWebAppPage();

        zeroPage.loginZeroWebAppPage.sendKeys("username");
        zeroPage.passwordZeroWebAppPage.sendKeys("password");
        zeroPage.signInButtonZeroWebAppPage.click();

        zeroPage.advanceButtonZeroWebAppPage.click();
        zeroPage.proceedButtonZeroWebAppPage.click();

        zeroPage.accountActivityZeroWebAppPage.click();

        // assertion
        Assert.assertTrue(zeroPage.accountActivityZeroWebAppPage.isDisplayed(), "Zero - Account Activity");

        zeroPage.accountDropDownActivityZeroWebAppPage.click();
        zeroPage.selectBrokerageZeroWebAppPage.click();
        zeroPage.selectBrokerageZeroWebAppPage.submit();


        //String actual = zeroPage.noResultZeroWebAppPage.getText();
        //String expected = "No results.";
        //Assert.assertEquals(actual,expected);

        Assert.assertTrue(zeroPage.noResultZeroWebAppPage.isDisplayed(), "No results.");
        zeroPage.onlineStatementsCssZeroWebAppPage.click();

        zeroPage.usernameDropDownZeroWebAppPage.click();
        zeroPage.logOutButtonZeroWebAppPage.click();

    }




}
