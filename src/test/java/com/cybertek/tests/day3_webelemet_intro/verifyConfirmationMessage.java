package com.cybertek.tests.day3_webelemet_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {



    /*
    Verify confirmation message
        open chrome browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!'
     */
        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

       // enter any email
        WebElement enterEMail = driver.findElement(By.name("email"));
        String expectedEMail = "tournhsyn@icloud.com";
        enterEMail.sendKeys(expectedEMail);

        //verify that email is displayed in the input box
        WebElement verifyDisplayEMail = driver.findElement(By.name("email"));
        String actualEMail = verifyDisplayEMail.getAttribute("value");
        System.out.println("Expected EMail: " + expectedEMail);
        System.out.println("Actual EMail: "+actualEMail);
        if(expectedEMail.equals(actualEMail)){
            System.out.println("E Mail verificattion Passed!");
        }else{
            System.out.println("E Mail verificattion Failed!");
        }

        //click on Retrieve password
        WebElement retrievePassswordbutton = driver.findElement(By.id("form_submit"));
        retrievePassswordbutton.click();

        //verify that confirmation message says 'Your e-mail's been sent!'confirmation_message
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = confirmationMessage.getText();

        System.out.println("Expected Message: "+expectedMessage);
        System.out.println("Actual Message: " + actualMessage);

        if(expectedMessage.equals(actualMessage)){
            System.out.println("Message Verification PASSED!");
        }else{
            System.out.println("MEssage Verification FAILED!");
        }
        driver.quit();
    }
}