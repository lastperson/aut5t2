package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Oleksii on 4/22/2015.
 */
public class TestHelper {
    public static WebDriver driver;

    public static void init() {
        System.setProperty("webdriver.chrome.driver",
                "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}

