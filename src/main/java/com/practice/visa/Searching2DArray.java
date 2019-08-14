package com.practice.visa;


/**
 * Created by dabidi on 8/11/19.
 */
public class Searching2DArray {
    private static int[][] input = {
            {2,6,7,11},
            {3,8,10,12},
            {4,9,11,13},
            {5,15,16,18}
    };
    public static void main(String[] args) {
        Searching2DArray app = new Searching2DArray();
        int target = 18;
        System.out.println(app.search2DArrayUsingStairs(input, target));;



    }
    public Indexes search2DArrayUsingStairs(int[][] array, int target){
        int row = 0;
        int col = array[0].length-1;
        System.out.println("array[row][col] = " + array[row][col]);
        while (row <= (array.length-1) && col >=0){
            if(array[row][col] == target){
                return new Indexes(row, col);
            }
            if(array[row][col] > target){
                col--;
            }else{
                row++;
            }

        }
        return null;
    }

    public class Indexes{
        int row;
        int col;
        public Indexes (int x, int y){
            row = x;
            col = y;
        }

        @Override
        public String toString() {
            return "Indexes{" +
                    "row=" + row +
                    ", col=" + col +
                    '}';
        }
    }

}
