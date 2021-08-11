package com.practice.leetcode.ebay;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by dabidi on 8/1/19.
 */
public class NextPermutationTest {
    private NextPermutation app ;
    @Before
    public void setUp() throws Exception {
        app = new NextPermutation();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPermutation1 () throws Exception{
        int input[] = new int []{1,2,3};
        int expected[] = new int []{1,3,2};
        app.nextPermutation(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

    @Test
    public void testPermutation2 () throws Exception{
        int input[] = new int []{1,3,2};
        int expected[] = new int []{2,1,3};
        app.nextPermutation(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

}