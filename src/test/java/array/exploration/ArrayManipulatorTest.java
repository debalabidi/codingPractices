package array.exploration;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by dabidi on 7/4/21.
 */
public class ArrayManipulatorTest {
    private ArrayManipulator arrayManipulator = null;
    private int arraySize = 0;
    @Before
    public void setUp() throws Exception {
        arrayManipulator = new ArrayManipulator();
    }

    @After
    public void tearDown() throws Exception {
        arrayManipulator = null;
        arraySize = 0;
    }

    @Test
    public void addToEndOfArray() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{1,2,3,4,5};

        int[] result = arrayManipulator.addElement(inputArray, 5, 5);
        assertArrayEquals(expectedArray, result);
    }
    @Test
    public void addToMiddleOfArray()throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{1,2,5,3,4};
        int[] result = arrayManipulator.addElement(inputArray, 3, 5);
        assertArrayEquals(expectedArray, result);

    }
    @Test
    public void addToBeginningOfArray() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{5,1,2,3,4};
        int[] result = arrayManipulator.addElement(inputArray, 1, 5);
        assertArrayEquals(expectedArray, result);
    }

    @Test
    public void deleteElementFromArrayEnd() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{1,2,3};
        int [] result = arrayManipulator.delete(inputArray, 4);
        assertArrayEquals(expectedArray, result);

    }

    @Test
    public void deleteElementFromArrayMiddle() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{1,2,4};
        int [] result = arrayManipulator.delete(inputArray, 3);
        assertArrayEquals(expectedArray, result);

    }

    @Test
    public void deleteElementFromArrayBeginning() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{2,3,4};
        int [] result = arrayManipulator.delete(inputArray, 1);
        assertArrayEquals(expectedArray, result);
    }

    @Test(expected = Exception.class)
    public void deleteElementFromNonExistingPosition() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{2,3,4};
        int [] result = arrayManipulator.delete(inputArray, 8);

    }

    @Test
    public void searchExistingElementInArray() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{5,1,2,3,4};
        boolean result = arrayManipulator.search(inputArray, 3);
        assertTrue(result);
    }

    @Test
    public void searchNonExistingElementInArray() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        assertFalse(arrayManipulator.search(inputArray, 8));
    }

    @Ignore
    @Test
    public void increaseSizeOfArray() throws Exception{
        int [] inputArray = new int[]{1,2,3,4};
        int [] expectedArray = new int[]{5,1,2,3,4};
        assertArrayEquals(expectedArray, inputArray);
    }
}