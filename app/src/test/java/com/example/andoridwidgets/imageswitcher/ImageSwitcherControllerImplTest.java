package com.example.andoridwidgets.imageswitcher;

import junit.framework.TestCase;

import org.junit.Assert;

public class ImageSwitcherControllerImplTest extends TestCase {

    public void testGetImageNextPosition() {
        int expectedOutput = 0;
        int actualOutput = new ImageSwitcherControllerImpl().getImageNextPosition(2, 3);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}