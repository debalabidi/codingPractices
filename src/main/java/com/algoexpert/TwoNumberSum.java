package com.algoexpert;

import java.util.Arrays;

/**
 * Created by dabidi on 7/27/19.
 */
public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int startPosition = 0;
        int endPosition = array.length-1;
        boolean loop = true;
        int firstValue = 0;
        int secondValue = 0;
        int sum = 0;

        while (loop){
            firstValue = array[startPosition];
            secondValue = array[endPosition];
            sum = firstValue + secondValue;
            if( sum == targetSum){

                loop = false;
                return new int[]{firstValue, secondValue};

            }else if ( sum > targetSum ){

                endPosition--;
                if(startPosition == endPosition){
                    return new int[] {};

                }
            }else{
                startPosition++;
                if(startPosition == endPosition){
                    return new int[] {};
                }
            }
        }
        return new int[] {};
    }
}
