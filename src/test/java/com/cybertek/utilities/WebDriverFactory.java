package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
            WebDriver driver=null;
        switch(browserType.toLowerCase()){
            case "chrome":
               WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver=new OperaDriver();
                break;
            case"firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case"safari":
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                break;
            case"Iexplorer":
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;

            case"edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;

            default:
        }

      return driver;



    }
}
