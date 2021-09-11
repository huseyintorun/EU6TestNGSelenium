package com.cybertek.tests.day1_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class day1Review {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");
        Thread.sleep(4000);  // 4 seconds gonna asleep than continue this method is from Java

        // open new tab

        driver.navigate().to("http://www.ebay.com");

        driver.close();

        WebDriver driver2 =  WebDriverFactory.getDriver("Chrome");
        driver2.get("https://www.google.com");



    }
}
