package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DsiplayedDemo {

    @Test
    public void test1 () throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement userNameInput = driver.findElement(By.id("username"));
        // this code inside the HTML but not visible
        System.out.println("userNameInput.isDisplayed() = " + userNameInput.isDisplayed());

        Assert.assertFalse(userNameInput.isDisplayed(),"verify inputbox is not displayed");
        driver.findElement(By.cssSelector("#start>button")).click();
        Thread.sleep(6000);
        Assert.assertTrue(userNameInput.isDisplayed(),"verify inputbox is displayed");




        driver.quit();

    }
}
