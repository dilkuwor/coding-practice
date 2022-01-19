package com.ds.sorting.queue;

public class MyQueue implements Queue{
    int[] array;
    int front;
    int rear;
    int count;
    int capacity;

    public MyQueue(int size){
        array = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    @Override
    public void enqueue(int a) {
        if(isFull()){
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Inserting "+a);
        rear = (rear + 1)%capacity;
        array[rear] = a;
        count++;
    }

    @Override
    public int dequeue() {
        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        int item = array[front];
        System.out.println("Removing "+item);
        front = (front+1)%capacity;
        count --;
        return item;
    }

    @Override
    public int peek() {
        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
       return array[front];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean isFull() {
        return size() == capacity;
    }

    @Override
    public int size() {
        return count;
    }
}
