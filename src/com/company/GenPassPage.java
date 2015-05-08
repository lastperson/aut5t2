package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Oleksii on 4/22/2015.
 */
public class GenPassPage {
    public static void setField(String fieldName, String value){
        TestHelper.driver.findElement(By.xpath("")).sendKeys(value);
    }

    public static void generate(){

    }

    public static String getField(String fieldName) {
        return "";
    }

    public static void open() {
        TestHelper.driver.get("http://oxogamestudio.com/passwd.current4.htm");
    }
}
