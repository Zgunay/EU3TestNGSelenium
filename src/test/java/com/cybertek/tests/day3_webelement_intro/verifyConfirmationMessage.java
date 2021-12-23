package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement email= driver.findElement(By.name("email"));
        String emailexpected= "abcd123@gmail.com";
        email.sendKeys(emailexpected);
        String emailtext= email.getAttribute("value");
        if(emailexpected.equals(emailtext)){
            System.out.println("Email is displayed");
        }else {
            System.out.println("Email is not displayed.  Test is failed");
        }
        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        WebElement confirmationMessage= driver.findElement(By.name("confirmation_message"));
        String expectedMessage= "Your e-mail's been sent!";
        String actualMessage= confirmationMessage.getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        System.out.println(expectedMessage);
        System.out.println(actualMessage);

        driver.quit();

    }
}
