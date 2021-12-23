package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class exercises {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.demoblaze.com/index.html#");
        WebElement Laptops= driver.findElement(By.xpath("//a[text()='Laptops']"));
        Laptops.click();
       WebElement sonyvaoi7= driver.findElement(By.partialLinkText("i7"));
       sonyvaoi7.click();
    //  WebElement PRICE= driver.findElement(By.xpath("//h3[contains(text(),'790')]"));
    //   System.out.println("PRICE.getText() = " + PRICE.getText());


    }
}
