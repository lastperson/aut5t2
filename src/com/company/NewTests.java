package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NewTests {
    @Test
    public void test1() {
        Assert.fail();
    }

    @Test
    public void test2() {
        int a = 10;
        int b = 5;
        int expectedResult = 15;
        Assert.assertEquals("Expected results didn't match.", expectedResult, a + b);
        Assert.assertTrue(expectedResult == (a + b));
    }
}
