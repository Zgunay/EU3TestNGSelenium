package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;


public class example {
    public static void main(String[] args) {


        WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        System.out.println(driver.getTitle());
    }
}
