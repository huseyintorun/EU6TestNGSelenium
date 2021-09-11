package com.cybertek.reviews.day1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class TC01_YahooPractice {
    public static void main(String[] args) {

       WebDriver driver =  WebDriverFactory.getDriver("chrome") ;
        driver.get("https://www.yahoo.com");
        // expected string
        String expectedTitle = "Yahoo" ;
        // actual title
        String actualTitle = driver.getTitle();
        // verification
        if(actualTitle.contains(expectedTitle)){
            System.out.println("passed");
        }else {
            System.out.println("not passed");
        }

    }
}
