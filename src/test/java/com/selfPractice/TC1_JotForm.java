package com.selfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC1_JotForm {
    public void  () {
    @Test
    // Sign-Up ont the right side tap of the page getScreenshotAs()
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("(//a[@data-name='signup'])[2]"));

}
}
