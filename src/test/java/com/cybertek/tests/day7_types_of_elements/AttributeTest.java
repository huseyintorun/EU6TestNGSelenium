package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadiobutton = driver.findElement(By.id("blue"));
        System.out.println(blueRadiobutton.getAttribute("name"));
        System.out.println(blueRadiobutton.getAttribute("type"));

        System.out.println(blueRadiobutton.getAttribute("innerHTML"));
        System.out.println(blueRadiobutton.getAttribute("outerHTML"));


        driver.quit();


    }
}
