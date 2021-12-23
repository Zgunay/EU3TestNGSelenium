package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocators {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
// this static id . Eger dynaimic id olsaydi. Bunu kullanamazdik. sayfayi referesh yaparsak bunu göre
        // biliriz.
        WebElement dontClickButton= driver.findElement(By.id("disappearing_button"));
        dontClickButton.click();
    }
}
