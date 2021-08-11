package array.exploration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dabidi on 7/5/21.
 */
public class SetImplTest {
    private SetImpl setImplManipulator = null;
    @Before
    public void setUp() throws Exception {
        setImplManipulator = new SetImpl();
    }

    @After
    public void tearDown() throws Exception {
        setImplManipulator = null;
    }

    @Test
    public void addElement() throws Exception{
        setImplManipulator = new SetImpl(4);

        int [] expectedResult = {5,10,15,20};
        setImplManipulator.addElement(5);
        setImplManipulator.addElement(10);
        setImplManipulator.addElement(15);
        setImplManipulator.addElement(20);
        int[] result = setImplManipulator.getSetImpl();
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void addDuplicateElement() throws Exception{
        setImplManipulator = new SetImpl(4);

        int [] expectedResult = {5,10,15,20};
        setImplManipulator.addElement(5);
        setImplManipulator.addElement(10);
        setImplManipulator.addElement(15);
        setImplManipulator.addElement(20);
        setImplManipulator.addElement(20);

        int[] result = setImplManipulator.getSetImpl();
        assertArrayEquals(expectedResult, result);
    }

}