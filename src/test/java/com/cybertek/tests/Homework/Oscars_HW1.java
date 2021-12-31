package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Oscars_HW1 {
  WebDriver driver;

    @Test
    public void Test(){
        driver=WebDriverFactory.getDriver("edge");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("#ctl00_MainContent_login_button")).click();
        driver.findElement(By.linkText("View all products")).click();

        List<WebElement> elements1 = driver.findElements(By.xpath("//th"));
        for (WebElement element : elements1) {
            System.out.println(element.getText());
        }



        List<WebElement> elements = driver.findElements(By.xpath("//tr[2]/td"));
        for (WebElement element1 : elements) {
            System.out.println("element.getText() = " + element1.getText());
        }


        driver.findElement(By.linkText("Order")).click();
        driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");
        driver.findElement(By.xpath("//*[@*='submit']")).click();

        String result= driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtTotal")).getAttribute("value");
        System.out.println("result = " + result);
        String price = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtUnitPrice")).getAttribute("value");
        System.out.println("price = " + price);
        String quantitiy= driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtQuantity")).getAttribute("value");
        System.out.println("quantitiy = " + quantitiy);
        int  newresult= Integer.parseInt(result);
        System.out.println(newresult);
        int newprice= Integer.parseInt(price);
        int newquantitiy= Integer.parseInt(quantitiy);

        Assert.assertEquals(newprice*newquantitiy,newresult,"This NOT same");

        driver.quit();
    }
}
