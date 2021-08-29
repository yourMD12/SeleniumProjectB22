package com.cybertek.tests.practice.switchAllButtons;

import org.openqa.selenium.WebElement;

class Clicker implements Runnable {
    private final WebElement element;

    public Clicker(WebElement element) {
        this.element = element;
    }

    @Override
    public void run() {
        element.click();
    }


}
