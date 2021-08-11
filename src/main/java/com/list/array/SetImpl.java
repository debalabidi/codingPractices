package com.list.array;

/**
 * Created by dabidi on 7/5/21.
 */
public class SetImpl {
    private int[] arrayImpl = null;
    private int count = 0;

    public SetImpl(){
        arrayImpl = new int[10];
    }

    public SetImpl (int size){
        arrayImpl = new int[size];
    }

    public void addElement(int item) {
        boolean add = true;
        for (int i = 0; i < this.arrayImpl.length; i++) {
            if(this.arrayImpl[i] == item){
                add = false;
            }
        }
        if(add){
            arrayImpl[count] = item;
            count++;
        }

    }

    public int[] getSetImpl(){
        return arrayImpl;
    }
}
