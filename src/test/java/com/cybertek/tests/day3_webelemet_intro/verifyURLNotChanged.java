package com.cybertek.tests.day3_webelemet_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLNotChanged {
    public static void main(String[] args) throws InterruptedException {


    /*Verify URL not changed
	    -open chrome browser
	    -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
	    -click on Retrieve password
	    -verify that url did not change
	*/

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save expected url before clicking button //"form_submit"
       String beforeClickURL = driver.getCurrentUrl();
        System.out.println(beforeClickURL);

        //click-on Retrieve Password Button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        Thread.sleep(3000);
        retrievePasswordButton.click();
        Thread.sleep(2000);

        //save expected url after clicking button
        String afterClickURL = driver.getCurrentUrl();
        System.out.println(afterClickURL);

        //-verify that url did not change
        if(beforeClickURL.equals(afterClickURL)){
            System.out.println("TC1 passed.");
        }else{
            System.out.println("TC1 failed. ");
        }

    }
}
