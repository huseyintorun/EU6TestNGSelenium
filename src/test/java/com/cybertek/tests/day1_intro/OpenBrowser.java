package com.cybertek.tests.day1_intro;

import com.cybertek.tests.day2_webdriver_basics.ChromeMethod;
import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {

        //WebDriverManager.firefoxdriver().setup();
        //WebDriver driver = new FirefoxDriver();
        //driver.get("https://amazon.com");

       // ChromeMethod.getChromeBrowser("amazon");
        WebDriverFactory.getDriver("firefox");
        WebDriverFactory.getDriver("chrome");
    }
}
