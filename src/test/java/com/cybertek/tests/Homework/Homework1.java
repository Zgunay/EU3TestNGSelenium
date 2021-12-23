package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
   //     Test case 1
    //    Go to Ebay
     //   enter search term
     //   click on search button
    //    print number of results

        WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.get("https://www.ebay.com/");
        WebElement searchBox= driver.findElement(By.id("gh-ac"));

      searchBox.sendKeys("Selenium");
        Thread.sleep(3000);
       WebElement searchButton= driver.findElement(By.id("gh-btn"));
        searchButton.click();
        WebElement result= driver.findElement(By.className("srp-controls__count-heading"));
        System.out.println("result.getText() = " + result.getText());
        String [] arr= result.getText().split(" ");
        System.out.println("number of result= "+ arr[0]);
        Thread.sleep(3000);
        driver.quit();
    }
}
