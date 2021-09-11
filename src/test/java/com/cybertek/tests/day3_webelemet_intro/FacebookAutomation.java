package com.cybertek.tests.day3_webelemet_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookAutomation {

    public static void main(String[] args) throws InterruptedException {

        //https://de-de.facebook.com/

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://de-de.facebook.com/");

        // enter your email "email"
        WebElement enterEMail = driver.findElement(By.name("email"));
        Thread.sleep(2000);
        enterEMail.sendKeys("torunhsyn1989@icloud.com");
        Thread.sleep(4000);

        // enteryour Password
        WebElement enterPassword = driver.findElement(By.name("pass"));
        Thread.sleep(2000);
        enterPassword.sendKeys("Samsun_055");
        Thread.sleep(4000);

        //Press Anmelden key
        WebElement pressAnmelden = driver.findElement(By.name("login"));
        Thread.sleep(2000);
        pressAnmelden.click();
        Thread.sleep(4000);

        driver.quit();
    }
}
