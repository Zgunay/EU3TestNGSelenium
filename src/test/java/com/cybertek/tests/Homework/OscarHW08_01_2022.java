package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OscarHW08_01_2022 {

    /*   1. Go to [https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2](https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2)
 2. Switch to iframe.
 3. Double click on the text “Double-click me to change my text color.”
 4. Assert: Text’s “style” attribute value contains “red”.*/

WebDriver driver;
@Test
    public void Test(){

    driver= WebDriverFactory.getDriver("edge");
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
  //  Alert alert=driver.switchTo().alert();
    WebElement cockies=driver.findElement(By.cssSelector("#accept-choices"));
    cockies.click();
    driver.switchTo().frame("iframeResult");
    WebElement button=driver.findElement(By.xpath("//p[@*='demo']"));
       Actions act = new Actions(driver);

//Double click on element   //p[@style='color: red;']

    act.doubleClick(button).perform();
    String colorcheck= button.getAttribute("style");
    System.out.println("colorcheck = " + colorcheck);
     Assert.assertTrue(colorcheck.contains("red"));
}


}
