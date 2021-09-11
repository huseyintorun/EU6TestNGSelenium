package com.cybertek.tests.day3_webelemet_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLChanged {

     public static void main(String[] args) {

           /* Verify URL changed
        open chrome browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        click on Retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent
    */
         //open chrome browser
         WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         driver.get("http://practice.cybertekschool.com/forgot_password");

         // enter any email
         WebElement eMailInputBox = driver.findElement(By.name("email"));
         eMailInputBox.sendKeys("torunhsyn@1989icloud.com");

         // click-on Retrieve Password Button
         WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
         retrievePasswordButton.click();

         //verify that url changed to http://practice.cybertekschool.com/email_sent

        String expectedResult = "http://practice.cybertekschool.com/email_sent";
        String actualResult = driver.getCurrentUrl();

        if (expectedResult.equals(actualResult)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

     }
}
