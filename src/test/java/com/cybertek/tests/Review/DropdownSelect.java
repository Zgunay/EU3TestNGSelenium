package com.cybertek.tests.Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownSelect {
   WebDriver driver;
    @BeforeTest
    public void setup(){
        driver= WebDriverFactory.getDriver("edge");
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterTest
    public void close() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    @Test

    public void test1(){

      WebElement selection= driver.findElement(By.xpath("//select[1]"));
        Select element = new Select(selection);
        List<WebElement> elementOptions = element.getOptions();
        System.out.println("elementOptions.size() = " + elementOptions.size());

        for (WebElement option : elementOptions) {
            System.out.println("option.getText() = " + option.getText());

        }
        elementOptions.get(1).click();
    }


    @Test

    public void test2(){
        WebElement state= driver.findElement(By.xpath("//select[5]"));
        Select city=new Select(state);

        List<WebElement> cities = city.getOptions();
        System.out.println("cities.size() = " + cities.size());
        for (WebElement order : cities) {
            System.out.println("order.getText() = " + order.getText());
        }cities.get(4).click();
        city.selectByIndex(6);




    }

}
