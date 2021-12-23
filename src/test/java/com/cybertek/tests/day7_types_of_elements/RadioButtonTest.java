package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test

    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadio= driver.findElement(By.cssSelector("#blue"));
        WebElement redRadio= driver.findElement(By.id("red"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        Thread.sleep(3000);

        Assert.assertTrue(blueRadio.isSelected(),"verify that blue is selected" );

        Assert.assertFalse(redRadio.isSelected(),"verify red is NOT selected");


        redRadio.click();

        Assert.assertFalse(blueRadio.isSelected(),"verify that blue is NOT selected" );

        Assert.assertTrue(redRadio.isSelected(),"verify red is selected");

        driver.quit();


    }
}
