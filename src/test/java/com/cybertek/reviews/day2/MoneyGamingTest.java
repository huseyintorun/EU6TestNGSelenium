package com.cybertek.reviews.day2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MoneyGamingTest {
     /* 1. Navigate to: https://moneygaming.qa.gameaccount.com/sign-up.shtml
            2. Enter your first name and surname in the form
        3. Verify the text of Checkbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
            4. Check and verify if it is selected
        4. Submit the form by clicking the JOIN NOW button
        5. Validate that a validation message with text ‘ This field is required’ appears under the date of
    birth box */

    @Test
    public void moneyGame (){
        WebDriver driver = WebDriverFactory.getDriver("chrome") ;
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
        //Enter your first name and surname in the form
        WebElement userName = driver.findElement(By.cssSelector("#forename"));

        userName.sendKeys("Huseyin");
        WebElement userSurname = driver.findElement(By.xpath("//input[@name='map(lastName)']"));

        userSurname.sendKeys("Torun");

        WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkbox'][3]"));
        checkbox.click();

        Assert.assertTrue(checkbox.isSelected(),"verify that if the checkbox selected.");

        WebElement joinNowbutton = driver.findElement(By.cssSelector("[alt='Join Now']"));
        joinNowbutton.click();

        WebElement thisFieldRequered = driver.findElement(By.xpath("//label[contains(text(),'Dieses Feld ist erforderlich')][@for='dob']"));
        System.out.println("thisFieldRequered.getText() = " + thisFieldRequered.getText());

        Assert.assertTrue(thisFieldRequered.getText().equals("Dieses Feld ist erforderlich"));

    }
}
