package com.practice.visa;

/**
 * Created by dabidi on 8/11/19.
 */
public class Division {
    public static void main(String[] args) {
        Division app = new Division();
        int numerator = 0;
        int divisor = 2;
        System.out.println("result => "+app.division( numerator, divisor));
    }

    private int division(int numerator, int divisor) {
        if(numerator == 0){
            return 0;
        }
        if(divisor == 0){
            return Integer.MAX_VALUE;
        }
        boolean negativeResult = false;

        if(numerator < 0){
            numerator = -numerator;
            if(divisor < 0 ){
                divisor = -divisor;
            }else{
                negativeResult = true;
            }
        }else if(divisor < 0){
            divisor = -divisor;
            negativeResult = true;
        }

        int result = 0;
        while (numerator >= divisor){
            numerator = numerator - divisor;
            result++;
        }
        if(negativeResult){
            result = -result;
        }

        return result;
    }
}
