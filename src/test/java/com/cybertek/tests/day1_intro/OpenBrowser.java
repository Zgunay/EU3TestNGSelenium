package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowser {
    public static void main(String[] args) {
     //  WebDriverManager.chromedriver().setup();
       // WebDriver driver=new ChromeDriver();
      //  driver.get("https://cybertekschool.com");

        WebDriverManager.operadriver().setup();
        WebDriver driver = new OperaDriver();
        driver.get("http://www.google.com");

    }
}
