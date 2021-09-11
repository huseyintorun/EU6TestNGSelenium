package com.cybertek.tests.day4_BasicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome") ;
        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();

        driver.findElement(By.tagName("input")).sendKeys("Hello!");


        Thread.sleep(1000);
        driver.quit();
    }
}
