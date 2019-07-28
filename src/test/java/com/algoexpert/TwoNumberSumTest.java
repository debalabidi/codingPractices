package com.algoexpert;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by dabidi on 7/27/19.
 */
public class TwoNumberSumTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testForNotMatchingTargetWithTwoValues() throws Exception{
        int[] inputArray = new int[] {10, 11};
        int[] expectOutput = new int[2];
        int inputTargetSum = 5;
        assertEquals(expectOutput.length, (TwoNumberSum.twoNumberSum(inputArray, inputTargetSum)).length);
    }

    @Test
    public void testForMatchingTargetValue() throws Exception{
        int[] expectOutput = new int[] {1, 4};
        int[] inputArray = new int[] {4,6,1};
        int inputTargetSum = 5;
        int [] actualResult = TwoNumberSum.twoNumberSum(inputArray, inputTargetSum);
        System.out.println(Arrays.toString(actualResult));
        assertTrue(Arrays.equals(expectOutput, actualResult));


    }

    @Test
    public void testForEmptyArrayReturned()throws Exception{
        int[] expectedOutput = {};
        int[] inputArray = new int[] {-21,301,12,4,65,56, 210,356,9,-47};
        int inputTargetSum = 164;
        int [] actualResult = TwoNumberSum.twoNumberSum(inputArray, inputTargetSum);
        assertTrue(Arrays.equals(expectedOutput, actualResult));

    }

}