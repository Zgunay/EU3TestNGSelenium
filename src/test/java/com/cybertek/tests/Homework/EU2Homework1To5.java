package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class EU2Homework1To5 {
   WebDriver driver;
  @BeforeMethod
    public void start(){
      driver= WebDriverFactory.getDriver("edge");
      driver.get("https://practice-cybertekschool.herokuapp.com/");
      WebElement  registration = driver.findElement(By.linkText("Registration Form"));
      registration.click();


  }

  @AfterMethod
    public void finish() throws InterruptedException {
      Thread.sleep(3000);
        driver.quit();
  }

  @Test
    public void test1(){
    WebElement birthday = driver.findElement(By.name("birthday"));
    birthday.sendKeys("wrong_dob");
    WebElement verify= driver.findElement(By.xpath("//small[contains(text(),'The date of birth is not valid')]"));
     String actualText= verify.getText();
     String expectedText="The date of birth is not valid";
      System.out.println("verify.getText() = " + verify.getText());
      Assert.assertTrue(actualText.equals(expectedText),"Verify ");
  }

    @Test
    public void test2(){

     Boolean C = driver.findElement(By.xpath("//label[.='C++']")).isDisplayed();
     Boolean Java= driver.findElement(By.xpath("//label[.='Java']")).isDisplayed();
     Boolean JavaScript= driver.findElement(By.xpath("//label[.='JavaScript']")).isDisplayed();

     Assert.assertTrue(C,"C is not displayed");
     Assert.assertTrue(Java,"C is not displayed");
     Assert.assertTrue(JavaScript,"C is not displayed");

    }
@Test
    public void test3(){

      WebElement inputbox = driver.findElement(By.name("firstname"));

      inputbox.sendKeys("a");
      WebElement textverify= driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']"));
      String text= textverify.getText();
      String expectedText= "first name must be more than 2 and less than 64 characters long";
      Assert.assertTrue(text.equals(expectedText),"is NOT same");

}

@Test
    public void test4(){
    WebElement inputbox = driver.findElement(By.name("lastname"));

    inputbox.sendKeys("a");
    WebElement textverify= driver.findElement(By.xpath("//small[.='The last name must be more than 2 and less than 64 characters long']"));
    String text= textverify.getText();
    String expectedText= "The last name must be more than 2 and less than 64 characters long";
    Assert.assertTrue(text.equals(expectedText),"is NOT same");

}

@Test
    public void test5(){
    WebElement name = driver.findElement(By.name("firstname"));
    name.sendKeys("Ziya");
    WebElement surname = driver.findElement(By.name("lastname"));
    surname.sendKeys("Gunay");
    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("Ziyagunay");
    WebElement email = driver.findElement(By.name("email"));
    email.sendKeys("abcd@gmail.com");
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("abcd@1234");
    WebElement phone = driver.findElement(By.name("phone"));
    phone.sendKeys("571-234-6789");

    WebElement birthday = driver.findElement(By.name("birthday"));
    birthday.sendKeys("08/22/1973");
    WebElement gender = driver.findElement(By.xpath("//*[@value='male']"));
    gender.click();
    WebElement programlanguage = driver.findElement(By.xpath("//*[@value='java']"));
    programlanguage.click();

    WebElement department= driver.findElement(By.name("department"));

    Select Department= new Select(department);
    List<WebElement> options = Department.getOptions();
    System.out.println("options.size() = " + options.size());

    for (WebElement depart : options) {
        System.out.println("depart = " + depart.getText());

    }
    options.get(1).click();

    WebElement JobTitle= driver.findElement(By.name("job_title"));
    Select job=new Select(JobTitle);
    List<WebElement> jobs = job.getOptions();

    System.out.println("jobs.size() = " + jobs.size());
    for (WebElement JOBS : jobs) {
        System.out.println("JOBS.getText() = " + JOBS.getText());
    }

jobs.get(4).click();


    WebElement Signup = driver.findElement(By.cssSelector("#wooden_spoon"));
    Signup.click();

    WebElement result=driver.findElement(By.xpath("//p"));
    String actualText= result.getText();
    String expectedText="You've successfully completed registration!";
    Assert.assertTrue(expectedText.equals(actualText),"Message is NOT same");

}



}
