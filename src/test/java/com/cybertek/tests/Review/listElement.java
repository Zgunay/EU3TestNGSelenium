package com.cybertek.tests.Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class listElement {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver= WebDriverFactory.getDriver("edge");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
    }

   @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
   }

   @Test
    public void test1(){

       List<WebElement> elements = driver.findElements(By.cssSelector(".btn"));
       System.out.println("elements.size() = " + elements.size());

       for (WebElement buttons : elements) {

           System.out.println("buttons.getText() = " + buttons.getText());
           Assert.assertTrue(buttons.isDisplayed(),"Verify buttons exist");

       }

   }

}
