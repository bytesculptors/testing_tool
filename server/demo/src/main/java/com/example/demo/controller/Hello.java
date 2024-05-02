package com.example.demo.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Hello {
    WebDriver driver;
    @BeforeMethod
    public void Setup() {
        System.out.println("Setup method");
        // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void Run() {
        Setup();
        driver.get("https://www.saucedemo.com/");
        sleep(3000);
        CleanUp();
    }
    @AfterMethod
    public void CleanUp() {
        System.out.println("After method");
        driver.quit();
    }
    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public String say() {
        return "This is a test message";
    }
}
