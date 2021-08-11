package array.exploration;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by dabidi on 7/5/21.
 */
public class TestingClass {
    public static void main(String[] args) {
        TestingClass myapp = new TestingClass();
        myapp.execute();
    }
    //debal
    public void execute(){
        int[] arrayTest = new int[10] ;
        for (int i = 0; i < arrayTest.length; i++) {
            System.out.println("arrayTest = " + arrayTest[i]);
        }
    }




}
