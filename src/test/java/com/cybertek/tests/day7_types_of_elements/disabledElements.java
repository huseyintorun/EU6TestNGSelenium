package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class disabledElements {
   @Test
   public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

       WebElement greenRadioButton = driver.findElement(By.id("green"));
       // how to check an element enabled or not
       System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());
       Assert.assertFalse(greenRadioButton.isEnabled(),"verify green radio button is not enabled");

       greenRadioButton.click();

    }

    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));
        // input[type='text'] cssSelector
        //#input-example>input css with parent child
        inputBox.sendKeys("some message");


    }
}
