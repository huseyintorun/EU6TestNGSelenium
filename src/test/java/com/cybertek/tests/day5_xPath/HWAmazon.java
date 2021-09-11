package com.cybertek.tests.day5_xPath;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class HWAmazon {
    public static void main(String[] args) throws InterruptedException {

        //WebDriverManager.chromedriver().setup();

        //WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        element.sendKeys("selenium");
        WebElement searchButton = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']/input"));
        searchButton.click();
        WebElement result = driver.findElement(By.xpath("(//span[contains(text(),'results for')])"));
        String actualResult = result.getText();
        System.out.println(actualResult);
        String array [] = actualResult.split(" ");
        System.out.println(Arrays.toString(array));
        if(array[2].contains("207")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        driver.quit();



        //Thread.sleep(4000);
        //driver.quit();

    }
}
