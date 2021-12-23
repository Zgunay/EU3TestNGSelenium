package com.cybertek.tests.Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver =  WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");

        // Link Text
     //   WebElement MultipleButtons= driver.findElement(By.linkText("Multiple Buttons"));

        // PartialLinkText

        WebElement MultipleButtons= driver.findElement(By.partialLinkText("Multiple "));
        MultipleButtons.click();

        // xpath
    //    WebElement But1= driver.findElement(By.xpath("//button[text()='Button 1']"));


      // css
        WebElement But1= driver.findElement(By.cssSelector("[onclick='button1()']"));
        System.out.println("But1.getText() = " + But1.getText());


    }
}
