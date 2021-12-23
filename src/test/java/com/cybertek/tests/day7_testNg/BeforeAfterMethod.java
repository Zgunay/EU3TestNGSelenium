package com.cybertek.tests.day7_testNg;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("--BEFORE CLASS--");
        System.out.println("executed one time before the class");
    }

    @Test

    public void Test1(){
        System.out.println("First Test Case");
    }


    @BeforeMethod
    public  void setUp(){
        System.out.println("Web Driver Opening  Browser");
    }


    @Test

    public void Test2(){
        System.out.println("Second Test Case");
    }


    @AfterMethod
    public  void tearUp(){
        System.out.println("Closing Browsing Quit");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--AFTER CLASS--");
        System.out.println("Some Reporting Code Here");
    }

}
