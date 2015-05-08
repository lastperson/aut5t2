package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Oleksii on 4/6/2015.
 */
public class AngelFirst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/MyWork/AUT5/chromedriver.exe");

        WebDriver h = new ChromeDriver();

        h.manage().window().maximize();

        h.get("http://angel.net/~nic/passwd.current.html");

        System.out.println(genPass(h, "12345678", "gmail.com"));
        System.out.println(genPass(h, "newpass", "skype"));
        System.out.println(genPass(h, "helloo", "2ch.hk"));
    }
    public static String genPass(WebDriver w, String p, String s) {
        WebElement m = w.findElement(By.name("master"));
        m.clear();
        m.sendKeys(p);
        WebElement sn = w.findElement(By.name("site"));
        sn.clear();
        sn.sendKeys(s, Keys.ENTER);
        return w.findElement(By.name("password")).getAttribute("value");
    }
}
