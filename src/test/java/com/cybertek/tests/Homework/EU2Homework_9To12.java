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
    List<WebElement> StatusCodes;
    @BeforeMethod
    public void start(){
        driver= WebDriverFactory.getDriver("edge");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Status Codes")).click();
        StatusCodes = driver.findElements(By.xpath("//a[contains(@href,'status_')]"));


    }

    @AfterMethod
    public void end(){

       driver.quit();
    }

    @Test
    public void Test1() throws InterruptedException {

           System.out.println("StatusCodes.size() = " + StatusCodes.size());
           StatusCodes.get(0).click();
            String actualText = driver.findElement(By.xpath("//*[contains(text(),'This page returned')]")).getText();
            System.out.println("actualText = " + actualText);
            Assert.assertTrue(actualText.contains("This page returned a 200 status code"));





    }

    @Test
    public void Test2(){
        StatusCodes.get(1).click();
        String actualText1 = driver.findElement(By.xpath("//*[contains(text(),'This page returned')]")).getText();
        System.out.println("actualText = " + actualText1);
        Assert.assertTrue(actualText1.contains("This page returned a 301 status code"));

    }

    @Test
    public void Test3(){
        StatusCodes.get(2).click();
        String actualText = driver.findElement(By.xpath("//*[contains(text(),'This page returned')]")).getText();
        System.out.println("actualText = " + actualText);
        Assert.assertTrue(actualText.contains("This page returned a 404 status code"));

    }
    @Test
    public void Test4(){
        StatusCodes.get(3).click();
        String actualText = driver.findElement(By.xpath("//*[contains(text(),'This page returned')]")).getText();
        System.out.println("actualText = " + actualText);
        Assert.assertTrue(actualText.contains("This page returned a 500 status code"));

    }
}

