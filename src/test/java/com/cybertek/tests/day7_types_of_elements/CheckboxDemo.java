package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxDemo {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.cssSelector("#box1"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("#box2"));

        Assert.assertFalse(checkbox1.isSelected(),"verify cb1 is not selected");
        Assert.assertTrue(checkbox2.isSelected(),"verify cb2 is selected");

        checkbox1.click();

        Assert.assertTrue(checkbox1.isSelected(),"verify cb1 is  selected");
        Assert.assertTrue(checkbox2.isSelected(),"verify cb2 is selected");
        Thread.sleep(2000);

        driver.quit();


    }
}
