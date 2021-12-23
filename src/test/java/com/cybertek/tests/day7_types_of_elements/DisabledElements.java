package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement greenRadioBtn=driver.findElement(By.cssSelector("#green"));


        greenRadioBtn.isDisplayed();
        Assert.assertFalse(greenRadioBtn.isEnabled(),"Verify radio button NOT enabled");


    }


    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputbox= driver.findElement(By.cssSelector("#input-example>input"));

       // inputbox.sendKeys("some message");

        WebElement enablebutton= driver.findElement(By.cssSelector("#input-example>button"));
        enablebutton.click();
        Thread.sleep(3000);
        inputbox.sendKeys("some message");
        Assert.assertEquals("some message","some message");


    }


}