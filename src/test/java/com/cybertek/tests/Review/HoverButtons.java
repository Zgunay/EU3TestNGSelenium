package com.cybertek.tests.Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverButtons {
    WebDriver driver;
    @BeforeMethod
    public void Begin(){
        driver= WebDriverFactory.getDriver("edge");
       // driver.get("http://practice.cybertekschool.com/hovers");
    }

    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(5000);
      //  driver.close();
    }

    @Test
    public void Test1(){

        WebElement source= driver.findElement(By.xpath("(//img)[1]"));
        Actions actions=new Actions(driver);

        actions.moveToElement(source).perform();
    }

    @Test
    public void Test2() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target= driver.findElement(By.xpath("//div[@id='droptarget']"));
        WebElement cookies= driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookies.click();
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();


    }

}
