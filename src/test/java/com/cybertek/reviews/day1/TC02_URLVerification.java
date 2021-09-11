package com.cybertek.reviews.day1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class TC02_URLVerification {

    public static void main(String[] args) {


        /*
TC #2: Cybertekpractice toolverifications
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com
3.Verify URL contains
Expected: cybertekschool
4.Verify title:
Expected: Practice
 */

        WebDriver ali = WebDriverFactory.getDriver("chrome");
        ali.manage().window().maximize();
        ali.get("http://practice.cybertekschool.com");
// go to website
        String expectedUrl = "cybertekschool" ;
        String actualUrl = ali.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("passed.");
        }else{
            System.out.println("failed");
        }

        ali.quit();

    }

}
