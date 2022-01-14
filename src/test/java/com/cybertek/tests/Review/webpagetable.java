package com.cybertek.tests.Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class webpagetable {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }

//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);   //table[@id='table1']//th
//        driver.quit();
//    }

    @Test
    public void Test1(){

        WebElement firstRow=driver.findElement(By.xpath("(//tbody)[1]/tr[1]"));
        List<WebElement> totaltRow=driver.findElements(By.xpath("(//tbody)[1]/tr[1]/td"));
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("rows.size() = " + rows.size());
        for (WebElement row : rows) {
            System.out.println("row.getText() = " + row.getText());

        }

        List<WebElement> col=driver.findElements(By.xpath("//table[@id='table1']//tr[1]/td"));
        col.size();
        for (WebElement element : col) {
            System.out.println("element.getText() = " + element.getText());

        }
        String[][] array= new String[5][7];
        String str;

        for (int i = 1; i < rows.size(); i++) {
            for (int j = 1; j < col.size()+1; j++) {
              array[i][j]= driver.findElement(By.xpath("//table[@id='table1']//tr[" + i + "]/td[" + j + "]")).getText();
                System.out.println("array[i][j] = " + array[i][j]);
            }

        }



        List<WebElement> totalRow = driver.findElements(By.xpath("(//tbody)[1]/tr[1]/td"));

        for (WebElement element : totalRow) {
             System.out.println("element.getText() = " + element.getText());

         }

         System.out.println("firstRow.getText() = " + firstRow.getText());


        }

















    }




