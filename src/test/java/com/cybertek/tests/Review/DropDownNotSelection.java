package com.cybertek.tests.Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownNotSelection {

    WebDriver driver;
    @BeforeTest
    public void setup(){
        driver= WebDriverFactory.getDriver("edge");
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterTest
    public void close() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1(){

    }
}
