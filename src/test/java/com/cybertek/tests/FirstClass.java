package com.cybertek.tests;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    public static void main(String[] args) {

        System.out.println(" Hello World " );

        Faker faker =new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.harryPotter().character());
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.yahoo.com");
        System.out.println(driver.getTitle());

    }
}
