package com.practice.concept;

/**
 * Created by dabidi on 8/25/19.
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        //[]
        //[1 2] = correct

        //[1 1 2 2 2 3 3 4]
        //[1 1 2 2 2 3 4 4]
        //[1 1 1 2]
        //[1 2 2 3]
        int length = nums.length;//3
        if(length == 0){
            return 0;
        }
        int currentValue = nums[0]; //1
        int counter = 1;
        boolean isDup = false;
        int insertionIndex = 0;
        //[1 1 2]
        while(counter <= length-1){ //  counter = 1+1, length-1= 2
            if(currentValue == nums[counter]){ // cv = 1 , nums = 2,  ii= 2, lenght = 3-1
                isDup = true;
                insertionIndex = counter;
                length--;
                counter++;
            }else{
                int temp = nums[counter];
                nums[insertionIndex] = temp;//[1, 2]
                insertionIndex++; //
                isDup = false;
                currentValue = nums[counter];
                counter++;
            }
        }


        return length;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2};
        removeDuplicates(array);

    }
}
