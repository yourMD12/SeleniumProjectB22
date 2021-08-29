package com.cybertek.tests.practice;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.SmartBearUtility;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC1_smartBearLinkVerification {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1.Open browser
        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3.Enter username: “Tester”
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        // 4.Enter password: “test”
        // 5.Click to Login button
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test" + Keys.ENTER);
    }

    @Test
    public void TC1_Smartbear_software_link_verification(){
        // 6.Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks = " + allLinks.size());

        // 7.Print out each link text on this page
        for(WebElement each : allLinks){
            System.out.println(each.getText());
        }
    }

    @Test
    public void loginToSmartBear(){
        //Create a method called loginToSmartBear
        // •This method simply logs in to SmartBear when you call it.
        // •Accepts WebDriver type as parameter

        //  for that just create:
        //public WebDriver callDriver(){ return getDriver.get(); }
        // and on next class write "callDriver();"
    }

    @Test
    public void TC2_Smartbear_software_order_placing() throws InterruptedException{
        //6.Click on Order
        driver.findElement(By.xpath("//a[.='Order']")).click();
        // 7.Select familyAlbum from product, set quantity to 2
        Select select = new Select(driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct")));
        select.selectByVisibleText("FamilyAlbum");
        Thread.sleep(1000);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("2");
        // 8.Click to “Calculate” button
        driver.findElement(By.className("btn_dark")).click();
        // 9.Fill address Info with JavaFaker    •Generate: name, street, city, state, zip code
        Faker faker = new Faker();
        String name = faker.name().fullName();
        driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys(name);
        String street = faker.address().streetAddress();
        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$fmwOrder$TextBox2']")).sendKeys(street);
        String city = faker.address().cityName();
        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$fmwOrder$TextBox3']")).sendKeys(city);
        String state = faker.address().state();
        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$fmwOrder$TextBox4']")).sendKeys(state);
        String zip = faker.address().zipCode();
        zip = zip.substring(0,4);
        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$fmwOrder$TextBox5']")).sendKeys(zip);
        // 10.Click on “visa” radio button
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$cardList")).click();
        // 11.Generate card number using JavaFaker
        String card = faker.finance().creditCard();
        card = card.replace("-","");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(card);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("11/12");
        // 12.Click on “Process”
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        // 13.Verify success message “New order has been successfully added.”
        String expested = "New order has been successfully added.";
        String actual = driver.findElement(By.tagName("strong")).getText();
        Assert.assertEquals(actual,expested);

    }

    @Test
    public void TC3_Smartbear_software_order_verification(){
        //Click on View all orders
        driver.findElement(By.cssSelector("a[href='Default.aspx']")).click();
        //Verify Susan McLaren has order on date “01/05/2010”
        String orderText = driver.findElement(By.xpath("//table [@id='ctl00_MainContent_orderGrid']/tbody/tr[6]")).getText();
        String name = "Susan McLaren";
        String date = "01/05/2010";
        Assert.assertTrue(orderText.contains(name));
        Assert.assertTrue(orderText.contains(date));
    }

    @Test
    public void TC4_Method_verifyOrder(){
        //Create a method named verifyOrder in SmartBearUtils class.
        SmartBearUtility.verifyOrder(driver, "Susan McLaren");

    }

    @Test
    public void TC5_printNamesAndCities(){
        //Create a method named printNamesAndCities in SmartBearUtils class.
         SmartBearUtility.printNamesAndCities(driver);
    }



}
