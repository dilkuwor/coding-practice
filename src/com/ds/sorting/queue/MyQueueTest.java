package com.ds.sorting.queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(16);
        q.enqueue(10);
        q.enqueue(12);;
        q.enqueue(234);

        int p = q.peek();
        System.out.println(p);
    }
}
