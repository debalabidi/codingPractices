package com.practice.leetcode.visa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by dabidi on 8/6/19.
 */
public class AsteroidCollisionTest {
    private AsteroidCollision instance;
    @Before
    public void setUp() throws Exception {
        instance = new AsteroidCollision();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSimpleCollision() throws Exception{
        int [] inputArray = new int[]{5, 10, -5};
        int [] expectedArray = new int[]{5, 10,};
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(instance.asteroidCollision(inputArray)));

    }

    @Test
    public void testSimpleCollision2() throws Exception{
        int [] inputArray = new int[]{10, 2, -5};
        int [] expectedArray = new int[]{10};
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(instance.asteroidCollision(inputArray)));

    }

    @Test
    public void testSimpleCollision3() throws Exception{
        int [] inputArray = new int[]{-2,-2,1,-1};
        int [] expectedArray = new int[]{-2,-2};
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(instance.asteroidCollision(inputArray)));

    }

    @Test
    public void testSimpleCollision4() throws Exception{
        int [] inputArray = new int[]{8, -8};
        int [] expectedArray = new int[]{};
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(instance.asteroidCollision(inputArray)));

    }

    @Test
    public void testSimpleCollision5() throws Exception{
        int [] inputArray = new int[]{-2,-2,1,-2};
        int [] expectedArray = new int[]{-2,-2,-2};
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(instance.asteroidCollision(inputArray)));

    }

    @Test
    public void testSimpleCollision6() throws Exception{
        int [] inputArray = new int[]{1,-2,-2,-2};
        int [] expectedArray = new int[]{-2,-2,-2};
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(instance.asteroidCollision(inputArray)));

    }

}