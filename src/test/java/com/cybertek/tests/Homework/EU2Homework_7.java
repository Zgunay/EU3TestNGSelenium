package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EU2Homework_7 {
    /*
Step 1. Go to “https://practicecybertekschool.herokuapp.com”
Step 2. And click on “File Upload".
Step 3. Upload any file with .txt extension from your
computer.  C:\Users\PC\Desktop\New Text Document.txt
Step 4. Click “Upload” button.
Step 5. Verify that subject is: “File Uploaded!”
Step 6. Verify that uploaded file name is displayed.  */
    WebDriver driver;
    @Test
    public void test(){
        driver= WebDriverFactory.getDriver("edge");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.partialLinkText("File Uplo")).click();
       driver.findElement(By.name("file")).sendKeys("C:\\Users\\PC\\Desktop\\New Text Document.txt");
       driver.findElement(By.id("file-submit")).click();

      String actual= driver.findElement(By.xpath("//h3")).getText();
      String expected = "File Uploaded!";
        Assert.assertEquals(actual,expected,"they are NOT same");

        String uplodedFileName= driver.findElement(By.cssSelector("#uploaded-files")).getText();
        String expectedFileName= "New Text Document.txt";
        Assert.assertEquals(uplodedFileName,expectedFileName,"They are NOT same");

        driver.quit();

    }

}
