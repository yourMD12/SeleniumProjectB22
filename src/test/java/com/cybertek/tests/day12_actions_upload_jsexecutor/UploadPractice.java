package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void uploadTest(){
        //http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        // find some small file from ur computer & get the path of it
        String path = "C:\\Users\\Daria\\OneDrive\\Desktop\\SAMPLE_CHALLANGES_AND_BEHAVIORAL_QUESTIONS_2.docx";

        //upload the file
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        //sending the file path to the chooseFile WebElement
        chooseFile.sendKeys(path);

        uploadButton.click();

        //assert
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("File Uploaded!"));
        Assert.assertTrue(fileUploadedMessage.isDisplayed());





    }

}
