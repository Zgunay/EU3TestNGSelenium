package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Oscars_Homework {
    /*    I have created three test scenarios for this weekend review. For those people who have some extra time and looking for something challenging  they can try these tasks. These are NOT mandatory. I will do them during the review time. Totally optional to test yourself. Have a nice evening.
    Task1:
    1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
    2. Click on "Click me, to Open an alert after 5 seconds"
    3. Explicitly wait until alert is present
    4. Then handle the Javascript alert
    Task2:
    1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
    2. Click on "Enable button after 10 seconds"
    3. Explicitly wait until the button is enabled
    4. Then verify the button is enabled
    Task3:
    1. Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    2. Login with username: Tester, password: test
    3. Click  Order button
    4. Verify under Product Information, selected option is “MyMoney”
    5. Then select FamilyAlbum, make quantity 2, and click Calculate,
    6. Then verify Total is equal to Quantity*PricePerUnit */
  WebDriver driver;

    @BeforeMethod
    public void start(){
    driver= WebDriverFactory.getDriver("edge") ;
    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    driver.manage().window().maximize();

    }

        @AfterMethod
    public void end() throws InterruptedException {
    Thread.sleep(3000);
       // driver.quit();


    }

    @Test
    public void Test1(){

     WebElement button1= driver.findElement(By.cssSelector("#alert"));
        button1.click();
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        //
    }

    @Test
    public void Test2(){
        WebElement button= driver.findElement(By.cssSelector("#enable-button"));
        button.click();
        WebElement Button= driver.findElement(By.cssSelector("#disable"));

        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(Button));
        Assert.assertTrue(Button.isEnabled(),"NOT enabled");


    }






}
