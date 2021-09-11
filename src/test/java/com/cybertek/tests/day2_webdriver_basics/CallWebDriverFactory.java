package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {
       WebDriver driver =  WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }

}
