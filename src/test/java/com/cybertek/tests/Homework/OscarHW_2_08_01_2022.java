package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OscarHW_2_08_01_2022 {

  /*  Adidas Company QA Test
    You have to implement the following Web automated checks over our DEMO ONLINE SHOP: https://www.demoblaze.com/index.html
            • Customer navigation through product categories: Phones, Laptops and Monitors
• Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
            • Navigate to "Laptop" → "Dell i7 8gb" and click on "Add to cart". Accept pop up confirmation.
            • Navigate to "Cart" → Delete "Dell i7 8gb" from cart.
            • Click on "Place order".
            • Fill in all web form fields.
            • Click on "Purchase"
            • Capture and log purchase Id and Amount.
• Assert purchase amount equals expected.
• Click on "Ok  */
  WebDriver driver;
    @BeforeMethod
    public void Before(){

        driver= WebDriverFactory.getDriver("edge");
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.linkText("Laptops")).click();
    }

    @AfterMethod
    public void Close(){
       // driver.quit();
    }

  @Test
  public void Test() throws InterruptedException {

      WebDriverWait wait= new WebDriverWait(driver,2000);
      Thread.sleep(2000);
      driver.findElement(By.linkText("Sony vaio i5")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Add to cart")).click();
     wait.until(ExpectedConditions.alertIsPresent());
     // Thread.sleep(2000);
      driver.switchTo().alert().accept();
      Thread.sleep(2000);
    driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
      driver.findElement(By.linkText("Laptops")).click();

      Thread.sleep(2000);
      driver.findElement(By.linkText("Dell i7 8gb")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Add to cart")).click();

       Thread.sleep(2000);
      driver.switchTo().alert().accept();

      driver.findElement(By.cssSelector("#cartur")).click();
      Thread.sleep(2000);

      driver.findElement(By.xpath("(//*[contains(text(),'Delete')])[2]")).click();
      Thread.sleep(8000);
      driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
      Thread.sleep(2000);

     driver.findElement(By.id("name")).sendKeys("Ziya");
     driver.findElement(By.id("country")).sendKeys("Turkey");
     driver.findElement(By.id("city")).sendKeys("Ankara");
     driver.findElement(By.id("card")).sendKeys("12345678");
     driver.findElement(By.id("month")).sendKeys("August");
     driver.findElement(By.id("year")).sendKeys("2022");
     driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
     String order= driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
      System.out.println("order = " + order);


      String[] ARR= order.split(" ");

      for (int i = 0; i < ARR.length; i++) {

          System.out.println("ARR[0] = " + ARR[i]);
      }


  }




}
