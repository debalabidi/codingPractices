package com.practice.visa;

/**
 * Created by dabidi on 8/15/19.
 */
public class MyCircularQueue {

    // Testcase #1

    private int[] qArray = null;
    private int size = 0;

    private int head = -1;
    private int tail = -1;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        qArray = new int[k];
        size = qArray.length-1;

    }
    //head = 0 , tail = 0
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(head == -1){
            head++;
        }
        if(isFull()){
            return false;
        }else{
            qArray[++tail] = value;
        }
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
       return false;

    }

    /** Get the front item from the queue. */
    public int Front() {
      return qArray[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
      return qArray[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() { // head = 1 , tail = 2,  tail = 0 head = 2
        if(head == tail && head == -1)
            return true;
       return false;

    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (tail == size) ? true : false;
    }

    public static void main(String[] args) {
        int k = 3;

        try{
            MyCircularQueue circularQueue = new MyCircularQueue(k);
            System.out.println(circularQueue.enQueue(1));  // return true
            System.out.println(circularQueue.enQueue(2));  // return true
            System.out.println(circularQueue.enQueue(3));  // return true
            System.out.println(circularQueue.enQueue(4));  // return false, the queue is full
            System.out.println(circularQueue.Rear());  // return 3
            System.out.println(circularQueue.isFull());  // return true
            System.out.println(circularQueue.deQueue());  // return true
            System.out.println(circularQueue.enQueue(4));  // return true
            System.out.println(circularQueue.Rear());  // return 4
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public int size() {
        return size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
