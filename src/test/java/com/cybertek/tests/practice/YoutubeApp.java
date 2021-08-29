package com.cybertek.tests.practice;

import com.cybertek.pages.YoutubePage;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class YoutubeApp {

    @Test
    public void Youtube(){
        Driver.getDriver().get("https://www.youtube.com/");

        YoutubePage youtubePage = new YoutubePage();

        youtubePage.searchField.sendKeys("lofi music");
        youtubePage.searchButton.click();

        youtubePage.chosen.click();

        youtubePage.skipButton.click();
        if(youtubePage.skipButton.isDisplayed()){
            youtubePage.skipButton.click();
        }
    }

}
