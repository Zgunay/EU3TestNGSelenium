package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.youtube.com");
        Thread.sleep(5000);
        driver.get("https://www.youtube.com/open_new_tab");
        driver.quit();
        driver=new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");

        driver.navigate().back();
        driver.close();
    }
}
