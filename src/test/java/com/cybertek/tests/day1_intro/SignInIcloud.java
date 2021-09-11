package com.cybertek.tests.day1_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInIcloud {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.icloud.com/");

        driver.findElement(By.cssSelector("#account_name_text_field")).sendKeys("torunhsyn1989@icloud.com");
        driver.findElement(By.xpath("//input[@id='password_text_field']")).sendKeys("Demet_013");
        driver.findElement(By.cssSelector(".o-form-button-bar")).click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".button.button-primary")).click();



    }
}
