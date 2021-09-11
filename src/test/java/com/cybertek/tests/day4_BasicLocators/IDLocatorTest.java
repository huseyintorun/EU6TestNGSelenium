package com.cybertek.tests.day4_BasicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {

    public static void main(String[] args) throws InterruptedException {

       // http://practice.cybertekschool.com/multiple_buttons


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //  click on disappearing_button... disappearing_button

        WebElement clickOnButton = driver.findElement(By.id("disappearing_button"));
        Thread.sleep(2000);
        clickOnButton.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
