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

    driver.navigate().to("https://www.tempmailaddress.com/");  // step 9

    String actualmailText =driver.findElement(By.xpath("//td[text()='do-not-reply@practice.cybertekschool.com']")).getText(); //  step 10
    System.out.println("actualmailText = " + actualmailText);
    String expectedmailText= "do-not-reply@practice.cybertekschool.com";
    System.out.println("expectedmailText = " + expectedmailText);
    Assert.assertTrue(actualmailText.contains(expectedmailText));
   // Assert.assertEquals(actualText,expectedText,"is NOT same Text");

    driver.findElement(By.xpath("//*[@data-href='2']")).click();  // step 11

   String from= driver.findElement(By.cssSelector("#odesilatel")).getText(); // step 12
   Assert.assertTrue(from.contains("do-not-reply@practice.cybertekschool.com"));

   String subject= driver.findElement(By.cssSelector("#predmet")).getText(); // step 13
   Assert.assertTrue(subject.contains("Thanks for subscribing to practice.cybertekschool.com!"));


}



}
