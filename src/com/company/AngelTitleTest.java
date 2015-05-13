package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

@RunWith(JUnit4.class)
public class AngelTitleTest {
    @Test
    public void refactoredTest() {
        Assert.assertEquals("Password generator", TestHelper.driver.getTitle());
        Assert.assertEquals("你好", "asdasd");
    }
    @After
    public void init() {
        TestHelper.driver.quit();
    }
    @Before
    public void cleanup() {
        TestHelper.init();
        GenPassPage.open();
    }
}
