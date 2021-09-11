package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //Locating radio buttons
        WebElement blueRadioButton = driver.findElement(By.cssSelector("#blue")) ;
        WebElement redRadioButton = driver.findElement(By.id("red")) ;

        // Default blue selected or not
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        System.out.println("redRadioButton.isSelected() = " + redRadioButton.isSelected());

        //verify blue is selected red is not selected
        //blue should selected
        Assert.assertTrue(blueRadioButton.isSelected(),"verify that blue is selected");
        //red should not selected
        Assert.assertFalse(redRadioButton.isSelected(),"verify that red is not selected");

        redRadioButton.click();

        Assert.assertFalse(blueRadioButton.isSelected());
        Assert.assertTrue(redRadioButton.isSelected());

        Thread.sleep(3000);
        driver.quit();
    }

}
