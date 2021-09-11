package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        // Task : Open chrome and navigate http://practice.cybertekschool.com

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver() ;

        driver.get("http://practice.cybertekschool.com");

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


        String title = driver.getTitle();

        System.out.println("title = " + title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        WebDriver sürücü = WebDriverFactory.getDriver("fireFox");
        sürücü.navigate().to("http://www.google.de");
        sürücü.get("https://www.vezirköprü.com");
    }
}
