package com.algoexpert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dabidi on 7/27/19.
 */
public class BSTTest {
    private BST instance ;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void checkBSTIsNotNull() throws Exception{
        instance = new BST(5);
        assertNotNull(instance);
    }

    @Test
    public void checkDoesNotContainValue() throws Exception{
        instance = new BST(10);
        assertFalse(instance.contains(5));
    }

    @Test
    public void addFirstBSTNode() throws Exception{
        int inputValue = 10;
        instance = new BST(inputValue);
        assertTrue( instance.contains(10));
    }

    @Test
    public void insertLeftElementWithLeafCondition() throws Exception{
        instance = new BST(10);
        instance.insert(5);
        assertTrue(instance.contains(5));
    }

    @Test
    public void insertRightElementWithLeafCondition() throws Exception{
        instance = new BST(10);
        instance.insert(15);
        assertTrue(instance.contains(15));
    }


    @Test
    public void insertTwoLeftElements() throws Exception{
        instance = new BST (10);
        instance.insert(8);
        instance.insert(5);
        assertTrue(instance.contains(8));

        assertTrue(instance.contains(5));

    }

    @Test
    public void insertTwoRightElements() throws Exception{
        instance = new BST (10);
        instance.insert(15);
        instance.insert(20);
        assertTrue(instance.contains(20));

        assertTrue(instance.contains(15));

    }

    @Test
    public void insertLeftAndRightAndLeftElement()throws Exception{
        instance = new BST(10);
        instance.insert(5);
        instance.insert(15);
        instance.insert(2);
        assertTrue(instance.contains(10));
        assertTrue(instance.contains(5));
        assertTrue(instance.contains(15));
        assertTrue(instance.contains(2));

    }

    @Test
    public void removeHeadElement() throws Exception{
        instance = new BST(10);
        instance.remove(10);
        assertFalse(instance.contains(10));
    }

    @Test
    public void removeLeftElement() throws Exception{
        instance = new BST(10);
        instance.insert(5);
        instance.remove(5);
        assertFalse(instance.contains(5));
    }

    @Test
    public void remove2DeepLeftElement() throws Exception{
        instance = new BST(10);
        instance.insert(5);
        instance.insert(2);
        instance.remove(2);

        assertFalse(instance.contains(2));
        assertTrue (instance.contains(5));
        assertTrue (instance.contains(10));

    }

    @Test
    public void remove2DeepRightElement() throws Exception{
        instance = new BST(10);
        instance.insert(15);
        instance.insert(20);
        instance.remove(20);

        assertFalse(instance.contains(20));
        assertTrue (instance.contains(15));
        assertTrue (instance.contains(10));

    }

    @Test
    public void removeMiddleLeftElement()throws Exception{
        instance = new BST(10);
        instance.insert(5);
        instance.insert(15);
        instance.insert(2);
        instance.remove(5);
        assertTrue(instance.contains(15));
        assertTrue(instance.contains(10));
        assertFalse(instance.contains(5));
        assertTrue(instance.contains(2));


    }





//    @Test
//    public void insert() throws Exception {
//
//    }
//
//    @Test
//    public void contains() throws Exception {
//
//    }
//
//    @Test
//    public void remove() throws Exception {
//
//    }

}