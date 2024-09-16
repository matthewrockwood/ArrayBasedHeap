package org.example;

public class Heap {
    private int[] data;
    private int size;
    private int length = 0;

    Heap(){
        data = new int[100];
        this.size = 0;
    }
    Heap(int size){
        data = new int[size];
        this.size = size;
    }
    private int getParentIndex(int index){
        return index-1/2;
    }
    private int getLeftChildIndex(int index){
        return 2 * index +1;
    }
    private int getRightChildIndex(int index){
        return 2*index+2;
    }
    private void swap(int index1, int index2){
    int temp = index1;
    data[index1] = data[index2];
    data[index2] = temp;
    }
    private void heapifyUp(int index){

        while(data[getParentIndex(index)]>data[index]){
            swap(index,getParentIndex(index));
            index = getParentIndex(index);
            if(index==0) return;
        }
    }
    public void add(int item){
        data[length] = item;

    }
}
