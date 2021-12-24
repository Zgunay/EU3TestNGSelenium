package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewCheckBoxHW {

    @Test
            public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("edge");
//  1ve 2
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        WebElement Username= driver.findElement(By.id("ctl00_MainContent_username"));
        Username.sendKeys("Tester");
        WebElement Password= driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        Password.sendKeys("test");
        WebElement Login= driver.findElement(By.cssSelector("#ctl00_MainContent_login_button"));
        Login.click();

 // 3
        WebElement checkAll=driver.findElement(By.cssSelector("#ctl00_MainContent_btnCheckAll"));
        checkAll.click();
       for (int i=2;i<=9;i++){
           WebElement check1=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl0"+i+"_OrderSelector"));
           Assert.assertTrue(check1.isSelected(),"Verify checkbox"+(i)+"NOT is selected");
       }


       // 4)
        WebElement uncheckAll= driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll"));
        uncheckAll.click();

        Thread.sleep(2000);
        for (int i=2;i<=9;i++){
            WebElement check=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl0"+i+"_OrderSelector"));
            Assert.assertFalse(check.isSelected(),"Verify checkbox"+(i)+" is selected");
        }

        WebElement check=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl02_OrderSelector"));

          check.click();

        WebElement delete= driver.findElement(By.cssSelector(".btnDeleteSelected"));
        delete.click();

      String name= driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid > tbody > tr:nth-child(2) > td:nth-child(2)")).getText();
        System.out.println("name = " + name);

   //6
        Assert.assertTrue(!name.contains("Paul"));

        driver.quit();


    }



}
