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

        WebElement check1=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
        WebElement check2=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[3]/td[1]/input"));
        WebElement check3=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[4]/td[1]/input"));
        WebElement check4=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[5]/td[1]/input"));
        WebElement check5=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[6]/td[1]/input"));
        WebElement check6=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[7]/td[1]/input"));
        WebElement check7=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[8]/td[1]/input"));
        WebElement check8=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[9]/td[1]/input"));


        Assert.assertTrue(check1.isSelected(),"Verify checkbox is selected");
        Assert.assertTrue(check2.isSelected(),"Verify checkbox is selected");
        Assert.assertTrue(check3.isSelected(),"Verify checkbox is selected");
        Assert.assertTrue(check4.isSelected(),"Verify checkbox is selected");
        Assert.assertTrue(check5.isSelected(),"Verify checkbox is selected");
        Assert.assertTrue(check6.isSelected(),"Verify checkbox is selected");
        Assert.assertTrue(check7.isSelected(),"Verify checkbox is selected");
        Assert.assertTrue(check8.isSelected(),"Verify checkbox is selected");

// 4)
        WebElement uncheckAll= driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll"));
        uncheckAll.click();

        Thread.sleep(2000);

        WebElement check11=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
        WebElement check22=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[3]/td[1]/input"));
        WebElement check33=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[4]/td[1]/input"));
        WebElement check44=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[5]/td[1]/input"));
        WebElement check55=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[6]/td[1]/input"));
        WebElement check66=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[7]/td[1]/input"));
        WebElement check77=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[8]/td[1]/input"));
        WebElement check88=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[9]/td[1]/input"));



        Assert.assertFalse(check11.isSelected(),"Verify checkbox is NOT selected");
        Assert.assertFalse(check22.isSelected(),"Verify checkbox is NOT selected");
        Assert.assertFalse(check33.isSelected(),"Verify checkbox is NOT selected");
        Assert.assertFalse(check44.isSelected(),"Verify checkbox is NOT selected");
        Assert.assertFalse(check55.isSelected(),"Verify checkbox is NOT selected");
        Assert.assertFalse(check66.isSelected(),"Verify checkbox is NOT selected");
        Assert.assertFalse(check77.isSelected(),"Verify checkbox is NOT selected");
        Assert.assertFalse(check88.isSelected(),"Verify checkbox is NOT selected");

 //5
        check11.click();

        WebElement delete= driver.findElement(By.cssSelector(".btnDeleteSelected"));
        delete.click();

      String name= driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid > tbody > tr:nth-child(2) > td:nth-child(2)")).getText();
        System.out.println("name = " + name);

   //6
        Assert.assertTrue(!name.contains("Paul"));




    }



}
