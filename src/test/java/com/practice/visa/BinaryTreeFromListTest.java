package com.practice.visa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dabidi on 8/9/19.
 */
public class BinaryTreeFromListTest {
    private List<Integer> inputList = null;
    private BinaryTreeFromList instance = null;
    @Before
    public void setUp() throws Exception {
        instance = new BinaryTreeFromList();
        inputList = new ArrayList<>();

    }

    private void setUpData() {
        inputList.add(5);
        inputList.add(3);
        inputList.add(7);
        inputList.add(3);
        inputList.add(1);
        inputList.add(4);
        inputList.add(7);
        inputList.add(6);
        inputList.add(9);
        inputList.add(1);
        inputList.add(null);
        inputList.add(null);
        inputList.add(4);
        inputList.add(null);
        inputList.add(null);
        inputList.add(6);
        inputList.add(null);
        inputList.add(null);
        inputList.add(9);
        inputList.add(null);
        inputList.add(null);
    }


    private void setUpData2() {
        inputList.add(5);
        inputList.add(3);
        inputList.add(7);
//        inputList.add(3);
        inputList.add(1);
        inputList.add(4);
//        inputList.add(7);
        inputList.add(6);
        inputList.add(9);
        inputList.add(1);
        inputList.add(null);
        inputList.add(null);
        inputList.add(4);
        inputList.add(null);
        inputList.add(null);
        inputList.add(6);
        inputList.add(null);
        inputList.add(null);
        inputList.add(9);
        inputList.add(null);
        inputList.add(null);
    }

    private void setUpData3() {
        inputList.add(5);
        inputList.add(3);
        inputList.add(7);
//        inputList.add(3);
        inputList.add(1);
        inputList.add(4);
//        inputList.add(7);
        inputList.add(6);
        inputList.add(9);
//        inputList.add(1);
//        inputList.add(null);
//        inputList.add(null);
//        inputList.add(4);
//        inputList.add(null);
//        inputList.add(null);
//        inputList.add(6);
//        inputList.add(null);
//        inputList.add(null);
//        inputList.add(9);
//        inputList.add(null);
//        inputList.add(null);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void binaryTreeFromList() throws Exception{
        System.out.println("hello");
        setUpData3();
        instance.constructBSTFromList(this.inputList);

    }

    @Test
    public void returnNullForEmptyList() throws Exception{

        assertNull(instance.constructBSTFromList(this.inputList));
    }

    @Test
    public void returnOneItemInTree() throws Exception{
        this.inputList.add(5);
//        assertEquals(5, instance.constructBSTFromList(inputList).val);
    }

}