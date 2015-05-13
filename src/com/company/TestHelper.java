package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Oleksii on 4/22/2015.
 */
public class TestHelper {
    public static WebDriver driver;

    public static void init() {
        System.setProperty("webdriver.chrome.driver",
                "/usr/local/bin/chromedriver");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--lang=ruRU");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
    }
}

