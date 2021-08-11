package com.practice.visa;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dabidi on 8/19/19.
 */
public class MyCircularQueueTest {
    private MyCircularQueue app = null;
    /**
     * ["MyCircularQueue","enQueue","Rear","Rear","deQueue","enQueue","Rear","deQueue","Front","deQueue","deQueue","deQueue"]
     [[6],[6],[],[],[],[5],[],[],[],[],[],[]]
     [null,true,6,6,true,true,5,true,-1,false,false,false]
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        app = new MyCircularQueue(3);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void createInstanceOfCircularQueue()throws Exception{
        app = new MyCircularQueue(3);
        assertNotNull(app);
    }

    @Test
    public void sizeOfCircularQueue() throws Exception{
        app = new MyCircularQueue(3);
        int expectedSize = 2;
        assertEquals(expectedSize, app.size());
    }

    @Test
    public void enQueueFirstItem(){
        assertTrue(app.enQueue(1));
        assertEquals(1, app.Rear());
        assertEquals(1, app.Front());
    }
    @Test
    public void enQueueTwoItem(){
        assertTrue(app.enQueue(1));
        assertTrue(app.enQueue(2));
        assertEquals(2, app.Rear());
        assertEquals(1, app.Front());
    }
    @Test
    public void enQueueAllItem(){
        assertTrue(app.enQueue(1));
        assertTrue(app.enQueue(2));
        assertTrue(app.enQueue(3));

        assertEquals(3, app.Rear());
        assertEquals(1, app.Front());
    }

    @Test
    public void QueueFull(){
        assertTrue(app.enQueue(1));
        assertTrue(app.enQueue(2));
        assertTrue(app.enQueue(3));

        assertEquals(3, app.Rear());
        assertEquals(1, app.Front());
        assertTrue(app.isFull());
    }

    @Test
    public void QueueNotFull(){
        assertTrue(app.enQueue(1));
        assertTrue(app.enQueue(2));

        assertEquals(2, app.Rear());
        assertEquals(1, app.Front());
        assertFalse(app.isFull());
    }

    @Test
    public void QueueFullEnQueueFail(){
        assertTrue(app.enQueue(1));
        assertTrue(app.enQueue(2));
        assertTrue(app.enQueue(3));

        assertEquals(3, app.Rear());
        assertEquals(1, app.Front());
        assertTrue(app.isFull());
        assertFalse(app.enQueue(4));
        assertEquals(3, app.Rear());
    }

    @Test
    public void QueueIsEmpty(){
        assertTrue(app.isEmpty());
    }

    @Ignore
    @Test
    public void checkCircularQueueIndex()throws Exception{
        assertEquals(true, app.enQueue(6));
        assertEquals(6, app.Rear());
        assertEquals(6, app.Rear());
        assertEquals(true, app.deQueue());
        assertEquals(true, app.enQueue(5));
        assertEquals(5, app.Rear());
        assertEquals(true, app.deQueue());
        assertEquals(-1, app.Front());
        assertEquals(false , app.deQueue());
        assertEquals(false, app.deQueue());
        assertEquals(false, app.deQueue());

    }

}