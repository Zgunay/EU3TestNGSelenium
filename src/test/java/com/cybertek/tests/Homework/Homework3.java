package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
       /*Go to wikipedia.org (Links to an external site.)
        enter search term `selenium webdriver`
        // ziya günay
        click on search button
        click on search result `Selenium (software)`
        verify url ends with `Selenium_(software)'*/


        WebDriver driver= WebDriverFactory.getDriver("edge");
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);
        WebElement Search= driver.findElement(By.xpath("//input[contains(@id,'searchInput')]"));
        Search.sendKeys("selenium webdriver");
        WebElement button= driver.findElement(By.xpath("//button [contains(@type,'submit')]"));
        button.click();
        String expectedURL= "Selenium (software)";
        String URL= driver.getCurrentUrl();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        if(URL.contains("Selenium (software)")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

            driver.quit();
    }
}
