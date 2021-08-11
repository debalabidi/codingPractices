package com.list.array;

/**
 * Created by dabidi on 7/4/21.
 */
public class ArrayManipulator {

    public int[] addElement(int[] inputArray, int position, int element) {
        int [] result = null;
        result =  new int[inputArray.length+1];
        if(position >= inputArray.length+1){
            for (int i = 0; i < inputArray.length; i++){
                result[i] = inputArray[i];
            }
            result[inputArray.length] = element;
        }else{
           for (int i = 0; i < result.length; i++){
               if(i == position-1){
                   result[i] = element;
               }else if (i < position - 1){
                   result[i] = inputArray[i];
               }else{
                   result[i] = inputArray[i-1];
               }
           }
        }
        return result;
    }


    public int[] delete(int[] inputArray, int position) throws Exception {
        if(position-1 > inputArray.length){
            throw new Exception("element does not exist on that position");
        }else{

            int[] result = new int[inputArray.length - 1];
            int resultCounter = 0;
            for (int i = 0 ; i < inputArray.length; i++){
                if(i != position -1){
                    result[resultCounter] = inputArray[i];
                    resultCounter++;
                }
            }
            return result;
        }
    }

    public boolean search(int[] inputArray, int searchItem) {
        boolean result = false;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == searchItem){
                result = true;
                break;
            }
        }
        return result;
    }
}
