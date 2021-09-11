package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class firsttestNGTest {

    @Test
    public void tC1 (){
        System.out.println("My first test case");
    }
    @Test
    public void tC2 (){
        System.out.println("my second 2 TC");
    }
    @Test
    public void test3(){
        String expectedTitle = "Cyt";
        String actualTitle = "Cybertek" ;

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify Title starts with Cyb");



    }

}
