package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EU2Homework_8 {
    WebDriver driver;

    @Test
    public void Test(){
        driver= WebDriverFactory.getDriver("edge");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Autocomplete")).click();
        driver.findElement(By.cssSelector("#myCountry")).sendKeys("United States of America");
        driver.findElement(By.xpath("//*[@type='button']")).click();
        String result= driver.findElement(By.cssSelector("#result")).getText();
        String expected="You selected: United States of America";
        Assert.assertEquals(result,expected,"They are NOT same");
        driver.quit();

    }

}
