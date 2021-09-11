package com.cybertek.reviews.day2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TC05_CheckBoxHW {
    /*
SeleniumEasy Checkbox Verification – Section 1 and 2
1.Open Chrome browser
2.Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
3.Verify “Success – Check box is checked” message is NOT displayed.
4.Click to checkbox under “Single Checkbox Demo” section
5.Verify “Success – Check box is checked” message is displayed.
     */
    WebDriver driver;  // we need to make it global variable

    @BeforeClass
    public void setUp() {
        // Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }


}



