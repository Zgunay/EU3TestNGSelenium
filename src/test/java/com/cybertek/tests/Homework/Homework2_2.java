package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework2_2 {
    public static void main(String[] args) throws InterruptedException {
       /* XPATH PRACTICES
        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_passwordLinks zu einer externen Website
        3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        a. “Home” link
        b. “Forgot password” header
        c. “E-mail” text
        d. E-mail input box
        e. “Retrieve password” button
        4.Print text of a,b,c,e and put some email to d   */


        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement home= driver.findElement(By.linkText("Home"));
     //   home.click();
        WebElement Password= driver.findElement(By.tagName("h2"));


        WebElement EmailText= driver.findElement(By.xpath("//label[text()='E-mail']"));
        System.out.println("EmailText.getText() = " + EmailText.getText());
        WebElement InputBox= driver.findElement(By.xpath("//input"));
        InputBox.sendKeys("hhhhhhhh@kkk.com");
        WebElement BUTTON= driver.findElement(By.className("radius"));

        System.out.println("home.getText() = " + home.getText());
        System.out.println("Password.getText() = " + Password.getText());
        System.out.println("BUTTON.getText() = " + BUTTON.getText());
        System.out.println("InputBox.getAttribute() = " + InputBox.getAttribute("value"));
        Thread.sleep(3000);

        driver.quit();


    }
}
