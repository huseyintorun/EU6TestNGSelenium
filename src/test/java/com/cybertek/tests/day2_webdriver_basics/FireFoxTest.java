package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver2 = new FirefoxDriver() ;
        driver2.get("https://www.erfurt.de");

    }

}
