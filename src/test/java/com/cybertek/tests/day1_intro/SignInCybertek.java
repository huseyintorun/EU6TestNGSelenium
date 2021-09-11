package com.cybertek.tests.day1_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInCybertek {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://cybertekschool.okta.com/login/login.htm?fromURI=%2Fapp%2FUserHome");

        driver.findElement(By.cssSelector("#okta-signin-username")).sendKeys("torunhsyn1989@icloud.com");
        driver.findElement(By.cssSelector("#okta-signin-password")).sendKeys("Samsun_055");
        driver.findElement(By.cssSelector(".o-form-button-bar")).click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".button.button-primary")).click();



    }
}
