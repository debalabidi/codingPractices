package com.practice.leetcode;

/**
 * Created by abidi on 7/28/19.
 */
public class AddStringsWithoutIntegerClass {
    public String addStrings(String num1, String num2) {
        for(int i = 0; i < num1.length(); i++){
            int x = num1.charAt(i);
            System.out.println("x = " + x);
        }
        return null;
    }

    public static void main(String[] args) {
        AddStringsWithoutIntegerClass app = new AddStringsWithoutIntegerClass();
        app.addStrings("11", "22");
    }
}
