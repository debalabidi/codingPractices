package com.practice.visa;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dabidi on 8/10/19.
 */
public class Permutation {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        final String input = "ABC";
        int[] array = {1,2,3};
//        ArrayList<int[]> resultInt = new ArrayList<>();
//        permutationString("", input);
//        System.out.println(result.toString());
//        permutationOfArray(input, 0, input.length()-1);
//        permute(input, 0, input.length()-1);
//        resultInt = permutationInt(array, 0, resultInt);
//        for (int[] i : resultInt){
//            System.out.println(Arrays.toString(i));
//        }ring

        permutationOfString(input);
    }

    static void permutationOfString (String input ){
        List<String> result = new ArrayList<>();
        permutationHelper(0, input.toCharArray(), result);
        for(String item : result){
            System.out.println("item = " + item);
        }
    }

    static void permutationHelper(int index, char[] input, List<String> result){
        if( index == input.length){
            result.add(Arrays.toString(input.clone()));
        }else{
            for(int j = index; j < input.length; j++){
                swapChars(input, index, j);
                permutationHelper(index+1, input, result);
                swapChars(input, index, j);
            }
        }
    }

    private static void swapChars(char[] input, int index, int j) {
        char temp = input[index];
        input[index] = input[j];
        input[j] = temp;

    }


    static ArrayList<int[]> permutationInt(int[] array, int i, ArrayList<int[]> resultInt){
        if(i == array.length){
            resultInt.add(array.clone());
        }else{
            for(int x = i; x < array.length; x++){
                array = swap(array, i, x);
                permutationInt(array, i+1, resultInt);
                array = swap(array, i, x);

            }
        }
        return resultInt;
    }

    static int[] swap(int[] array, int i , int x){
        int temp = array[i];
        array[i] = array[x];
        array[x] = temp;
        return array;
    }


    static void permutationString (String prefix, String suffix){
            if(suffix.length() == 0){
                System.out.println(prefix);
//                result.add(prefix);
            }else{
                for(int i = 0; i < suffix.length(); i++){
                    final String currentPrefix = prefix + suffix.charAt(i);
                    final String suffixPerm = suffix.substring(0, i) + suffix.substring(i + 1, suffix.length());
                    permutationString(currentPrefix, suffixPerm );

                }
            }
    }

    static void permutationOfArray(String input, int low, int high){
        if(low == high){
            System.out.println(input);
        }else{
            for(int i = low; i <= high; i++){
                input = swapMine(input, low, i);
//                System.out.println("input First swap = " + input);
                permutationOfArray(input, low+1, high);
//                input = swapMine(input, low, i);
//                System.out.println("input Second swap = " + input);


            }

        }

    }

    private static String swapMine(String input, int low, int i) {
        char temp ;
        char[] charArray = input.toCharArray();
        temp = charArray[low];
        charArray[low] = charArray[i];
        charArray[i] = temp ;
        return String.valueOf(charArray);
    }

    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


}
