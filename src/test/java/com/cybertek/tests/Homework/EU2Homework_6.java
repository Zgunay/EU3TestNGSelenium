package com.cybertek.tests.Homework;
 /*
       Step 1. Go to "https://www.tempmailaddress.com/"
       Step 2. Copy and save email as a string.
        Step 3. Then go to “https://practicecybertekschool.
        herokuapp.com”
        Step 4. And click on “Sign Up For Mailing List".
        Step 5. Enter any valid name.
        Step 6. Enter email from the Step 2.
        Step 7. Click Sign Up
        Step 8. Verify that following message is displayed:
        “Thank you for signing up. Click the button below to
        return to the home page.”
        Step 9. Navigate back to the “https://
        www.tempmailaddress.com/”
        Step 10. Verify that you’ve received an email from
        “do-not-reply@practice.cybertekschool.com”
        Step 11. Click on that email to open it.
        Step 12. Verify that email is from: “do-notreply@
        practice.cybertekschool.com”
        Step 13. Verify that subject is: “Thanks for
        subscribing to practice.cybertekschool.com!”   */


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class    EU2Homework_6 {
    WebDriver driver;
@Test
    public void Test() throws InterruptedException {
    driver=WebDriverFactory.getDriver("edge");
    driver.get("https://www.tempmailaddress.com/");
    WebElement email= driver.findElement(By.xpath("//span[@id='email']"));
    String newEmail=email.getText();
    System.out.println("newEmail = " + newEmail);

    driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");
    driver.findElement(By.partialLinkText("Sign Up For ")).click(); // signup click
    driver.findElement(By.name("full_name")).sendKeys("Ziya"); // step 5
    driver.findElement(By.name("email")).sendKeys(newEmail); // step 6
    driver.findElement(By.name("wooden_spoon")).click(); // step 7
    String actualText= driver.findElement(By.xpath("//h3")).getText();
    String expectedText="Thank you for signing up. Click the button below to return to the home page.";
    Assert.assertTrue(actualText.equals(expectedText),"Text is NOT same");  // step8

    driver.navigate().to("https://www.tempmailaddress.com/");
    String actualmailText =driver.findElement(By.xpath("//*[@*='odMobil']")).getText();
    String expectedmailText= "do-not-reply@practice.cybertekschool.com";
    Assert.assertEquals(actualText,expectedText,"is NOT same Text");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[3]/td[1]")).click();
    System.out.println("driver.findElement(By.cssSelector(\"#schranka > tr:nth-child(3) > td.col-xs-9.mobileFrom\")).getText() = " + driver.findElement(By.cssSelector("#schranka > tr:nth-child(3) > td.col-xs-9.mobileFrom > span.glyphicon.glyphicon-envelope")).getText());


}



}
