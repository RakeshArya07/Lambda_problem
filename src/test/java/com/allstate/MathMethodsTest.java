package com.allstate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 03/01/17.
 */
public class MathMethodsTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAverage(){
        int[] list = {3,1,7,3};
        MathMethods mathMethods = new MathMethods(list);
        assertEquals(3.5, mathMethods.findAverage().getAsDouble(), 0.1);
    }

    @Test
    public void getMedian(){
        int[] list = {3,1,7,3};
        MathMethods mathMethods = new MathMethods(list);
        assertEquals(3, mathMethods.findMedian().getAsDouble(), 0.1);
    }
}