package com.cybertek.tests.day5_xPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {
    public static void main(String[] args) throws InterruptedException {

        /*Test case 1
        Go to Ebay
        enter search term
        click on search button
        print number of results*/

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.de/");

        WebElement search = driver.findElement(By.xpath("//input[@type='text' and @ class = 'gh-tb ui-autocomplete-input']"));
        search.sendKeys("demet");
        WebElement finden = driver.findElement(By.xpath("//input[@type='submit' and @ class = 'btn btn-prim gh-spr']"));
        finden.click();

        WebElement getTheResult = driver.findElement(By.xpath("//h1[@class = 'srp-controls__count-heading']/.."));
        String resultText = getTheResult.getText();
        System.out.println(resultText);

        Thread.sleep(3000);
        driver.quit();


    }
}
