package com.cybertek.tests.Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.concurrent.Callable;

public class Checkboxes {
WebDriver driver;
    @BeforeMethod
    public  void Test() {
         driver= WebDriverFactory.getDriver("edge");
        driver.get("http://practice.cybertekschool.com/");
    }

    @Test
    public void test1(){
    WebElement Checkbox= driver.findElement(By.partialLinkText("Checkboxes"));
    Checkbox.click();
    WebElement home=driver.findElement(By.xpath("/html/body"));
    System.out.println("home.getText() = " + home.getText());
    System.out.println("driver.findElement(By.xpath(\"//h3\")) = " + driver.findElement(By.xpath("//h3")));
    System.out.println("driver.findElement(By.xpath(\"//span[@class='checktext'][1]\")).getText() = " + driver.findElement(By.xpath("//span[@class='checktext'][1]")).getText());
    System.out.println("driver.findElement(By.xpath(\"//span[@class='checktext'][2]\")).getText() = " + driver.findElement(By.xpath("//span[@class='checktext'][1]")).getText());
   Assert.assertFalse(driver.findElement(By.xpath("//input[1]")).isSelected()," selected");
   Assert.assertTrue(driver.findElement(By.xpath("//input[2]")).isSelected(),"NOT selected");

    }


    @AfterMethod
    public void TestSon(){
    driver.quit();

    }
}
