package com.practice.concept;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by dabidi on 8/23/19.
 */
public class IntArray {
    public static void main(String[] args) {
        int[] array = {3,2,4};
        int target = 6;
        final int[] ints = twoSum(array, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seenValues = new HashMap<Integer, Integer>();
        //0,1,2
        int[] result = new int[2]; //3,2,4

        for(int i = 0; i < nums.length; i++){ //t = 6
            int value = target - nums[i]; //6-4 = 2
            if(seenValues.containsKey(value)){
                result[0] = seenValues.get(value); //1, 2
                result[1] = i;
            }else{
                seenValues.put(nums[i], i);
                //3, 0
                //2, 1
            }
        }
        return result;
        // we are returning an index of the array. So therefore i rather not sort.
        // so lets do some test cases:
        // [ 10, 5, 25, 20] 25  == 25 - 10 = 15
        // [ 10, 5, 25, 20] 25  == 25 - 5 = 20
        // [ 10, 5, 25, 20] 25  == 25 - 25 = 0
        // [ 10, 5, 25, 20] 25  == 25 - 20 = 5
    }
}
