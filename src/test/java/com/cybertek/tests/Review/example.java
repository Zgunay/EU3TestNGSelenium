package com.cybertek.tests.Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class example {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("microsoft edge");

        driver.get("https://www.amazon.de");

        WebElement searchbutton = driver.findElement(By.id("twotabsearchtextbox"));

        searchbutton.sendKeys("Selenium");

        Thread.sleep(3000);

        WebElement clickbutton = driver.findElement(By.cssSelector("#nav-search-submit-button"));


        clickbutton.click();
    }
}