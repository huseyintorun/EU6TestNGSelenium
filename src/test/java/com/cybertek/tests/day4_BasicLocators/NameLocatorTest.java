package com.cybertek.tests.day4_BasicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome") ;
        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();

        driver.findElement(By.name("full_name")).sendKeys("Hüseyin Torun");

        driver.findElement(By.name("email")).sendKeys("torunhsyn1989@icloud.com");

        driver.findElement(By.name("wooden_spoon")).click();


        Thread.sleep(2000);
        driver.quit();
    }
}
