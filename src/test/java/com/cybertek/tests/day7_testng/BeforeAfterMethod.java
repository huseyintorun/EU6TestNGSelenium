package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {
    @Test
    public void test1 () {
        System.out.println("First Test Case");
    }
    @Test
    public void test2 (){
        System.out.println("second Test Case");

    }
    @Test
    public void test3 (){
        System.out.println("Third Test Case");

    }
    @BeforeMethod
    public void beforeMethod (){
        System.out.println("WEBDRIVER Opening");

    }
    @AfterMethod
    public void afterMethod (){
        System.out.println("WEBDRIVER Closing");

    }
    @BeforeClass
    public void beforeClass (){
        System.out.println("Before Class");

    }
    @AfterClass
    public void afterClass (){
        System.out.println("After Class");

    }

}
