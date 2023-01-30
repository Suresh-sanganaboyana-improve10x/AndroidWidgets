package com.example.andoridwidgets.checkbox;

import junit.framework.TestCase;

import org.junit.Assert;

public class CheckBoxControllerImplTest extends TestCase {

    public void testOrderDetails() {
        String expectedOutput = "Selected Items : \nPizza : 100Rs\nCoffee : 50Rs\nTotal : 150Rs";
        String actualOutput = new CheckBoxControllerImpl().orderDetails(true, true, false);
        Assert.assertEquals(expectedOutput,actualOutput);
    }
}