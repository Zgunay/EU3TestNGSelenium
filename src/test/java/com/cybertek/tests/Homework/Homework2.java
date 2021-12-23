package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.sql.rowset.serial.SerialArray;

public class Homework2 {
    public static void main(String[] args) {
        /*Go to Ebay
        search Selenium
        click on search button
        verify title contains Selenium*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
        WebElement Searchbox= driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        Searchbox.sendKeys("Selenium");
        WebElement Searchbutton= driver.findElement(By.id("gh-btn"));
        Searchbutton.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        if(driver.getTitle().contains("selenium")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
