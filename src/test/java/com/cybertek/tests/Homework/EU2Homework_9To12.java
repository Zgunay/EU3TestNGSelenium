package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class EU2Homework_9To12 {
  WebDriver driver;
    @BeforeMethod
    public void start(){
        driver= WebDriverFactory.getDriver("edge");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Status Codes")).click();


    }

    @AfterMethod
    public void end(){

       // driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {
        List<WebElement> StatusCodes = driver.findElements(By.xpath("//a[contains(@href,'status_')]"));
        System.out.println("StatusCodes.size() = " + StatusCodes.size());

            StatusCodes.get(0).click();
            String actualText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/text()[1]")).getText();
            System.out.println("actualText.trim() = " + actualText.trim());
            String expectedText = "This page returned a 200 status code.";
            System.out.println("expectedText.trim() = " + expectedText.trim());


       Assert.assertTrue(actualText.equals(expectedText));
       Assert.assertEquals(actualText,expectedText,"This NOT same");

       /* driver.navigate().back();
        Thread.sleep(2000);

        StatusCodes.get(1).click();
        String actual301= driver.findElement(By.xpath("//p[contains(text(),'This page returned')]")).getText();
        System.out.println("actual301 = " + actual301);
        actual301=actual301.trim();
        String expected301="This page returned a 301 status code.";
        Assert.assertEquals(actual301,expected301); */
    }
}

