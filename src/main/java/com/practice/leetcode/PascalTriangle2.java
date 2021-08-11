package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by dabidi on 10/4/19.
 */
public class PascalTriangle2 {
    public static void main(String[] args) {
        PascalTriangle2 app = new PascalTriangle2();
        List<Integer> result = app.getRow(4);
        System.out.println(Arrays.toString(result.toArray()));
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        getRowHelper(0, 0, rowIndex , result , 0, 0);
        return result;

    }
    //[1],[1,1],[1,2,1],[1,3,3,1]
    //currentRow = 4
    // rowIndex = 1
    // row = 3
    // p1 = 1, p2 = 3, temp = 3
    //output =[1,3, 5, 1]
    public void getRowHelper(int currentRow, int rowIndex,  int row, List<Integer> result, int previousVal1, int previousVal2){
        if(currentRow > row){
            return ;
        }else if (currentRow == rowIndex){
            result.add(rowIndex, 1);
            if(currentRow == 1 && rowIndex == 1){
                previousVal1 = 1;
                previousVal2 = 1;
            }else if (currentRow > 1){
                previousVal1 = result.get(0);
                previousVal2 = result.get(1);
            }
            currentRow++;
            rowIndex = 1;

        }else{
            int temp1 = 0;
            int temp2 = 0;
            if(currentRow >= 3 && rowIndex != currentRow-1){
                temp1 = result.get(rowIndex);
                temp2 = result.get(rowIndex+1);
            }
            int temp = previousVal2;
            result.set(rowIndex, previousVal1+previousVal2);
            if(currentRow >= 3){
                previousVal1 = temp1;
                previousVal2 = temp2;
            }else{
                previousVal1 = temp;
                previousVal2 = result.get(rowIndex-1);
            }

            rowIndex++;

        }
        getRowHelper(currentRow, rowIndex, row, result, previousVal1, previousVal2);
    }
}
